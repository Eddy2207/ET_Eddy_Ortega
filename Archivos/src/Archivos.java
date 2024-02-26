import javax.swing.*;
import java.io.*;
import java. util.Scanner;

public class Archivos {

    public static void main(String[] args) {

        int opcion;
        String nombre;
        String texto;
        Scanner entrada = new Scanner(System.in);
        MetodosArchivos archivos = new MetodosArchivos();
        do {
            System.out.println("¿Que desea realizar?\n"+
                                "1.Crear un archivo\n"+
                                "2.Escribir en un archivo\n"+
                                "3.Leer un archivo\n"+
                                "4.Eliminar un archivo\n"+
                                "5.Abrir un archivo\n"+
                                "6.Cerrar programa\n");
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del archivo son su extension que va a crear");
                    nombre = entrada.next();
                    archivos.crearArchivo(nombre);
                    break;
                case 2:
                    System.out.println("Escriba el nombre del archivo en el que quiere escribir");
                    nombre = entrada.next();
                    System.out.println("Indique el texto que quiere añadir");
                    texto = entrada.next();
                    archivos.escribirArchivo(nombre, texto);
                    break;
                case 3:
                    System.out.println("Escriba el nombre del archivo que quiere leer");
                    nombre = entrada.next();
                    archivos.leerArchivo(nombre);
                    break;
                case 4:
                    System.out.println("Escriba el nombre del archivo que quiere eliminar");
                    nombre = entrada.next();
                    archivos.eliminarArchivo(nombre);
                    break;
                case 5:
                    System.out.println("Escriba el nombre del archivo que quiere abrir");
                    nombre = entrada.next();
                    archivos.openFile(nombre);
            }
        }while (opcion != 6);
    }
}



