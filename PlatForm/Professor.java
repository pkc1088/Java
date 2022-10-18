import java.util.Objects;

public class Professor extends Person {
    private String school;
    private String major;
    Professor(String name, int year, String address, String school, String major) {
        super(name, year, address);
        this.school = school;
        this.major = major;
    }

    public void setMajor(String str) {
        this.major = str;
    }

    public String toString() {
        return String.format("%s, %d, %s, %s, %s", getName(), getAge(), getAddress(), school, major) ;
    }

    public String schoolName() {
        return school;
    }

    public String major() {
        return major;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return school.equals(professor.school) && major.equals(professor.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), school, major);
    }

}
