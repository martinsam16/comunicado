package services;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javafx.scene.input.ClipboardContent;
import javax.imageio.ImageIO;
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

    private final Comunicado comunicado;

    public ReporteService(Comunicado comunicado) {
        this.comunicado = comunicado;
    }

    public void generarReporte() throws JRException {
        try {
            InputStream RUTA_JASPER = getClass().getResourceAsStream("/reportes/" + comunicado.getEstilo() + ".jasper");
            JasperReport reporte = (JasperReport) JRLoader.loadObject(RUTA_JASPER);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, comunicado.toMap());
            JasperViewer view = new JasperViewer(jprint, false);

            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
            copiarImagenPortapapeles(jprint);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void copiarImagenPortapapeles(JasperPrint jprint) throws JRException {
        try {
            DefaultJasperReportsContext.getInstance();
            JasperPrintManager printManager = JasperPrintManager.getInstance(DefaultJasperReportsContext.getInstance());

            BufferedImage rendered_image = (BufferedImage) printManager.printPageToImage(jprint, 0, 1.6f);
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(new ImageTransferable(rendered_image), new ClipboardOwner() {
                        public void lostOwnership(Clipboard clipboard, Transferable contents) {
                            System.out.println("Alquien ha reemplazado lo que meti en el Clipboard");
                        }
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
