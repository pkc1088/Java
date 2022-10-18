package uk.epl.game;
import uk.epl.player.*;
import java.util.Scanner;

enum Command {ADD, DOWN, RIGHT, LEFT, UP, START, INFO, STOP, QUIT, INVALID};
public class FieldTest {
    private static Field field = new Field();
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while(true) {
            final Command cmd = getCommand(scanner);
            if (cmd == Command.QUIT) {
                System.out.println("Bye");
                break;
            }
            if (cmd == Command.INVALID) {
                System.out.println("Invalid Operation!");
                continue;
            }
            switch (cmd) {
                case ADD:
                    final Player newPlayer = createPlayer(scanner);
                    System.out.println(newPlayer);
                    field.add(newPlayer);break;
                case UP:
                    field.moveUp(choosePlayer(scanner));break;
                case START:
                    field.start();field.info();break;
                case STOP:
                    field.stop();break;
                case INFO:
                    field.info();break;
                /*
                case DOWN:
                    field.moveDown(choosePlayer(scanner)); break;
                case LEFT:
                    field.moveLeft(choosePlayer(scanner)); break;
                case RIGHT:
                    field.moveRight(choosePlayer(scanner)); break;
                */
                default: break;
            }
        }
        scanner.close();
    }

    private static Command getCommand(final Scanner scanner) {
        System.out.println("Enter Command String! ");
        final String operation = scanner.next();
        Command kind;
        try{
            kind = Command.valueOf(operation.toUpperCase());
        } catch (IllegalArgumentException e) {
            kind = Command.INVALID;
        }
        return kind;
    }

    private static int choosePlayer(Scanner scanner) {
        return scanner.nextInt();
    }

    private static Player createPlayer(final Scanner scanner) {
        final String position = scanner.next(); //F
        final String name = scanner.next(); //romelu
        final int jerseyNumber = scanner.nextInt();// 9
        final int speed = scanner.nextInt(); //100
        final int stamina = scanner.nextInt(); //100
        final int passing = scanner.nextInt(); //100

        Player newPlayer = null;
        if("F".equals(position)) {
            newPlayer = new Forward(name, jerseyNumber, speed, stamina, passing);
        } else if("M".equals(position)) {
            newPlayer = new Midfielder(name, jerseyNumber, speed, stamina, passing);
        } else if("D".equals(position)) {
            newPlayer = new Defender(name, jerseyNumber, speed, stamina, passing);
        }
        return newPlayer;
    }
}

