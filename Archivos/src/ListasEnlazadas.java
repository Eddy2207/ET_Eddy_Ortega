public class ListasEnlazadas {
    private Nodo inicio;
    private int tamanio;

    public ListasEnlazadas() {
        this.inicio = null;
        this.tamanio = 0;
    }

    public boolean esVacia(){
        return inicio == null;
    }
    public void agregarFinal(Object valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if(esVacia()){
            inicio = nuevo;
        }else {
            Nodo aux = inicio;
            while (aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio ++;
    }

    public void eliminarPosicion(int posicion){
        if (posicion>=0 && posicion<tamanio){
            if (posicion==0){
                inicio = inicio.getSiguiente();
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
        }
    }

    public void imprimirLista(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while(aux != null) {
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
            System.out.println("null\n");
        }
    }
}

