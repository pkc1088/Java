import java.util.Arrays;

class Pos {
    int val;
    Pos(int x) {
        val = x;
    }
}

class MAIN {
    public static void main(String[] args) {
        //1���� �迭
        int[] a = {1,2,3,4,5};
        int[] b = a;                            //���� ����
        int[] c = a.clone();                    //���� ����1
        int[] d = Arrays.copyOf(a, a.length);   //���� ����2
        int[] e = new int[5];                   //���� ����3
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


        //2���� �迭
        int[][] A = {{1,2,3,4,5}, {6,7,8,9,10}};
        int[][] B = A;                              // ���� ����1
        int[][] C = A.clone();                      // ���� ����2
        B[0][0] = 999;                              // �ܼ� ���� ���� �Ӹ� �ƴ϶� A.clone()�� ����ص� ���� ���簡 ��
        System.out.println("'B'�� �ٲٸ� 'A'���� �ٲ�ϴ�! : "+A[0][0]);
        C[0][0] = 777;
        System.out.println("'C'�� �ٲ㵵 'A'���� �ٲ�ϴ�! : "+A[0][0]);


        int[][] D = new int[A.length][A[0].length];         // ��������1 (2�� �ݺ���)
        int[][] F = new int[A.length][A[0].length];         // ��������2 (�ݺ��� + ArrayCopy)
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


        //��Ʈ��
        String str1 = "abc";
        String str2 = str1;         //���� ����(stringŬ������ �������� �ְ� ����ȭ ���� �׷��� ���� �����ϴ°���)
        str2 += "123";
        System.out.println(str1+" "+str2);


        //��ü �迭
        System.out.println();
        Pos p1= new Pos(1);    Pos p2 = new Pos(2);    Pos p3 = new Pos(30);
        Pos arr[] = {p1, p2, p3};   //1, 2, 30
        Pos brr[] = arr;            //���� ����
        Pos crr[] = arr.clone();    //���� ���� (System.arraycopy�ᵵ ��)


        brr[0] = new Pos(12);                 //���� ��
        brr[1].val = 24;                      //��� ����
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr : "+arr[i].val+" ");
            System.out.print("brr : "+brr[i].val+" ");
            System.out.print("crr : "+crr[i].val+" ");
            System.out.println();
        }
        System.out.println();

        crr[0] = new Pos(50);                     //���� x
        crr[1].val = 40;                          //��� ����
        crr[0].val = 36;				          //���� x 
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr : "+arr[i].val+" ");
            System.out.print("brr : "+brr[i].val+" ");
            System.out.print("crr : "+crr[i].val+" ");
            System.out.println();
        }
        System.out.println();
        
        
        //******��ü�迭 
		Pos p1= new Pos(1);    Pos p2 = new Pos(2);    Pos p3 = new Pos(3);
        Pos arr[] = {p1, p2, p3};   //1, 2, 3
        Pos brr[] = new Pos[3];

        for (int i = 0; i < arr.length; i++) {  //��������
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
