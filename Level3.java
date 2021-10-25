import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    private final float GRAVITY = 0.1f;
    private final GreenfootSound MUSIC = new GreenfootSound("Sick.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }

    public void act()
    {
        spawn();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class, Door.class, HUD.class);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,31,762);

        Lava lava = new Lava();
        addObject(lava,600,694);
        player.setLocation(972,373);
        player.setLocation(232,512);
        player.setLocation(116,534);
        
        LavaPlatform lavaPlatform = new LavaPlatform();
        addObject(lavaPlatform,151,573);
        LavaPlatform lavaPlatform2 = new LavaPlatform();
        addObject(lavaPlatform2,392,466);
        LavaPlatform lavaPlatform3 = new LavaPlatform();
        addObject(lavaPlatform3,707,508);
        LavaPlatform lavaPlatform4 = new LavaPlatform();
        addObject(lavaPlatform4,925,373);
        LavaPlatform lavaPlatform5 = new LavaPlatform();
        addObject(lavaPlatform5,595,357);
        LavaPlatform lavaPlatform6 = new LavaPlatform();
        addObject(lavaPlatform6,1077,301);
        Door door = new Door();
        addObject(door,1076,238);
        removeObject(door);
        
        addObject(door,1072,244);
    }

    private void spawn()
    {
        if(Math.random() < 0.01)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
