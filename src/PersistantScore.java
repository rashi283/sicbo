import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class PersistantScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersistantScore extends Actor
{
    /**
     * Act - do whatever the PersistantScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private static int i=0;
    public void act() 
    {
        // Add your action code here.
    }    

    static List<Integer> p1 = new ArrayList<Integer>();
    static List<Integer> p2 = new ArrayList<Integer>();

   /* public static void addToBoard(int s1,int s2)
    {
        if(p1.size()>5)
        {
            PersistantScore.shift(p1);
            PersistantScore.shift(p2);
            p1.add(4,s1);
            p2.add(4,s2);
        }
        else
        {
            p1.add(s1);
            p2.add(s2);
        }
        
        for (int k=0; k<p1.size();k++)
        {
            System.out.println(p1.get(k));
        }
    }
    
  //  public static void shift(List<Integer> list)
    {
        for(int i=0;i<list.size()-1;i++)
        {
            list.add(i,list.get(i+1));
        }
    }
    */

}
