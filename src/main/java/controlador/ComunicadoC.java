package controlador;

import modelo.Comunicado;
import services.ReporteService;

public class ComunicadoC {

    private Comunicado comunicado;

    private ReporteService reporteService;

    public void generarReporte() {
        try {
            reporteService = new ReporteService(comunicado);
            reporteService.generarReporte();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setComunicado(Comunicado comunicado) {
        this.comunicado = comunicado;
    }

}
