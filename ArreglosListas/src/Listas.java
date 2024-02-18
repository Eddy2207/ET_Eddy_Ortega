import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        int cant, opcion, valor, index;
        List<Integer> numeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos valores va a ingresar a la lista?");
        cant = entrada.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el valor "+(i+1)+" ");
            numeros.add(i, entrada.nextInt());
        }
        do {
        System.out.println("\n¿Que deseas hacer con tu lista?\n"+
                "1.Mostrar\n"+
                "2.Agregar al final\n"+
                "3.Eliminar\n"+
                "4.Actualizar\n"+
                "5.Salir");
        opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Esta es tu lista:");
                    for (int i = 0; i < numeros.size(); i++) {
                        System.out.print(" "+numeros.get(i)+" ");
                    }
                    break;
                case 2:
                    System.out.println("¿Cual es el nuevo valor?");
                    valor = entrada.nextInt();
                    numeros.add(numeros.size(), valor);
                    break;
                case 3:
                    System.out.println("Cual es el indice que deseas eliminar?");
                    index = entrada.nextInt();
                    numeros.remove(index);
                    break;
                case 4:
                    System.out.println("Cual indice deseas actualizar?");
                    index = entrada.nextInt();
                    System.out.println("¿Cual es el nuevo valor para ese indice?");
                    valor = entrada.nextInt();
                    numeros.set(index, valor);
                    break;
                case 5:
                    System.out.println("Ha salido de la sesion");
                default:
                    System.out.println("No es una opcion valida");
            }
        }while(opcion != 5);
    }
}
