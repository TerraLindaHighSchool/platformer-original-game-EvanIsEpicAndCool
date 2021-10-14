import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    
    private final float GRAVITY = 0.1f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
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
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
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
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,492,712);
        smBrickWall3.setLocation(473,689);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,841,520);
        SmBrickWall smBrickWall5 = new SmBrickWall();
        addObject(smBrickWall5,400,281);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.5)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
