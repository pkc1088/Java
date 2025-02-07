class MAIN {
    public static void action(Robot r) {
        if(r instanceof DanceRobot) {
            ((DanceRobot) r).dance();
        }
        else if(r instanceof SingRobot){
            ((SingRobot) r).sing();
        }
        else {
            DrawRobot dr = (DrawRobot) r;
            dr.Draw();
        }
    }

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }
}

class Robot {}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("���� ��ϴ�.");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println("�뷡�� �θ��ϴ�.");
    }
}
class DrawRobot extends Robot {
    void Draw() {
        System.out.println("�׸��� �׸��ϴ�.");
    }
}
