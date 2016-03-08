import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An apple flows from bottom to top.
 * 
 * @author Poul Henriksen
 */
public class Banana extends Fruit
{
    /**
     * Moving the apple. 
     */ 
    /*
    int num=0;
    int x=2,y=-2;
    int flag=0;
    static int loop=0,ht;
    
    Apple()
    {
     super(FruitType.APPLE);
    }
    
    public void act() 
    {
        
        
       gravity();
       
        if(flag==1 && getY()==0)
        {
            getImage().setTransparency(0);
            flag=0;
        }

        //make the apple disappear
        if(getY()>=490 && num>0)
        {
           getWorld().removeObject(this);
        }   
    }
     public void gravity() {
        setLocation(getX(), getY() +y);
       ht=100;
        
         if(getY()<=ht)
        {
            num++;
            loop=Greenfoot.getRandomNumber(2);
            if(loop==0)//loop - how much dist to move after reaching a particular height(ht)
            {  
             move(-20);   
            }
            else
            {
             move(20);   
            }
            flag=1;
            x=x*(2);
            y=y*(-2);
        }
    }
    */
    public int gravity = 25;
    public int rightspeed = Greenfoot.getRandomNumber(15);
    int threshold = 10;
        /**
           * Act - do whatever the Strawberry wants to do. This method is called whenever
             * the 'Act' or 'Run' button gets pressed in the environment.
               */
              public void act() 
              {
                  // Add your action code here.
                  Background world = (Background) getWorld();
                  setLocation(getX()+rightspeed,getY()-gravity);
                    gravity -= 1;
                    if (getX() > world.getWidth() - threshold) 
                    {
                        //getWorld().removeObject(this);
                        getImage().setTransparency(0);
                    }    
                    if (getY() > world.getHeight() - threshold)
                    {
            getImage().setTransparency(0);
           }
   
        }
    /**
     * Pop this apple.
     */
    public void pop()//FruitNinja fn) 
    {
        Greenfoot.playSound("cut.mp3");
        //((FruitNinja) getWorld()).countFruits();
        //fn.count(10,fn);
        GreenfootImage apple= new GreenfootImage("appleCut.png");
        setImage(apple);
        //Greenfoot.delay(20);
        //fn.removeObject(this);
    }
}
