import java.util.*;

class Student implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;
    int total, schoolRank, classRank;
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban  = ban;
        this.no   = no;
        this.kor  = kor;
        this.eng  = eng;
        this.math = math;
        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/   3f)*10+0.5)/10f;
    }
    public String toString() {
        return name +","+ ban +","+ no +","+ kor +","+ eng  +","+ math +","
                    +getTotal() +","+ getAverage()+",  "+schoolRank+","+classRank;
    }
    public int compareTo(Object o) {
        if(o instanceof Student) {
            Student s1 = (Student) o;
            return s1.total-this.total;
        } else {
            return -1;
        }
    }
}

class ClassTotalComparator implements Comparator{
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            int result = s1.ban - s2.ban;
            if (result == 0)
                result = s2.total - s1.total;
            return result;
        }
        return -1;
    }
}

class Main {
    public static void calculateClassRank(List list) {
        Collections.sort(list, new ClassTotalComparator());
        int prevRank = -1;
        int prevBan = -1;
        int prevTotal = -1;
        int length = list.size();

        for(int i = 0, n = 0; i < length; i++, n++) {
            Student s = (Student)list.get(i);
            if(s.ban!=prevBan) {
                prevRank = -1;
                prevTotal = -1;
                n = 0;
            }
            if(s.total==prevTotal) {
                s.classRank = prevRank;
            } else {
                s.classRank = n + 1;
            }
            prevBan = s.ban;
            prevRank = s.classRank;
            prevTotal = s.total;
        }
    }

    public static void calculateSchoolRank(List list) {
        Collections.sort(list);
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();
        for (int i = 0; i < length; i++) {
            Student s = (Student) list.get(i);
            if (s.total == prevTotal) {
                s.schoolRank = prevRank;
            } else {
                s.schoolRank = i + 1;
            }
            prevRank = s.schoolRank;
            prevTotal = s.total;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("���ڹ�", 2, 1, 70, 90, 70));
        list.add(new Student("���ڹ�", 2, 2, 60, 100, 80));
        list.add(new Student("ȫ�浿", 1, 3, 100, 100, 100));
        list.add(new Student("���ü�", 1, 1, 90, 70, 80));
        list.add(new Student("���ڹ�", 1, 2, 80, 80, 90));

        calculateSchoolRank(list);
        calculateClassRank(list);

        Iterator it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
