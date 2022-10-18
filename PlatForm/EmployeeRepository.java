import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class EmployeeRepository {

    static EmployeeRepository instance;

    private Map<String, Employee> employees = new HashMap<String, Employee>();

    private EmployeeRepository(){}

    public static EmployeeRepository getInstance() {
        if(instance == null)
            instance = new EmployeeRepository();
        return instance;
    }

    public void add(Employee employee) {
        employees.put(employee.getName(), employee);
    }

    public boolean contains(Employee employee) {
        return employees.containsKey(employee.getName());
    }

    public Employee get(Employee employee) {
        return employees.get(employee.getName());
    }
}