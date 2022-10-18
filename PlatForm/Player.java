package uk.epl.player;
import java.util.Scanner;

public abstract class Player {
    private String name;
    private int jerseyNumber;
    Position position;

    private int[] abilities = new int[3];
    final int SPEED = 0; final int STAMINA = 1; final int PASSING = 2;

    public Player(String name, int jerseyNumber, int speed, int stamina, int passing) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        abilities[SPEED] = speed;
        abilities[STAMINA] = stamina;
        abilities[PASSING] = passing;
        position = new Position(0, 0);
    }

    public class Position {
        public int x = 0;
        public int y = 0;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
        /*
        public int getPosX() {
            return x;
        }
        public int getPosY() {
            return y;
        }
         */
    }

    public Position getPosition() {
        return new Position(position.x, position.y);
    }

    private float getMoveDelta() {
        return 1 + getSpeed()/100 * getStamina()/100;
    }

    public void moveUp() {
        float move_delta = getMoveDelta();
        position.y = (int)(position.y - move_delta);
        decreaseStamina();
    }

    private void decreaseStamina() {
        abilities[STAMINA] = (int) (abilities[STAMINA] - 2);
    }

    public void Set(int x) {
        position.x = 34;
        if(x==1) position.y = 25;
        else if(x==2) position.y = 50;
        else if(x==3) position.y = 75;
    }

    protected float getPassing() {
        return (float)abilities[PASSING];
    }
    protected float getStamina() {
        return (float)abilities[STAMINA];
    }
    public String getName() {
        return name;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    protected float getSpeed() {
        return (float)abilities[SPEED];
    }


}
