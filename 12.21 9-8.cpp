import static java.lang.Math.*;
class SUB {
    public static double round(double a, int b) {
        a*=Math.pow(10, b);
        a = Math.round(a);
        a /= Math.pow(10, b);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}
