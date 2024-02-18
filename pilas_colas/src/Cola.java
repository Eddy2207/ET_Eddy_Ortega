import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class Cola {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList<>();

        carros.add("Ferrari");
        carros.add("Toyota");
        carros.add("Mazda");
        carros.add("BMW");
        carros.add("Suzuki");

        System.out.println("La cola es: "+carros);
        System.out.println("El primer elemento es "+carros.peek());
        System.out.println("El tamaño de la colas es: "+carros.size());
        System.out.println("El elemento eliminado es "+carros.remove());

        ArrayList<String> list = new ArrayList<>(carros);
        System.out.println("Ultimo elemento "+list.get(list.size()-1));
        System.out.println("La cola es: "+carros);

    }
}
