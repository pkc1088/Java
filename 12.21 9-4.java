class SUB {
    static void printGraph(int[] dataArr, char ch) {
        for (int i = 0; i < dataArr.length; i++) {
            int cnt = dataArr[i];
            for (int j = 0; j < cnt; j++) {
                System.out.print("*");
            }
            System.out.println(cnt);
        }
    }
    public static void main(String[] args) {
        printGraph(new int[]{3, 7, 1, 4},'*');
    }
}
