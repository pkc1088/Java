package uk.epl.game;
import uk.epl.player.Player;
import uk.epl.player.*;
import java.util.*;

public class Field {
    private List<Player> players = new ArrayList<>();
    Field() {
    }
    public void add(Player player) {
        players.add(player);
    }

    public void moveUp(int backNo) {
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).getJerseyNumber()==backNo) {
                if((players.get(i)) instanceof Forward) {
                    players.get(i).moveUp();
                } else if((players.get(i)) instanceof Midfielder) {
                    players.get(i).moveUp();
                } else if((players.get(i)) instanceof Defender) {
                    players.get(i).moveUp();
                }
            }
        }
    }

    public void start() {
        for (int i = 0; i < players.size(); i++) {
            if((players.get(i)) instanceof Forward)  {
                players.get(i).Set(1);
            } else if((players.get(i)) instanceof Midfielder)  {
                players.get(i).Set(2);
            } else if((players.get(i)) instanceof Defender)  {
                players.get(i).Set(3);
            }
        }
    }

    public void info() {
        for(Player p : players) {
            System.out.println(p);
        }
    }

    public void stop() {

    }
/*
    public void moveDown(int choosePlayer) {
    }

    public void moveLeft(int choosePlayer) {
    }

    public void moveRight(int choosePlayer) {
    }

 */
}
