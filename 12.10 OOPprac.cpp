class TV {
    int channel=10;
    boolean power;

    void channelUp()      {++channel;}
    void channelDown()    {--channel;}
}

public class MAIN {
    public static void main(String[] args) {
        TV tv1 = new TV();  tv1.channel=2;
        TV tv2 = new TV();  tv2.channel=11;
        TV tv3 = new TV();  tv3.channel=12;
        TV[] tvArr = {tv1, tv2, tv3};

        TV[] tvArr2  = new TV[3];
        tvArr2[0]=new TV(); tvArr2[0].channel=100;
        tvArr2[1]=new TV(); tvArr2[1].channel=120;
        tvArr2[2]=new TV();

        for (int i = 0; i < tvArr.length; i++) {
            System.out.println(tvArr[i].channel);
        }
        for (int i = 0; i < tvArr2.length; i++) {
            System.out.println(tvArr2[i].channel);
        }
    }
}
