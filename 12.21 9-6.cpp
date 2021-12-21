class SUB {
    public static String fillZero(String src, int length) {
        if(length <= 0)
            return "";
        else if(src.length()==length || src==null) {
            return src;
        }
        else if(src.length() > length) {
            return src.substring(0, length);
        }
        else {
            StringBuffer sb = new StringBuffer();
            int len = length - src.length();
            for (int i = 0; i < len; i++) {
                sb.append("0");
            }
            sb.append(src);
            String a =sb.toString();
            return a;
        }
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }
}
