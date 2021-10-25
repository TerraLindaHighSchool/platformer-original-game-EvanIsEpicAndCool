import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    
    private final float GRAVITY = 0.1f;
    private final GreenfootSound MUSIC = new GreenfootSound("Sick.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level4()
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

        RockPlatform rockPlatform = new RockPlatform();
        addObject(rockPlatform,208,706);
        player.setLocation(108,644);
        RockPlatSm rockPlatSm = new RockPlatSm();
        addObject(rockPlatSm,747,636);
        rockPlatSm.setLocation(810,628);
        rockPlatSm.setLocation(1008,630);
        RockPlatSm rockPlatSm2 = new RockPlatSm();
        addObject(rockPlatSm2,447,543);
        removeObject(rockPlatSm2);
        addObject(rockPlatSm2,428,476);
        rockPlatSm2.setLocation(398,496);
        RockPlatform rockPlatform2 = new RockPlatform();
        addObject(rockPlatform2,901,378);
        Door door = new Door();
        addObject(door,936,300);
        door.setLocation(962,283);
        Rock rock = new Rock(1);
        addObject(rock,375,396);
        Rock rock2 = new Rock(1);
        addObject(rock2,1046,554);
        Rock rock3 = new Rock(1);
        addObject(rock3,606,23);
        DeathTrigger deathTrigger = new DeathTrigger();
        addObject(deathTrigger,598,762);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.01)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
