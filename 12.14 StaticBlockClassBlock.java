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
    static int[] arr = new int[3];                          //클래스 변수 명시적 초기화
    int[] brr = new int[3];                                 //인스턴스 변수 명시적 초기화

    static {
        for(int i=0;i<arr.length;i++) {                     //클래스 초기화 블럭
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }

    {                                                       //인스턴스 초기화 블럭
        for(int i=0;i<arr.length;i++) {
            arr[i] = 100;
            brr[i] = 100;
        }
    }

    MAIN() {                                                //생성자
        for(int i=0;i<arr.length;i++) {
            brr[i] = 24;
        }
    }

    public static void main(String args[]) {
        for(int i=0; i < arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]);        //by 클래스 초기화블럭

        MAIN m1 = new MAIN();
        for(int i=0; i < m1.arr.length;i++)
            System.out.println("m1.arr["+i+"] :" + m1.arr[i]);  //by 인스턴스 초기화블럭
        for(int i=0; i < m1.brr.length;i++)
            System.out.println("m1.brr["+i+"] :" + m1.brr[i]);  //by 인스턴스 초기화블럭 -> 생성자

        for(int i=0; i < arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]);        //by static인데 인스턴스 초기화 블럭에 의해 변경됐음 

        Case c1 = new Case(11);
        for(int i=0; i < c1.crr.length;i++)                     //by case클래스의 생성자
            System.out.println("crr["+i+"] :" + c1.crr[i]);
    }
}

