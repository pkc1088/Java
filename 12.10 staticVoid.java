class MAIN {
    public static void main(String[] args) {
        System.out.println("main(String[] args)�� ���۵Ǿ���.");
        MAIN m = new MAIN();
        m.firstMethod();        //��ü �������� �׳� first�� second ȣ�� �ҷ��� 
								//static void�� �Ʒ� �Լ��� �����ؾ���
        System.out.println("main(String[] args)�� ������.");
    }

    void firstMethod() {
        System.out.println("firstMethod()�� ���۵Ǿ���.");
        secondMethod();
        System.out.println("firstMethod()�� ������.");
    }

    void secondMethod() {
        System.out.println("secondMethod()�� ���۵Ǿ���.");
        System.out.println("secondMethod()�� ������.");
    }
}

