package uk.epl.player;

public class Forward extends Player{
    private int ACCELERATION_POINT = 10;

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);

    }

    @Override
    protected float getSpeed() {
        return super.getSpeed() + ACCELERATION_POINT;
    }
    protected float getStamina() {
        return super.getStamina();
    }
    protected float getPassing() {
        return super.getPassing();
    }
    public void setStamina() {

    }
    public String toString() {
        return String.format("Player Name= '%s, JerseyNumber=%d Position (%d , %d) " +
                        "Forward SPEED %.1f, , STAMINA=%.1f, , PASSING=%.1f",
                getName(), getJerseyNumber(), this.position.x, this.position.y,
                getSpeed(), getStamina(), getPassing());
    }
}
