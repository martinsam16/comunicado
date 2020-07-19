package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooserService {

    public static String obtenerRutaImagen() {
        return abrirJFileChooser("Imágenes", "jpg", "png", "jpeg")
                .getSelectedFile()
                .getAbsolutePath();
    }

    public static String importarTexto(String anterior) throws IOException {
        try {
            return new String(
                    Files.readAllBytes(Paths.get(abrirJFileChooser("Texto", "txt")
                            .getSelectedFile()
                            .getAbsolutePath())));
        } catch (Exception e) {
            return anterior;
        }
    }

    private static JFileChooser abrirJFileChooser(String descripcion, String... extensiones) {
        JFileChooser ruta = new JFileChooser(System.getProperty("user.dir"));
        ruta.setDialogTitle("Seleccionar texto");
        ruta.setFileFilter(new FileNameExtensionFilter(descripcion, extensiones));
        ruta.showOpenDialog(ruta);
        return ruta;
    }

    public static void exportarTexto() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
