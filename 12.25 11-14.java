import java.util.ArrayList;
import java.util.*;
import java.io.*;

class Main {
    static ArrayList record = new ArrayList();
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            switch (displayMenu()) {
                case 1:
                    inputRecord();
                    break;
                case 2:
                    displayRecord();
                     break;
                case 3:
                     System.out.println("���α׷���    �����մϴ�.");
                     System.exit(0);
            }
        }
    }

    static int displayMenu() {
        System.out.println("**************************************************");
        System.out.println("            �������� ���α׷�           ");
        System.out.println("**************************************************");
        System.out.println("   1.   �л�����    �Է��ϱ�    ");
        System.out.println("   2.   �л�����    ����");
        System.out.println("   3.   ���α׷�    ����    ");
        int menu = 0;
        while(true) {
            System.out.print("���ϴ� �޴��� �����ϼ���.(1~3) : ");
            menu = s.nextInt();
            if(menu>3 || menu<1)
                System.out.println("�߸��� �Է�");
            else
                break;
        }
        return menu;
    }

    static void inputRecord() {
        System.out.println("1.   �л�����    �Է��ϱ�");
        System.out.println("�̸�,��,��ȣ,�����,�����,���м����� ������ ������� �Է��ϼ���.");
        System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
        while(true) {
            System.out.print(">>>");
            String input = s.nextLine().trim();
            if(input.equalsIgnoreCase("q"))
                break;
            else {
                String input2 = s.nextLine().trim();
                String[] arr = input2.split(",");
                Student std1 = new Student(arr[0], Integer.valueOf(arr[1]), Integer.valueOf(arr[2]),
                        Integer.valueOf(arr[3]), Integer.valueOf(arr[4]), Integer.valueOf(arr[5]));
                record.add(std1);
                break;
            }
        }
    }

    static void displayRecord() {
        int koreanTotal = 0;
        int englishTotal = 0;
        int mathTotal = 0;
        int total = 0;
        int length = record.size();
        if(length > 0) {
            System.out.println();
            System.out.println("�̸�    ��    ��ȣ    ����    ����    ����    ����    ���    �������    �ݵ��");
            System.out.println("====================================================");
            for (int i = 0; i < length; i++) {
                Student student = (Student)record.get(i);
                System.out.println(student);
                koreanTotal += student.kor;
                mathTotal += student.math;
                englishTotal += student.eng;
                total += student.total;
            }
            System.out.println("====================================================");
            System.out.println("����: "+koreanTotal+" "+englishTotal
                    +" "+mathTotal+" "+total);
            System.out.println();
        } else {
            System.out.println("====================================================");
            System.out.println("   �����Ͱ�    �����ϴ�.");
            System.out.println("====================================================");
        }
    }
}
class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;
    int classRank;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no  = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int)((getTotal()/3f)*10+0.5)/10f;
    }

    public int compareTo(Object o) {
        if(o instanceof Student) {
            Student tmp = (Student)o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name+","+ban +","+no +","+kor +","+eng+","+math+","+
               getTotal() +","+getAverage() +","+schoolRank+","+classRank;
    }
}
