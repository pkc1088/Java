class SUB {
    public static void main(String[] args) {
        Value v1 = new Value(12);
        Value v2 = new Value(13);
        String str1 = new String("abc");
        String str2 = new String("abcd");


        if (v1.equals(v2)) {
            System.out.println("v1�� v2�� �����ϴ�.");
        } else {
            System.out.println("v1�� v2�� �ٸ��ϴ�.");
        }
        v2 = v1;
        if (v1.equals(v2)) {
            System.out.println("v1�� v2�� �����ϴ�.");
        } else {
            System.out.println("v1�� v2�� �ٸ��ϴ�.");
        }
        System.out.println(v1.value+" "+v2.value);


        if (str1.equals(str2)) {
            System.out.println("str1�� str2�� �����ϴ�.");
        } else {
            System.out.println("str1�� str2�� �ٸ��ϴ�.");
        }
        str2 = str1;
        if (str1.equals(str2)) {
            System.out.println("str1�� str2�� �����ϴ�.");
        } else {
            System.out.println("str1�� str2�� �ٸ��ϴ�.");
        }
        System.out.println(str1+" "+str2);

    }
}
class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return id ==((Person)obj).id;
		} else {
			return false;
		}
	}

}
