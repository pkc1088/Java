import java.util.ArrayList;
import java.util.Arrays;

class MyArrayList<T> {
    T[] arr;

    @SafeVarargs
    @SuppressWarnings("varargs")
    MyArrayList(T... arr) {
        this.arr = arr;
    }
/*
    @SafeVarargs
//	@SuppressWarnings("unchecked")
    public static <T> MyArrayList<T> asList(T... a) {
        return new MyArrayList<>(a);
    }
*/
    public String toString() {
        return Arrays.toString(arr);
    }
}

class Main {
    //	@SuppressWarnings("unchecked")
    public static void main(String args[]) {
        String[] ssarr = {"ad", "cd"};
        String sarr = "wdw";
        ArrayList<String> list =new ArrayList<>(Arrays.asList("af", "de", sarr, ssarr[0]));
        //MyArrayList.asList("1","2","3");

        System.out.println(list);
    }
}
