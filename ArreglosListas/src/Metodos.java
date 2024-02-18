import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Metodos {
    public static void MostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]+" ");
        }
    }
    public static int[] AgregarValor(int[] array, int valor){
        int newTamanio = array.length+1;
        int[] newArray = new int[newTamanio];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newTamanio-1] = valor;
        return newArray;
    }
    public static int[] EliminarValor(int[] array, int index){
        if(index >= 0 && index < array.length) {
            int[] newArray = new int[array.length - 1];
            int newIndex = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (i != index){
                    newArray[newIndex] = array[i];
                    newIndex++;
                }
            }
            return newArray;
        }else{
            System.out.println("Indice fuera de rango. No se puede hacer la eliminacion");
            return array;
        }
    }
    public static int[] ActualizarArray(int[] array, int index, int newValue){
        if(index >= 0 && index < array.length) {
            int[] newArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (i == index){
                    newArray[i] = newValue;
                }else{
                    newArray[i] = array[i];
                }
            }
            return newArray;
        }else {
            System.out.println("Indice fuera de rango. No se puede hacer la eliminacion");
            return array;
        }
    }
}
