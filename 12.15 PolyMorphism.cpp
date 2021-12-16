class Case {
    void play(){
        System.out.println("play");
    }
    void stop(){
        System.out.println("stop");
    }
}

class Case2 extends Case {
    void play(){
        System.out.println("play");
    }
    void stop(){
        System.out.println("stop");
    }
    void replay() {
        System.out.println("replay");
    }
}

public class SUB {
    public static void main(String[] args) {
        Case2 c = new Case2();
        c.play(); c.stop(); c.replay();
        Case p = new Case2();
        p.play(); p.stop(); //p,replay();
    }
}

