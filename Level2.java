import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    
    private final float GRAVITY = 0.1f;
    private final GreenfootSound MUSIC = new GreenfootSound("Underwater.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        smBrickWall4.setLocation(867,552);
        removeObject(brickWall);
        removeObject(smBrickWall3);
        removeObject(smBrickWall);
        removeObject(smBrickWall4);
        removeObject(trapDoor);
        removeObject(smBrickWall2);
        removeObject(smBrickWall5);
        removeObject(trapDoor2);
        removeObject(brickWall2);
        removeObject(gem);
        removeObject(gem2);
        door.setLocation(902,324);
        BlueWall blueWall = new BlueWall();
        addObject(blueWall,783,506);
        removeObject(blueWall);
        addObject(blueWall,846,466);
        BlueWall blueWall2 = new BlueWall();
        addObject(blueWall2,270,166);
        blueWall.setLocation(998,562);
        BlueWall blueWall3 = new BlueWall();
        addObject(blueWall3,27,536);
        SmBlueWall smBlueWall = new SmBlueWall();
        addObject(smBlueWall,485,395);
        SmBlueWall smBlueWall2 = new SmBlueWall();
        addObject(smBlueWall2,822,678);
        SmBlueWall smBlueWall3 = new SmBlueWall();
        addObject(smBlueWall3,641,57);
        SmBlueWall smBlueWall4 = new SmBlueWall();
        addObject(smBlueWall4,1111,207);
        SmBlueWall smBlueWall5 = new SmBlueWall();
        addObject(smBlueWall5,909,384);
        Powerup powerup = new Powerup();
        addObject(powerup,1071,172);
        Powerup powerup2 = new Powerup();
        addObject(powerup2,1115,172);
        Powerup powerup3 = new Powerup();
        addObject(powerup3,1155,170);
        powerup3.setLocation(1149,168);
        smBlueWall2.setLocation(663,678);
        Bubble bubble = new Bubble(0);
        addObject(bubble,656,423);
        Bubble bubble2 = new Bubble(0);
        addObject(bubble2,1094,319);
        Bubble bubble3 = new Bubble(0);
        addObject(bubble3,763,223);
        smBlueWall.setLocation(500,506);
        SmBlueWall smBlueWall6 = new SmBlueWall();
        addObject(smBlueWall6,1054,465);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.005)
        {
            addObject(new Bubble(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
