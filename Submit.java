import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Submit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Submit extends Actor
{
    /**
     * Act - do whatever the Submit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String buttonText = "";
    private boolean isClick;
    public Submit(String text){

        setText(text);

    }

    public void setText(String text){
        buttonText=text;
        GreenfootImage textImg=new GreenfootImage(" "+text+" ", 24, greenfoot.Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage image=new GreenfootImage(textImg.getWidth()+8, textImg.getHeight()+8);
        image.setColor(greenfoot.Color.BLACK);
        image.fill();
        image.setColor(greenfoot.Color.BLACK);
        image.fillRect(3, 3, image.getWidth()-6, image.getHeight()-6);
        image.setColor(greenfoot.Color.BLACK);
        image.drawImage(textImg, (image.getWidth()-textImg.getWidth())/2, (image.getHeight()-textImg.getHeight())/2);
        setImage(image);
        isClick = false;
    }

    public void act() 
    {
        // Add your action code here.
        onClick();
    }    

    private void onClick(){
        Board board = (Board)getWorld();
        if(Greenfoot.mouseClicked(this)&& !isClick){
            isClick = true;
            /* if(board.getWord().equals("DEREK")){
            board.updateScore(20);
            board.clearList();
            board.updateWord();
            }*/
            if(board.searchWord(board.getWord().toLowerCase()) == true){
                board.updateScore(board.getLength(board.getWord().substring(0,board.getWord().length()/3)));
                board.clearList();
                board.updateWord();
              
            }

        }
        isClick = false;
    }
}
