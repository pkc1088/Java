class Math{
    int sumArr2(int[] arr) {
        int sumx = 0;
        for(int i=0;i<arr.length;i++)
            sumx += arr[i];
        return sumx;
    }
}

class MAIN {
    public static void main(String[] args)
    {
        int[] arr = new int[] {3,2,1,6,5,4};
        int[] result = new int[] {0};
        int a=1, b=2;

        MAIN r = new MAIN();
        Math m = new Math();
        
        int res=r.sumInt(a, b);
        System.out.println("a + b : "+res);
        
        r.sumInt2(a, b, result);
        System.out.println("result[0] : "+result[0]);
        
        System.out.println("a : "+a);

        printArr(arr);  // �迭�� ��� ��Ҹ� ���
        sortArr(arr);   // �迭�� ����
        printArr(arr);  // ������ ����� ���
        System.out.println("sum="+sumArr(arr)); // �迭�� ������ ���
        System.out.println("sum="+m.sumArr2(arr));
    }

    int sumInt(int a, int b) {
        return a+b;
    }

    void sumInt2(int a, int b, int[] result) {
        a++; b++;
        result[0] = a + b;  // �Ű������� �Ѱܹ��� �迭�� �������� ����
    }

    static void printArr(int[] arr) {  // �迭�� ��� ��Ҹ� ���
        System.out.print("[");

        for(int i : arr)  // ���� for��
            System.out.print(i+",");
        System.out.println("]");
    }

    static int sumArr(int[] arr) {  // �迭�� ��� ����� ���� ��ȯ
        int sum = 0;

        for(int i=0;i<arr.length;i++)
            sum += arr[i];
        return sum;
    }

    static void sortArr(int[] arr) {  // �迭�� ������������ ����
        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-1-i;j++)
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
    } // sortArr(int[] arr)
}



