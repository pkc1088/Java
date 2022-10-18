import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID};
public class StringSetManager {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        while(true) {
            final StringCommand command = getCommand(scanner);
            if(command == StringCommand.QUIT) {
                System.out.println("BYE!"); break;
            }
            switch(command) {
                case ADD: {
                    final String str = getString(scanner);
                    add(stringSet, str);
                    break;
                }
                case REMOVE: {
                    final String str = getString(scanner);
                    remove(stringSet, str);
                    break;
                }
                case CLEAN: {
                    clear(stringSet);
                    break;
                }
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet);
        }
    }
    static ArrayList<String> arrList = new ArrayList<>();
    static StringCommand getCommand(Scanner sc) {
        String x = sc.next().toUpperCase();
        if(x.equals("ADD"))
            return StringCommand.ADD;
        else if(x.equals("REMOVE"))
            return StringCommand.REMOVE;
        else if(x.equals("CLEAN"))
            return StringCommand.CLEAN;
        else if(x.equals("QUIT"))
            return StringCommand.QUIT;
        else return StringCommand.INVALID;
    }
    static String getString(Scanner sc) {
        return sc.next();
    }
    static void add(String[] strset, String str) {
        if(!arrList.contains(str))
            arrList.add(str);
    }
    static void remove(String[] strset, String str) {
        arrList.remove(str);
    }
    static void clear(String[] strset) {
        arrList.clear();
    }
    static void print(String[] strset) {
        System.out.println("Element Size: "+arrList.size()+", Values = "+ Arrays.toString(arrList.toArray()));
    }
}