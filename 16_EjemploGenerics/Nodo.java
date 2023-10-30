public class Nodo<T> {
    private T dato;
    private Nodo<T> next;

    public Nodo(){
        setDato(null);
        setNext(null);
    }

    public Nodo(T _dato){
        setDato(_dato);
        setNext(null);
    }

    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }
    public Nodo<T> getNext() {
        return next;
    }
    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    

}
