import javax.management.ValueExp;
import javax.swing.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception{
        Exercise th1 = new Exercise();
        th1.start();
        String input = JOptionPane.showInputDialog("�ƹ���");
        System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�");
        th1.interrupt();
    }
}

class Exercise extends Thread {
    public void run() {
        int i = 10;

        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                interrupt();
            }
        }
        System.out.println("ī��Ʈ�� ����Ǿ����ϴ�");
    }
}
