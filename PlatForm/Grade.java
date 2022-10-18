import java.util.Objects;

public enum Grade {
    FRESH(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4);
    private int grade;

    Grade(int grade) {
        this.grade = grade;
    }

    public void upGrade() { if ( grade != SENIOR.grade) grade ++ ; }

    @Override
    public String toString() { return String.valueOf(grade); }

/*
    //Grade() { this.grade = FRESH ; }
    //Grade(int grade) { this.grade = grade ; }
    //public int getGrade() { return grade ; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade1 = (Grade) o;
        return grade == grade1.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade);
    }
*/
}

