import greenfoot.*;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends KinectWorld
{

    Joint rightHand;
    static int xc=0;
    static int x=0;
    boolean moving = true;

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {
    }
    
    public void act()
    {
        super.act();
        if (!isConnected())
            return;
            
        setBackground("FruitNinja.png");
        UserData[] us = getTrackedUsers();
        System.out.println("Tracking: " +us);
        for (UserData u: us)
        {
            //Draws their stick figure:
            System.out.println("Inside Users");
            rightHand = u.getJoint(Joint.RIGHT_HAND);
            GreenfootImage img = new GreenfootImage("hand.jpg");
            getBackground().drawImage(img,rightHand.getX(), rightHand.getY());
            u.drawStickFigure(getBackground(), 60);
            
            //---------------------------------------------------
            
                if(Greenfoot.getRandomNumber(300) < 3) 
            {
            xc=Greenfoot.getRandomNumber(600);
            if(xc>=20 && xc<=580)           // so that fruit does'nt go out of the screen
            {
                x=Greenfoot.getRandomNumber(4);                 
                switch(x)
                {           
                
                case 0:
                        addObject(new Bomb(), xc, 500);
                    //break;      
                case 1:
                  addObject(FruitFactory.create(FruitType.APPLE),xc, 500);
                  break;
                case 2:
                  addObject((FruitFactory.create(FruitType.BANANA)),xc, 500);
                  break;
                case 3:
                  addObject((FruitFactory.create(FruitType.ORANGE)),xc, 500);
                  break;
                }
            
            
            
            }
        
        
            }
            
            
        }
    }    
}
