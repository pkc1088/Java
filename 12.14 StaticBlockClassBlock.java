class Case{
    int[] crr = new int[3];
    Case(int x){
        for(int i=0;i<crr.length;i++) {
            crr[i] = x;
        }
    }
}
class MAIN
{
    static int[] arr = new int[3];                          //Ŭ���� ���� ����� �ʱ�ȭ
    int[] brr = new int[3];                                 //�ν��Ͻ� ���� ����� �ʱ�ȭ

    static {
        for(int i=0;i<arr.length;i++) {                     //Ŭ���� �ʱ�ȭ ��
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }

    {                                                       //�ν��Ͻ� �ʱ�ȭ ��
        for(int i=0;i<arr.length;i++) {
            arr[i] = 100;
            brr[i] = 100;
        }
    }

    MAIN() {                                                //������
        for(int i=0;i<arr.length;i++) {
            brr[i] = 24;
        }
    }

    public static void main(String args[]) {
        for(int i=0; i < arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]);        //by Ŭ���� �ʱ�ȭ��

        MAIN m1 = new MAIN();
        for(int i=0; i < m1.arr.length;i++)
            System.out.println("m1.arr["+i+"] :" + m1.arr[i]);  //by �ν��Ͻ� �ʱ�ȭ��
        for(int i=0; i < m1.brr.length;i++)
            System.out.println("m1.brr["+i+"] :" + m1.brr[i]);  //by �ν��Ͻ� �ʱ�ȭ�� -> ������

        for(int i=0; i < arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]);        //by static�ε� �ν��Ͻ� �ʱ�ȭ ���� ���� ������� 

        Case c1 = new Case(11);
        for(int i=0; i < c1.crr.length;i++)                     //by caseŬ������ ������
            System.out.println("crr["+i+"] :" + c1.crr[i]);
    }
}

