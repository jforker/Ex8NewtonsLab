import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Space. The final frontier. 
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create space.
     */
    public Space()
    {    
        super(960, 620, 1);

        // Uncomment one of the following method calls if you want the objects created automatically:

        //sunAndPlanet();
        //sunAndTwoPlanets();
        //sunPlanetMoon();

        prepare();
    }

    /**
     * Set up the universe with a sun and a planet.
     */
    public void sunAndPlanet()
    {
        removeAllObjects();
        addObject (new Body (50, 240.0, new Vector(270, 0.03), new Color(255, 216, 0)), 460, 270);
        addObject (new Body (20, 4.2, new Vector(90, 2.2), new Color(0, 124, 196)), 695, 260);
    }

    /**
     * Set up the universe with a sun and two planets.
     */
    public void sunAndTwoPlanets()
    {
        removeAllObjects();
        addObject (new Body (50, 240.0, new Vector(270, 0.0), new Color(255, 216, 0)), 460, 310);
        addObject (new Body (20, 4.2, new Vector(90, 2.2), new Color(0, 124, 196)), 695, 300);
        addObject (new Body (24, 4.6, new Vector(270, 1.8), new Color(248, 160, 86)), 180, 290);
    }

    /**
     * Set up the universe with a sun, a planet, and a moon.
     */
    public void sunPlanetMoon()
    {
        removeAllObjects();
        addObject (new Body (50, 240.0, new Vector(270, 0.0), new Color(255, 216, 0)), 460, 270);
        addObject (new Body (20, 4.2, new Vector(90, 2.2), new Color(0, 124, 196)), 720, 260);
        addObject (new Body (5, 0.8, new Vector(90, 3.25), new Color(240, 220, 96)), 748, 260);
    }

    /**
     * Set up a solor system.
     */
    public void threePlanets()
    {
        removeAllObjects();
        addObject (new Body (50, 240.0, new Vector(270, 0.0), new Color(255, 216, 0)), 460, 310);
        addObject (new Body (18, 7, new Vector(90, 2.2), new Color(255, 204, 153)), 695, 300);
        addObject (new Body (24, 4.6, new Vector(270, 1.8), new Color(248, 160, 86)), 180, 290);
        addObject (new Body (30, 4.8, new Vector(90, 2.0), new Color(0, 102, 255)), 700, 50);

    }

    public void partyPlanets()
    {
        removeAllObjects();
        addObject (new Body (80, 940.0, new Vector(270, 0.0), new Color(255, 216, 0)), 460, 310);
        addObject (new Body (18, 7, new Vector(90, 2.2), new Color(255, 204, 153)), 300, 300);
        addObject (new Body (24, 4.6, new Vector(270, 1.8), new Color(248, 160, 86)), 180, 880);
        addObject (new Body (30, 4.8, new Vector(90, 2.0), new Color(0, 102, 255)), 25, 50);
        addObject (new Body (18, 7, new Vector(90, 2.2), new Color(255, 204, 153)), 20, 300);
        addObject (new Body (24, 4.6, new Vector(270, 1.8), new Color(248, 160, 86)), 700, 290);
        addObject (new Body (30, 4.8, new Vector(90, 2.0), new Color(0, 102, 255)), 21, 500);

    }

    /**
     * Remove all objects currently in the world.
     */
    private void removeAllObjects()
    {
        removeObjects (getObjects(Actor.class));
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
}
