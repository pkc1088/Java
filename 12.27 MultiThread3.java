class Main {
    public static void main(String args[]) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();

        th1.start();
        th2.start();

        System.out.print("<<main>>");
    }
}

class ThreadEx12_1 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("-");
        }

        System.out.print("<<th1>>");
    }
}

class ThreadEx12_2 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("|");
        }
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
        
        System.out.print("<<th2>>");
    }
}
