package game;

import java.awt.*;

public class Player extends Entity {
    private String name;
    private int posX = 0;
    private int posY = 0;
    private int level = 1;
    private int exp = 0;
    private cords speed = new cords(0,0);

    public Player(int x, int y) {
        this.name = "göran";
        this.posX = x;
        this.posY = y;
    }

    public void move(int dx, int dy){
        posX = posX + dx;
        posY = posY + dy;

    }

}
