import java.util.ArrayList;

public class MyArrayList<T> {

    private Object[] elementData;
    private static int n;

    public MyArrayList(int capacity) {
        elementData = new Object[capacity];
        n = 0;
    }

    public void add(T data) {
        elementData[n++] = data;
    }

    public T get(int index) {
        return (T) elementData[index];
    }
}