import java.util.Stack;

public class Pila {
    public static void main(String[] args) {

        Stack frutas = new Stack();
        frutas.push("Guayaba");
        frutas.push("Limon");
        frutas.push("Naranja");
        frutas.push("Pera");
        frutas.push("Manzana");

        System.out.println("La pila es "+frutas);
        System.out.println("Cantidad de elementos en la pila "+frutas.size());
        System.out.println("Ultimo elemento "+frutas.peek());
        System.out.println("Primer elemento "+frutas.firstElement());
        System.out.println("Elemento eliminado "+frutas.pop());
        System.out.println("La pila es "+frutas);
    }
}