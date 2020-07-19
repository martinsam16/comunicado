package services;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.io.InputStream;
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
            e.printStackTrace();
        }
    }

    public BufferedImage generarImagen() throws JRException {
        BufferedImage imagen = generarImagen(jprint);
        copiarImagenPortapapeles(imagen);
        return imagen;
    }

    public void imprimir() throws JRException {
        try {
            JasperViewer view = new JasperViewer(jprint, false);
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private BufferedImage generarImagen(JasperPrint jprint) throws JRException {
        DefaultJasperReportsContext.getInstance();
        return (BufferedImage) JasperPrintManager.printPageToImage(jprint, 0, 1.6f);
    }

    private void copiarImagenPortapapeles(BufferedImage imagen) {
        try {
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(new ImageTransferable(imagen), (Clipboard clipboard, Transferable contents) -> {
                        System.out.println("Alquien ha reemplazado lo que meti en el Clipboard >:v");
                    });
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
    }

}
