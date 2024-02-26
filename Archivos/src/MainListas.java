public class MainListas {
    public static void main(String[] args) {
        ListasEnlazadas lista = new ListasEnlazadas();
        lista.agregarFinal(1);
        lista.agregarFinal("Holaaaa");
        lista.agregarFinal("nuevo");
        lista.agregarFinal(5);
        lista.imprimirLista();
        lista.eliminarPosicion(1);
        lista.imprimirLista();
    }
}
