import java.util.Arrays;

class Pos {
    int val;
    Pos(int x) {
        val = x;
    }
}

class MAIN {
    public static void main(String[] args) {

        Pos p1= new Pos(1);    Pos p2 = new Pos(2);    Pos p3 = new Pos(3);
        Pos []arr = {p1, p2, p3};   //1, 2, 3
        Pos []brr = new Pos[3];

        for (int i = 0; i < arr.length; i++) {  //±íÀºº¹»ç
            brr[i] = new Pos(arr[i].val);
        }

        brr[0].val = 40;

        for (int i = 0; i < brr.length; i++) {
            System.out.print("arr : "+arr[i].val+" ");
            System.out.print("brr : "+brr[i].val+" ");
            System.out.println();
        }

    }
}
