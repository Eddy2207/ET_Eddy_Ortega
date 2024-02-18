import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {

        int newValue, opcion, valor, indice, tamanio = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        tamanio = entrada.nextInt();
        int[] arreglo = new int[tamanio];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese el indice "+ i + " del array ");
            newValue = entrada.nextInt();
            arreglo[i] = newValue;
        }
        do {
        System.out.println("\n¿Que deseas realizar con el arreglo?\n" +
                "1.Mostrar\n"+
                "2.Agregar al final\n"+
                "3.Eliminar\n"+
                "4.Actualizar\n"+
                "5.Salir");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                Metodos.MostrarArray(arreglo);
                break;
            case 2:
                System.out.println("¿Que valor deseas agregar?");
                valor = entrada.nextInt();
                arreglo = Metodos.AgregarValor(arreglo, valor);
                System.out.println("El array es:");
                Metodos.MostrarArray(arreglo);
                break;
            case 3:
                System.out.println("¿Que indice deseas eliminar?");
                indice = entrada.nextInt();
                arreglo = Metodos.EliminarValor(arreglo, indice);
                System.out.println("El array es:");
                Metodos.MostrarArray(arreglo);
                break;
            case 4:
                System.out.println("¿Que indice deseas Actualizar?");
                indice = entrada.nextInt();
                System.out.println("¿Cual es el nuevo valor?");
                valor = entrada.nextInt();
                arreglo = Metodos.ActualizarArray(arreglo, indice, valor);
                System.out.println("El array es:");
                Metodos.MostrarArray(arreglo);
                break;
            case 5:
                System.out.println("Ha salido de la sesion");
            default:
                System.out.println("No es una opcion valida");
            }
        }while (opcion != 5);
    }
}