package modelo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

public class Comunicado {

    private String profesor;
    private String modalidad;
    private String curso;
    private String contenido;
    private String hora;
    private String background;
    private EstiloComunicado estilo;
    private BufferedImage minedu;
    private BufferedImage aprendo;

    public Comunicado() throws IOException {
        this.aprendo = ImageIO.read(getClass().getResource("/imagenes/aprendo_en_casa.jpg"));
        this.minedu = ImageIO.read(getClass().getResource("/imagenes/minedu.png"));
    }
    
    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso.toUpperCase();
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public EstiloComunicado getEstilo() {
        return estilo;
    }

    public void setEstilo(EstiloComunicado estilo) {
        this.estilo = estilo;
    }

    public Map toMap() throws IOException {
        Map parametros = new HashMap();
        parametros.put("curso", this.getCurso());
        parametros.put("profesor", this.getProfesor());
        parametros.put("hora", this.getHora());
        parametros.put("contenido", this.getContenido());
        parametros.put("background", this.getBackground());
        parametros.put("modalidad", this.getModalidad());
        parametros.put("minedu", minedu);
        parametros.put("aprendo", aprendo);
        return parametros;
    }

}
