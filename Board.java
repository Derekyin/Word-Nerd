import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
//import java.awt.*;

/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends World
{

    /**
     * Constructor for objects of class Board.
     * 
     */
    private int gridSize;
    private Letter[][] letter;
    private Submit submit;
    List<Character> word;

    String s =  "";
    String cache = "";
    private Counter counter;
    private Counter wordCount;
   
    List<List<String>> listOfLists = new ArrayList<List<String>>();

    GreenfootImage img =  new GreenfootImage(600,400);
    public Board() throws IOException
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(400,600,1); 

        img.setColor(new Color(3,169, 244));
        // img.drawRect(0,0,600,400);
        img.fill();
        setBackground(img);
        //FileRead();
        gridSize = 10;
        letter= new Letter[gridSize][gridSize];
        submit = new Submit("Submit");
        addObject(submit,getWidth()/2,550);
        counter = new Counter("Score: ");
        addObject(counter, 50,525);
        addObject(new WordNerd(),getWidth()/2, 60);
        wordCount = new Counter("Words: ");
        addObject(wordCount ,350,525);
       
        List<String> list;
        list = new ArrayList<String>();

        listOfLists.add(list);
        word = new ArrayList<Character>();
        //File temp = new File ("contenet/kek.txt");
        Scanner sc = new Scanner(new File("words.txt"));

        while(sc.hasNextLine()){
            //String s = sc.nextLine();
            listOfLists.get(0).add(sc.nextLine());
        }

        for(int j =0; j <gridSize; j++){
            for(int i=0;  i <gridSize; i++){
                int randomLetter = Greenfoot.getRandomNumber(100);

                //addObject(new Letter(), 25 + 40 * j, 120 + 40 * i);
                switch(randomLetter){
                    //E
                    case 0:case 1: case 2: case 3: case 4: case 5: case 6: 
                    case 7: case 8: case 9: case 10: case 11:
                    addObject(new Letter("E"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //T    
                    case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                    addObject(new Letter("T"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //A
                    case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28:
                    addObject(new Letter("A"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //O
                    case 29: case 30: case 31: case 32: case 33: case 34 : case 35 : case 36: 
                    addObject(new Letter("O"), 20 + 40* j, 120 + 40 * i);
                    break;
                    //I
                    case 37 : case 38: case 39: case 40: case 41: case 42: case 43:
                    addObject(new Letter("I"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //N
                    case 44: case 45: case 46: case 47: case 48: case 49: case 50:
                    addObject(new Letter("N"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //S
                    case 51: case 52: case 53: case 54: case 55: case 56:
                    addObject(new Letter("S"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //R
                    case 57: case 58: case 59: case 60: case 61: case 62: 
                    addObject(new Letter("R"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //H
                    case 63: case 64: case 65: case 66: case 67: case 68: 
                    addObject(new Letter("H"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //D
                    case 69: case 70: case 71: case 72:
                    addObject(new Letter("D"), 20 + 40* j, 120 + 40 * i);
                    break;
                    //L
                    case 73: case 74: case 75: case 76:  
                    addObject(new Letter("L"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //U
                    case 77: case 78: case 79: 
                    addObject(new Letter("U"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //C
                    case 80: case 81: case 82: 
                    addObject(new Letter("C"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //M
                    case 83: case 84: case 85: 
                    addObject(new Letter("M"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //F
                    case 86: case 87: 
                    addObject(new Letter("F"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //Y
                    case 88: case 89: 
                    addObject(new Letter("Y"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //W
                    case 90: case 91: 
                    addObject(new Letter("W"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //G
                    case 92: case 93: 
                    addObject(new Letter("G"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //P 
                    case 94: case 95:
                    addObject(new Letter("P"), 20 + 40 * j, 120 + 40 * i);
                    break;

                    //B
                    case 96: 
                    addObject(new Letter("B"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    //V
                    case 97: 
                    addObject(new Letter("V"), 20 + 40 * j, 120 + 40 * i);
                    break;

                    //K
                    case 98:
                    addObject(new Letter("K"), 20 + 40 * j, 120 + 40 * i);
                    break;
                    // XQJV

                    case 99: 
                    int leftOverLetterPercent = Greenfoot.getRandomNumber(4);
                    switch(leftOverLetterPercent){
                        case 0:
                        addObject(new Letter("X"), 20 + 40 * j, 120 + 40 * i);
                        break;
                        case 1:
                        addObject(new Letter("Q"), 20 + 40 * j, 120 + 40 * i);
                        break;
                        case 2: 
                        addObject(new Letter("J"), 20 + 40 * j, 120 + 40 * i);
                        break;
                        case 3: 
                        addObject(new Letter("V"), 20 + 40 * j, 120 + 40 * i);
                        break;

                    }

                    break;

                }
            }
        }
        // System.out.println(list.size());
        //System.out.println(list.get(3));
    }

    public void addToCharacter(Character c){

        word.add(c);
    }

    public String getWord(){

        for(Character c : word){

            s += c;
        }
        // String s =
        // getWordAgain(s);
        cache = s;
        return s;

    }

    public String getWordAgain(){

        return cache;
    }

    public boolean searchWord(String k){
        for(String a: listOfLists.get(0)){
            if(k.equals(a)){
                return true;
            }
        }
        return false;
    }

    public void updateScore(int length){

        counter.add(length);
    }

    public int getLength(String word){

        int length = word.length();
        return length;
    }

    public void clearList(){
        s= "";
        word.clear();

    }

    public void updateWord(){

        wordCount.add(1);

    }
}
