public class School {
    private String name;
    private int limit;

    private ttStudent[] students;
    private int studentCount;

    public School(String name, int limit) {
        this.name = name;
        this.limit = limit;
        students = new ttStudent[this.limit];
        studentCount = 0;
    }

    public String toString() {
        String msg = "School Name: "+name+" Student Count: "
                +studentCount+"\n";
        for (int i = 0; i < studentCount; i++) {
            msg += "\t"+students[i]+"\n";
        }
        return msg;
    }

    public void addStudent(ttStudent student) {
        students[studentCount] = student;
        studentCount++;
    }

    public void removeAllStudent() {
        students = new ttStudent[limit];
    }

    public ttStudent findStudent(String name, int year) {
        if(equals(name, year))
            return new ttStudent(name, year);

        return null;
    }

    public boolean equals(String name, int year) {
        ttStudent tmp = new ttStudent(name, year);
        for (int i = 0; i < limit; i++) {
            ttStudent tmp2 = students[i];
            if((tmp2 != null && tmp2.equals(tmp)))
                if(hashCode(tmp, tmp2) == 1)
                    return true;
        }
        return false;
    }

    public int hashCode(ttStudent tmp, ttStudent tmp2) {
        if(tmp2.hashcode() == tmp.hashcode())
            return 1;
        else
            return 0;
    }
}