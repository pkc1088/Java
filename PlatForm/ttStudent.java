import java.util.Objects;

public class ttStudent {
    private String name;
    private int year;

    public ttStudent(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return "["+name+", "+year+"학년]";
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ttStudent ttStudent = (ttStudent) o;
        return year == ttStudent.year && Objects.equals(name, ttStudent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
    */

    public boolean equals(Object o) {
        if(o instanceof ttStudent) {
            ttStudent tmp = (ttStudent) o;
            return name.equals(tmp.name) && year == tmp.year;
        }
        return false;
    }

    public int hashcode() {
        return (name+year).hashCode();
    }


}