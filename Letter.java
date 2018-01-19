import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;
/**
 * Write a description of class Letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Actor
{
    /**
     * Act - do whatever the Letter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    GreenfootImage img;
    int fontSize;
    private Character letter;
    private boolean isClick;
    private boolean clicked = false;
    private int transparency = 255;
    public Letter(){

    }

    public Letter(String o){

        letter = o.charAt(0);

        /*img = new GreenfootImage(o,40,Color.BLACK,Color.RED);
        // img.setColor(java.awt.Color.RED);
        // img.fill();

        img.drawImage(img,50,50);
        img.drawRect(0,0,50,50);
        setImage(img);
        //img.drawString("k", 50, 50);
        fontSize = 24;
        Color textColor= new Color(0,2, 128);
        isClick = false;*/

        /*GreenfootImage textImage = new GreenfootImage(l, 24, new Color(0, 255, 128), new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(textImage.getWidth()+12, 36);
        image.setColor(new Color(196, 196, 0));
        image.fill();
        image.setColor(new Color(0, 0, 196));
        image.fillRect(3, 3, image.getWidth()-6, 30);
        image.drawImage(textImage, 6, 6);*/

        //String text = i;
        img = new GreenfootImage(40,40);
        img.setColor(new Color(33,150,243));
        img.fillRect(0,0,40,40);
        img.setColor(new Color(23,118,210));
        img.drawRect(0,0,39,39);
        //img.fillRect(0,0,40,40);
        img.setColor(new Color(255,255,255));
        img.setFont(new Font("Roboto",true,false,20));
        img.drawString(o,15,25);
        setImage(img);

        letter = o.charAt(0);
    }

    public void act() 
    {
        onClick();
        lowerTransparency();
    }    

    private void onClick(){
        if(Greenfoot.mouseClicked(this)&&!isClick){
            isClick = true;
            Board board = (Board)getWorld();
            board.addToCharacter(letter);

            //img.setColor(java.awt.Color.BLUE);
            //getWorld().removeObject(this);

            clicked = true;
        }
        isClick = false;
    }

    private void lowerTransparency(){
        if(clicked == true){
            img.setTransparency(transparency);
            transparency -=10;
            if(transparency <= 5 ){

                getWorld().removeObject(this);
            }

        }
    }
}
