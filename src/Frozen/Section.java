package Frozen;
import MayflowerReferenced.MyWorld;
import SharedClasses.Astronaut;
import mayflower.Mayflower;

//different "section" per planet, makes panels of a map
//it's kinda hard to read sorry
public class Section extends MyWorld
{
    private Astronaut astronaut;
    private String[][] tiles;
    //each panel has vars if next world is available
    private boolean leftAvail;
    private boolean rightAvail;
    private boolean upAvail;
    private boolean downAvail;
    //the number for the panel next to it
    private int lWorld;
    private int rWorld;
    private int uWorld;
    private int dWorld;

    //original constructor, only used to create the first world in mymayflower
    //won't update this constructor to have memory, so probably don't put anything collectable in spawn
    public Section() {
        setBackground("src/imgs/img/BG/BG.png");
        tiles = new String[6][8];

        astronaut = new Astronaut();
        leftAvail = true;
        rightAvail = true;
        upAvail = false;
        downAvail = false;
        lWorld = 4;
        rWorld = 1;
        uWorld = 0;
        dWorld = 0;

        addObject(astronaut, 300, 400);

        Mayflower.showBounds(true);
        createTiles();
        buildWorld();
    }
    //constructor used every other time
    //there is an amount of panels for the planet
    //make an if statement for each numbered panel and inside that add the unique changes to the panel
    //make different private methods for each if statement
    //memory would be in here somehow, it is a faux memory

    //memory would be making methods for each individual thing, but whenever it is collected it no longer will spawn in
    //will have to make lots of ifs and booleans
    //ex: the act of animatedActor
    public Section(int s) {
        setBackground("src/imgs/img/BG/BG.png");
        tiles = new String[6][8];

        if (s == 1) 
        {
            //empty section + random space ship piece
            setBackground("src/imgs/Backgrounds/back1.jfif");
            leftAvail = true;
            rightAvail = true;
            upAvail = false;
            downAvail = false;
            lWorld = 0;
            rWorld = 2;
            uWorld = 0;
            dWorld = 0;

            tiles[4][(int) Math.random() * 8] = "ssp";
    
        } 
        else if (s == 2) 
        {
            //mountain wall + parkour
            setBackground("src/imgs/Backgrounds/back2.jfif");
            leftAvail = true;
            rightAvail = false;
            upAvail = true;
            downAvail = false;
            lWorld = 1;
            rWorld = 0;
            uWorld = 3;
            dWorld = 0;
        } 
        else if (s == 3) 
        {
            //remove ground pieces, add new ground piece, igloo, space ship piece
            //maybe npc, maybe snowball launcher
            setBackground("src/imgs/Backgrounds/back3.jfif");

            leftAvail = false;
            rightAvail = false;
            upAvail = false;
            downAvail = true;
            lWorld = 0;
            rWorld = 0;
            uWorld = 0;
            dWorld = 2;

        } 
        else if (s == 4) 
        {
            //cave entrance
            setBackground("src/imgs/Backgrounds/back4.jfif");

            leftAvail = true;
            rightAvail = true;
            upAvail = false;
            downAvail = false;
            lWorld = 5;
            rWorld = 0;
            uWorld = 0;
            dWorld = 0;
        }
        else if (s == 5) 
        {
            //spike floor, parkour, random space ship piece, placed piece, cave background
            setBackground("src/imgs/Backgrounds/back5.png");

            leftAvail = true;
            rightAvail = true;
            upAvail = false;
            downAvail = false;
            lWorld = 6;
            rWorld = 4;
            uWorld = 0;
            dWorld = 0;
        }
        else if (s == 6) 
        {
            //yeti, spaceship piece, cave background
            setBackground("src/imgs/Backgrounds/back6.jfif");

            leftAvail = false;
            rightAvail = true;
            upAvail = false;
            downAvail = false;
            rWorld = 5;
            lWorld = 0;
            uWorld = 0;
            dWorld = 0;
        }
        else if (s == 0)
        {
            //start screen
            leftAvail = true;
            rightAvail = true;
            upAvail = false;
            downAvail = false;
            lWorld = 4;
            rWorld = 1;
            uWorld = 0;
            dWorld = 0;
        }
        
        Mayflower.showBounds(true);
        createTiles();
        buildWorld();
    }

    //used in movable animated actor
    public int getLeft()
    {
        return lWorld;
    }
    public int getRight() {
        return rWorld;
    }
    public int getUp() {
        return uWorld;
    }
    public int getDown() {
        return dWorld;
    }

    //used in movable animated actor
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

    //probably should be used for whenever we get to more memory things
    //i don't have health/harm so idk how to implement it yet
    public void updateAstronaut(Astronaut a) {
        astronaut = a;
    }
    public Astronaut getAstronaut() {
        return astronaut;
    }

    public void act() {
    }
}
