import java.util.StringTokenizer;
//답지랑 다르게 품 
class SUB {
    public static String delChar(String src, String delCh) {
        StringTokenizer st = new StringTokenizer(src, delCh);       //true 넣으면 구분자도 토큰으로 간주됨
        String r = "";
        while(st.hasMoreTokens()) {
            r += st.nextToken();
        }
        return r;
    }
/*StringTokenizer st = new StringTokenizer(src, "abcABC", true);
        count = st.countTokens();
        이런식도 가능 
*/
    public static void main(String[] args) {
       System.out.println("(1!2@3^4~5)"+"   ->   "
             + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1   2         3    4\t5)"+"   ->   "
             + delChar("(1   2         3    4\t5)"," \t"));
    }
}
