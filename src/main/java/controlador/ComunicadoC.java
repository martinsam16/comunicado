package controlador;

import java.awt.image.BufferedImage;
import modelo.Comunicado;
import services.ReporteService;

public class ComunicadoC {

    private Comunicado comunicado;

    private ReporteService reporteService;

    public void imprimir() {
        try {
            reporteService = new ReporteService(comunicado);
            reporteService.imprimir();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedImage preview() {
        try {
            reporteService = new ReporteService(comunicado);
            return reporteService.generarImagen();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setComunicado(Comunicado comunicado) {
        this.comunicado = comunicado;
    }

}
