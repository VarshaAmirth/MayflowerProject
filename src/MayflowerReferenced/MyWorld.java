package MayflowerReferenced;

import SharedClasses.Astronaut;
import mayflower.*;
public class MyWorld extends World {
    private Astronaut astronaut;
    private String[][] tiles;
    private boolean leftAvail;
    private boolean rightAvail;
    private boolean upAvail;
    private boolean downAvail;
    //i really dont know why this exists??
    //could be template for your guyses section
    //probably just look at section for a template tho
    //i don't want to delete/edit it, but idk what it does
    public MyWorld() {
        setBackground("src/imgs/img/BG/BG.png");
        tiles = new String[6][8];

        astronaut = new Astronaut();
        leftAvail = true;
        rightAvail = true;
        upAvail = true;
        downAvail = true;

        addObject(astronaut, 400, 700);

        Mayflower.showBounds(true);
        createTiles();
        buildWorld();
    }

    public MyWorld(Astronaut a, Boolean L, Boolean R, Boolean U, Boolean D) {
        setBackground("src/imgs/img/BG/BG.png");
        tiles = new String[6][8];

        astronaut = a;
        leftAvail = L;
        rightAvail = R;
        upAvail = U;
        downAvail = D;

        addObject(astronaut, astronaut.getX(), astronaut.getY());

        Mayflower.showBounds(true);
        createTiles();
        buildWorld();
    }

    public void createTiles() {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                tiles[i][j] = " ";
            }
        }
        for (int r = 0; r < tiles[0].length; r++) {
            tiles[5][r] = "ground";
        }

    }

    public void buildWorld() {
        for (int row = 0; row < tiles.length; row++) {
            for (int col = 0; col < tiles[row].length; col++) {
                if (tiles[row][col].equals("ground")) {
                    addObject(new Block(), col * 100, row * 100);
                }
            }
        }
    }

    public boolean isLeftAvailable() {
        return leftAvail;
    }

    public boolean isRightAvailable() {
        return rightAvail;
    }

    public boolean isUpAvailable() {
        return upAvail;
    }

    public boolean isDownAvailable() {
        return downAvail;
    }

    public void updateAstronaut(Astronaut a) {
        astronaut = a;
    }

    public void act() {
    }

}