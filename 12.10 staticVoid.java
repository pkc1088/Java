class MAIN {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음.");
        MAIN m = new MAIN();
        m.firstMethod();        //객체 생성없이 그냥 first와 second 호출 할려면 
								//static void로 아래 함수들 정의해야함
        System.out.println("main(String[] args)이 끝났음.");
    }

    void firstMethod() {
        System.out.println("firstMethod()이 시작되었음.");
        secondMethod();
        System.out.println("firstMethod()이 끝났음.");
    }

    void secondMethod() {
        System.out.println("secondMethod()이 시작되었음.");
        System.out.println("secondMethod()이 끝났음.");
    }
}

