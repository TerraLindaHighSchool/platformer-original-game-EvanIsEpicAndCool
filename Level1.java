import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
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
        Player player = new Player(3, 5.6f, GRAVITY, 3, 3, Level2.class, MUSIC);
        addObject(player,31,762);
        Door door = new Door();
        addObject(door,1180,39);
        Floor floor = new Floor();
        addObject(new Floor(), 600, 800);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,814,584);
        BrickWall brickWall = new BrickWall();
        addObject(brickWall,512,437);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,886,248);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,125,288);
        Gem gem = new Gem();
        addObject(gem,90,248);
        Gem gem2 = new Gem();
        addObject(gem2,146,249);
        Bomb bomb = new Bomb(GRAVITY);
        addObject( new Bomb(GRAVITY),802,200);
        Bomb bomb2 = new Bomb(GRAVITY);
        addObject(bomb2,323,389);
        TrapDoor trapDoor = new TrapDoor(GRAVITY);
        addObject(trapDoor,995,467);
        TrapDoor trapDoor2 = new TrapDoor(GRAVITY);
        addObject(trapDoor2,354,169);
        smBrickWall.setLocation(754,640);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.5)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
