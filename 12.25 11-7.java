import java.util.*;

class Student {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban  = ban;
        this.no   = no;
        this.kor  = kor;
        this.eng  = eng;
        this.math = math;
    }

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        return (int)((getTotal()/   3f)*10+0.5)/10f;
    }

    public String toString() {
        return name +","+ ban +","+ no +","+ kor +","+ eng  +","+ math +","
                    +getTotal() +","+ getAverage();
    }
}

class BanNoAscending implements Comparator{
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            if(s1.ban > s2.ban)
                return s1.ban;
            else if(s1.ban == s2.ban)
                if(s1.no > s2.no)
                    return s1.no;
        }
        return -1;
       //return s1.ban==s2.ban ? s1.no - s2.no : s1.ban - s2.ban; 
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("���ڹ�",2,1,70,90,70));
        list.add(new Student("���ڹ�",2,2,60,100,80));
        list.add(new Student("ȫ�浿",1,3,100,100,100));
        list.add(new Student("���ü�",1,1,90,70,80));
        list.add(new Student("���ڹ�",1,2,80,80,90));

        Collections.sort(list, new BanNoAscending());

        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

