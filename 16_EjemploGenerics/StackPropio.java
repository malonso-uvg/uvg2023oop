public class StackPropio<T>
{
    private Nodo<T> start;
    private int count;

    public StackPropio(){
       start = null;
       count = 0;
    }

    public int getCount(){
        return count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void push(T _dato) {
        Nodo<T> newNode = new Nodo<T>(_dato);
        if (isEmpty()){
            start = newNode;
        }else{
            newNode.setNext(start);
            start = newNode;
        }
        count++;
    }  

    public T pop(){
        if (isEmpty()){
            return null;
        } else {
            T value = start.getDato();
            start = start.getNext();
            count--;
            return value;
        }
    }

    public T peek(){
        if (isEmpty()){
            return null;
        } else {
            return start.getDato();
        }
    }
}