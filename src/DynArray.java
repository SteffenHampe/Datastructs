import java.util.NoSuchElementException;

@SuppressWarnings({"unchecked", "ManualArrayCopy"})
public class DynArray<T> {
T[] array;

    public DynArray(){
    array =  (T[])  new Object[1];
    }

    public void verdoppeln() {
        T[] tmp = (T[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = (T[]) new Object[tmp.length * 2];
        for (int j = 0; j < tmp.length; j++) {
            array[j] = tmp[j];
        }
    }

    public void halbieren() {
        T[] tmp = (T[]) new Object[size()];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = array[i];
        }
        array = (T[]) new Object[array.length / 2];
        for (int j = 0; j < tmp.length; j++) {
            array[j] = tmp[j];
        }
    }

    public int size() {
        int count = 0;
        for (T t : array) {
            if (t != null) {
                count++;
            }
        }
        return count;
    }

    public int capacity() {
        return array.length;
    }

    public T get(int pos) {
        if (pos > size() - 1) {
            throw new NoSuchElementException();
        } else return array[pos];
    }

    public T set(int pos, T e){
        if(pos>size()-1){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            T temp = array[pos];
            array[pos]=e;
            return temp;
        }
    }

    public void addFirst(T e){
        if(size()==capacity()){
            verdoppeln();
        }
        for (int i = size() - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = e;
    }

    public void addLast(T e) {
        if (size() == capacity()) {
            verdoppeln();
        }
        array[size()] = e;
    }

    public T removeFirst() {
        T tmp = array[0];
        array[0] = null;
        if (size() * 4 == capacity()) {
            halbieren();
        }
        return tmp;
    }

    public T removeLast() {
        T tmp = array[size() - 1];
        array[size() - 1] = null;
        if (size() * 4 == capacity()) {
            halbieren();
        }
        return tmp;
    }












}
