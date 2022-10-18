import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg1 = sc.next();
        Double arg2 = sc.nextDouble();
        sc.close();

        String className = "Employee";
        Class[] cArgs = new Class[2];
        cArgs[0] = String.class;
        cArgs[1] = Double.class;

        Employee employee1 = null;
        try {
            /*
            Class userClass = Class.forName(className);
            Constructor cs = userClass.getDeclaredConstructor(cArgs[0], cArgs[1]);
            cs.setAccessible(true); // 중요. access 가능하도록 변경
            employee1 = (Employee) cs.newInstance(arg1, arg2);
            */
            employee1 = (Employee) Class.forName(className).getConstructor(cArgs[0], cArgs[1]).newInstance(arg1, arg2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(employee1);
    }
}