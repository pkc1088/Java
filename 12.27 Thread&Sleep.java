import javax.swing.*;

class Main {
    public static void main(String args[]){
        Threadxx th1 = new Threadxx();
        th1.start();
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

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
