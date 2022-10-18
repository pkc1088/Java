package uk.epl.player;

public class Midfielder extends Player {
    private int PASSING_POINT = 10;

    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);

    }

    protected float getSpeed() {
        return super.getSpeed();
    }
    protected float getStamina() {return super.getStamina();}
    protected float getPassing() {return super.getPassing() + PASSING_POINT;}
    public String toString() {
        return String.format("Player Name= '%s, JerseyNumber=%d Position (%d , %d) " +
                        "Midfielder SPEED %.1f, , STAMINA=%.1f, , PASSING=%.1f",
                getName(), getJerseyNumber(), this.position.x, this.position.y,
                getSpeed(), getStamina(), getPassing());
    }
}
