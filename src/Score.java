import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void displayOne(int scr)
    {
      String score=Integer.toString(scr);
      GreenfootImage g=new GreenfootImage("Player 1 Score : "+score,30,Color.red,Color.green);
      setImage(g);
    }
    
    public void displayTwo(int scr)
    {
      String score=Integer.toString(scr);
      GreenfootImage g=new GreenfootImage("Player 2 Score : "+score,30,Color.red,Color.green);
      setImage(g);
    }
    
    public void displayHowToPlay1()
    {
        GreenfootImage g=new GreenfootImage("Place the bet",18,Color.red,Color.green);
        setImage(g);
    }
    public void displayHowToPlay2()
    {
        GreenfootImage h=new GreenfootImage("Hold space bar to roll",18,Color.red,Color.green);
        setImage(h);
    }
    public void displayHowToPlay3()
    {
        GreenfootImage h=new GreenfootImage("Click on Scoreboard for Score",16,Color.red,Color.green);
        setImage(h);
    }
//     public void displayPlayer1()
//     {
//         GreenfootImage g=new GreenfootImage("Player 1 Wins",20,Color.red,Color.green);
//         setImage(g);
//     }
//     public void displayPlayer2()
//     {
//         GreenfootImage g=new GreenfootImage("Player 2 Wins",20,Color.red,Color.green);
//         setImage(g);
//     }
    public void displayZero()
    {
        GreenfootImage g=new GreenfootImage("Both Lose!!!",20,Color.red,Color.green);
        setImage(g);
    }
    public void displayEqual()
    {
        GreenfootImage g=new GreenfootImage("its a Tie",20,Color.red,Color.green);
        setImage(g);
    }
    public void displayTotalOne(int s1)
    {
      String score=Integer.toString(s1);
      GreenfootImage g=new GreenfootImage("Player 1 Total : "+score,30,Color.red,Color.green);
      setImage(g);
    }
    public void displayTotalTwo(int s2)
    {
      String score2=Integer.toString(s2);
      GreenfootImage h=new GreenfootImage("Player 1 Score : "+score2,30,Color.red,Color.green);
      setImage(h);
    }
    
}
