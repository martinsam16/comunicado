package services;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooserService {

    public static String obtenerRutaImagen() {
        JFileChooser ruta = new JFileChooser(System.getProperty("user.dir"));
        ruta.setDialogTitle("Seleccionar imagen");
        ruta.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "png", "jpeg"));
        ruta.showOpenDialog(ruta);
        return ruta.getSelectedFile().getAbsolutePath();
    }
}
