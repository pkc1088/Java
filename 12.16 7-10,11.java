class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    boolean prev = false;

    public void setChannel(int x) {
        if(prev == false) {
            prevChannel = x;
            prev = true;
        }
        else {                                           //prev∞° true ¿œ∂ß
            prevChannel = getChannel();
            prev = false;
        }
        this.channel = x;
    }
    public int getChannel() {
        return this.channel;
    }
    public void setVolume(int x) {
        this.volume = x;
    }
    public int getVolume() {
        return this.volume;
    }
    public void gotoPrevChannel() {
        int temp = this.channel;
        this.channel = prevChannel;
        prevChannel = temp;
    }
}
class SUB {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());

    }
}
