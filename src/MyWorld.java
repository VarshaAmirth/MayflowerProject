import mayflower.*;


public class MyWorld extends World {
    private Astronaut astronaut;
    private Block block;
    private Block block2;
    
    public MyWorld() 
    {
        setBackground("imgs/img/BG/BG.png");
        
        astronaut = new Astronaut();
        block = new Block();
        block2 = new Block();
        
        addObject(astronaut, 400, 100);
        addObject(block, 400, 500);
        addObject(block2, 528, 372);
        
        Mayflower.showBounds(true);
    }
    
    public void act()
    {
    }
    
}