import java.util.*;

public class Employee{
    String name="";
    Double salary;
    public Employee(String name, Double salary) {
        this.name += name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name+String.format(" %.1f", salary);
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((Employee) o).name)
                && this.salary == ((Employee) o).salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

