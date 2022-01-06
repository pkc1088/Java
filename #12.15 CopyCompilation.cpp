import java.util.Arrays;

class Pos {
    int val;
    Pos(int x) {
        val = x;
    }
}

class MAIN {
    public static void main(String[] args) {
        //1차원 배열
        int[] a = {1,2,3,4,5};
        int[] b = a;                            //汰 복사
        int[] c = a.clone();                    //깊은 복사1
        int[] d = Arrays.copyOf(a, a.length);   //깊은 복사2
        int[] e = new int[5];                   //깊은 복사3
        for (int i = 0; i < e.length; i++) {
            e[i] = a[i];
        }

        System.out.println(a[0]+" "+b[0]+" "+c[0]+" "+d[0]+" "+e[0]);
        b[0] = 100;
        System.out.println(a[0]+" "+b[0]+" "+c[0]+" "+d[0]+" "+e[0]);
        c[0] = 12;
        System.out.println(a[0]+" "+b[0]+" "+c[0]+" "+d[0]+" "+e[0]);
        d[0] = 24;
        System.out.println(a[0]+" "+b[0]+" "+c[0]+" "+d[0]+" "+e[0]);
        e[0] = 36;
        System.out.println(a[0]+" "+b[0]+" "+c[0]+" "+d[0]+" "+e[0]);


        //2차원 배열
        int[][] A = {{1,2,3,4,5}, {6,7,8,9,10}};
        int[][] B = A;                              // 汰 복사1
        int[][] C = A.clone();                      // 汰 복사2
        B[0][0] = 999;                              // 단순 변수 선언 뿐만 아니라 A.clone()을 사용해도 얕은 복사가 됨
        System.out.println("'B'를 바꾸면 'A'값이 바뀝니다! : "+A[0][0]);
        C[0][0] = 777;
        System.out.println("'C'를 바꿔도 'A'값이 바뀝니다! : "+A[0][0]);


        int[][] D = new int[A.length][A[0].length];         // 깊은복사1 (2중 반복문)
        int[][] F = new int[A.length][A[0].length];         // 깊은복사2 (반복문 + ArrayCopy)
        for(int i = 0; i < A.length; i++){
            for(int j = 0 ; j < A[0].length; j++){
                D[i][j] = A[i][j];
            }
        }
        for(int i = 0; i < A.length; i++){
            System.arraycopy(A[i], 0, F[i], 0, F[i].length);
        }
        D[0][0] = 123;
        F[0][0] = 888;
        System.out.println(A[0][0]+" "+D[0][0]+" "+F[0][0]);


        //스트링
        String str1 = "abc";
        String str2 = str1;         //깊은 복사(string클래스는 읽을수만 있고 값변화 못줌 그래서 새로 생성하는거임)
        str2 += "123";
        System.out.println(str1+" "+str2);


        //객체 배열
        System.out.println();
        Pos p1= new Pos(1);    Pos p2 = new Pos(2);    Pos p3 = new Pos(30);
        Pos arr[] = {p1, p2, p3};   //1, 2, 30
        Pos brr[] = arr;            //汰 복사
        Pos crr[] = arr.clone();    //깊은 복사 (System.arraycopy써도 됨)


        brr[0] = new Pos(12);                 //영향 ㅇ
        brr[1].val = 24;                      //모두 영향
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr : "+arr[i].val+" ");
            System.out.print("brr : "+brr[i].val+" ");
            System.out.print("crr : "+crr[i].val+" ");
            System.out.println();
        }
        System.out.println();

        crr[0] = new Pos(50);                     //영향 x
        crr[1].val = 40;                          //모두 영향
        crr[0].val = 36;				          //영향 x 
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr : "+arr[i].val+" ");
            System.out.print("brr : "+brr[i].val+" ");
            System.out.print("crr : "+crr[i].val+" ");
            System.out.println();
        }
        System.out.println();
        
        
        //******객체배열 
		Pos p1= new Pos(1);    Pos p2 = new Pos(2);    Pos p3 = new Pos(3);
        Pos arr[] = {p1, p2, p3};   //1, 2, 3
        Pos brr[] = new Pos[3];

        for (int i = 0; i < arr.length; i++) {  //깊은복사
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
