import java.util.Objects;

public class Student extends Person {
    private String schoolName;

    private final Grade grade = Grade.FRESH;

    public Student(String name, int age, String address, String schoolName) {
        super(name, age, address);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void upGrade() {
        grade.upGrade();
    }

    public String toString() {
        return String.format("%s, %d, %s, %s, %s",
                getName(), getAge(), getAddress(), schoolName, grade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return schoolName.equals(student.schoolName) && grade.equals(student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), schoolName, grade);
    }

}

