import java.util.Arrays;

public class HelloJava2 {
    public static void main(String[] args) {
        int[] Arr = {0, 1, 2, 3, 4};
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        int []Brr=Arr;
        Brr[4]=12;
        System.out.println();
        System.out.println(Brr[4]);
        System.out.println(Arr[4]);     //참조함으로 같은 주소가짐

        Brr=new int[]{5,6,7,8,9};       //새로 할당해줬으니 별개로됨
        int []Crr=new int[Arr.length+Brr.length];
        System.arraycopy(Arr, 0, Crr, 0, Arr.length);
        System.arraycopy(Brr, 0, Crr, Arr.length, Brr.length);

        System.out.println(Arrays.toString(Crr));
        System.out.println(Crr[6]);
    }
}

import java.util.Arrays;

public class HelloJava2 {
    public static void main(String[] args) {
        int[] Arr = {0, 1, 2, 3, 4};
        int[] Brr = {5, 6, 7, 8, 9};
        Brr=Arr;
        System.out.println("Arr[3] : "+Arr[3]+ "\nBrr[3]: "+Brr[3]);
        Brr[3]=100;
        System.out.println("Arr[3] : "+Arr[3]+ "\nBrr[3]: "+Brr[3]);
    }
}
