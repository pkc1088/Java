import javax.swing.*;

class Main {
    public static void main(String args[]){
        Threadxx th1 = new Threadxx();
        th1.start();
        String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
        System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");

        for(int i=10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(Exception e ) {}
        }

    }
}

class Threadxx extends Thread {
    public void run() {
        for(int i=100; i > 90; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch(Exception e ) {}
        }
    }
}
