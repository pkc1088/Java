import java.util.StringTokenizer;
//������ �ٸ��� ǰ 
class SUB {
    public static String delChar(String src, String delCh) {
        StringTokenizer st = new StringTokenizer(src, delCh);       //true ������ �����ڵ� ��ū���� ���ֵ�
        String r = "";
        while(st.hasMoreTokens()) {
            r += st.nextToken();
        }
        return r;
    }
/*StringTokenizer st = new StringTokenizer(src, "abcABC", true);
        count = st.countTokens();
        �̷��ĵ� ���� 
*/
    public static void main(String[] args) {
       System.out.println("(1!2@3^4~5)"+"   ->   "
             + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1   2         3    4\t5)"+"   ->   "
             + delChar("(1   2         3    4\t5)"," \t"));
    }
}
