class Car {
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car() {
        this("white", "auto", 4);
        /*color     = "white";
        gearType    = "auto";
        door        = 4;*/
    }

    Car(Car c) {
        this(c.color, c.gearType, c.door);
        /*color = c.color;
        gearType = c.gearType;
        door = c.door;*/
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String c, String g) {
        color       = c;
        gearType    = g;
        this.door   = 10;
    }

    Car(String color, String gearType, int door) {
        this.color    = color;
        this.gearType = gearType;
        this.door     = door;
    }
}

class MAIN {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car("Black", "auto");
        Car c4 = new Car(c3);

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
        System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
        System.out.println("c3의 color=" + c4.color + ", gearType=" + c4.gearType+ ", door="+c4.door);
    }
}
