package services;

import java.io.InputStream;
import java.util.Map;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.Comunicado;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteService {

    private final Map comunicado;

    public ReporteService(Comunicado comunicado) {
        this.comunicado = comunicado.toMap();
    }

    public void generarReporte() throws JRException {
        try {
            InputStream RUTA_JASPER = getClass().getResourceAsStream("/reportes/comunicado_sr.jasper");
            JasperReport reporte = (JasperReport) JRLoader.loadObject(RUTA_JASPER);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, comunicado);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
