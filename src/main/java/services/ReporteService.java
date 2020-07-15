package services;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import modelo.Comunicado;
import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import utils.ImageTransferable;

public class ReporteService {

    private JasperPrint jprint;

    public ReporteService(Comunicado comunicado) {
        try {
            initialize(comunicado);
        } catch (JRException e) {
        }
    }

    private void initialize(Comunicado comunicado) throws JRException {
        try {
            InputStream inputStreamReporte = getClass().getResourceAsStream("/reportes/" + comunicado.getEstilo() + ".jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(inputStreamReporte);
            jprint = JasperFillManager.fillReport(jasperReport, comunicado.toMap());
        } catch (Exception e) {
        }
    }

    public void start() {
        int numeroHilos = ManagementFactory.getThreadMXBean().getThreadCount();
        Runnable generarReporte = () -> {
            try {
                generarReporte(jprint);
            } catch (JRException e) {
            }
        };

        Runnable copiarImagenPortapapeles = () -> {
            try {
                copiarImagenPortapapeles(jprint);
            } catch (JRException e) {
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(numeroHilos);
        executor.execute(copiarImagenPortapapeles);
        executor.execute(generarReporte);
        executor.shutdown();
    }

    private void generarReporte(JasperPrint jprint) throws JRException {
        try {
            JasperViewer view = new JasperViewer(jprint, false);
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void copiarImagenPortapapeles(JasperPrint jprint) throws JRException {
        try {
            DefaultJasperReportsContext.getInstance();

            BufferedImage rendered_image = (BufferedImage) JasperPrintManager.printPageToImage(jprint, 0, 1.6f);
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(new ImageTransferable(rendered_image), (Clipboard clipboard, Transferable contents) -> {
                        System.out.println("Alquien ha reemplazado lo que meti en el Clipboard >:v");
                    });

        } catch (JRException | HeadlessException e) {
            e.printStackTrace();
        }
    }

}
