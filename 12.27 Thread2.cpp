import javax.swing.*;

class Main {
    public static void main(String args[]){
        Thread th1 = new Thread(new Threadxx());
        th1.start();
        String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
        System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
        System.out.println(Thread.currentThread().getName());
        for(int i=10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(Exception e ) {}
        }

    }
}

class Threadxx implements Runnable{
    public void run() {
        for(int i=10; i > 0; i--) {
            System.out.println("a"+i);
            try {
                Thread.sleep(1000);
            } catch(Exception e ) {}
        }
    }
}
