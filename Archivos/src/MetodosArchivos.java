import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MetodosArchivos {
    File archivo;

    public void crearArchivo(String nombreArchivo) {
        archivo = new File("C:\\Users\\eddyo\\OneDrive\\Documentos\\" + nombreArchivo);
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con exito");
            } else {
                System.out.println("Error en crear archivo");
            }
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }

    public void eliminarArchivo(String nombreArchivo) {
        archivo = new File("C:\\Users\\eddyo\\OneDrive\\Documentos\\" + nombreArchivo);
        if (archivo.delete()) {
            System.out.println("Archivo borrado con exito");
        } else {
            System.out.println("Error en borrar archivo");
        }
    }

    public void escribirArchivo(String nombreArchivo, String texto) {
        archivo = new File("C:\\Users\\eddyo\\OneDrive\\Documentos\\" + nombreArchivo);
        try {
            FileWriter escritura = new FileWriter(archivo, true);
            escritura.write(texto);
            escritura.close();
            System.out.println("Texto añadido con exito");
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }
    public void leerArchivo(String nombreArchivo) {
        archivo = new File("C:\\Users\\eddyo\\OneDrive\\Documentos\\" + nombreArchivo);
        String contenido;
        try {
            FileReader leer = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(leer);
            contenido = lectura.readLine();
            while (contenido != null) {
                System.out.println(contenido);
                contenido = lectura.readLine();
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }
    public void openFile(String nombreArchivo){
        archivo = new File("C:\\Users\\eddyo\\OneDrive\\Documentos\\" + nombreArchivo);
        try{
            if (!Desktop.isDesktopSupported()){
                System.out.println("Not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (archivo.exists()){
                desktop.open(archivo);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
