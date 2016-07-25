import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import greenfoot.Actor.*;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    int score=0,score2=0;
    static boolean val=false;
    static boolean IFlag=false;
    static int pScoreOne=0;
    static int pScoreTwo=0;
    //GameState gameState;
    ICommand command;
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ScoreBoard()
    {
    }
     public ScoreBoard(ICommand command)
    {
        this.command=command;
        //System.out.println(command);
    }
    /*static List<Dice> dicelist;
    public void status()
    {
        this.gameState.status();
    }
    
    public void setState(GameState gameState)
    {
        this.gameState=gameState;
    }
    
    public GameState getState()
    {
        return this.gameState;
    }*/
    public void setCommand(ICommand command)
    {
        this.command=command;
    }
    
      public ICommand getCommand()
    {
        return command;
    }
    
    public void act() 
    {
        if(val)
        { 
            /*score=0;
            score2=0;
            World world;
            world = getWorld();
            dicelist = world.getObjects(Dice.class);
           int sumOfDice = dicelist.get(0).faceValue + dicelist.get(1).faceValue + dicelist.get(2).faceValue;
            if(dicelist.get(0).faceValue==dicelist.get(1).faceValue && dicelist.get(0).faceValue==dicelist.get(2).faceValue)
            {
                selectTile("Triple");
            }

            if (sumOfDice > 3 && sumOfDice < 11) selectTile("Small");
            if (sumOfDice > 10 && sumOfDice < 18) selectTile("Big");
            if (sumOfDice != 3 && sumOfDice !=18) selectTile("Number_"+sumOfDice);
            int a[]=new int[3];
            a[0]=dicelist.get(0).faceValue;
            a[1]=dicelist.get(1).faceValue;
            a[2]=dicelist.get(2).faceValue;
            for(int i=0;i<a.length-1;i++)
            {
                for(int j=1;j<a.length;j++)
                {
                    if(a[i]>a[j])
                    {
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
            selectTile("Combo"+a[0]+"And"+a[1]);
            selectTile("Combo"+a[1]+"And"+a[2]);
            selectTile("Combo"+a[0]+"And"+a[2]);
            ScoreBoard scoreboard = new ScoreBoard();
            //GameState p1=new PlayerOne();
            //GameState p2 = new PlayerTwo();
            if(IFlag)
            {
                pScoreOne=pScoreOne + score;
                pScoreTwo=pScoreTwo + score2;
            }
            Score s=new Score();
            if(score==score2&&score==0&&IFlag)
            {
                IFlag=false;
                s.displayZero();
                world.addObject(s,698,707);
            }
            else if(score==score2&&score!=0&&IFlag)
            {
                IFlag=false;
                s.displayEqual();
                world.addObject(s,698,707);
            }
            else if(score>score2&&IFlag)
            {
                IFlag=false;
                //s.displayPlayer1();
                scoreboard.setState(p1);
                scoreboard.status();
                world.addObject(s,698,707);
            }
            else if(score<score2&&IFlag)
            {
                IFlag=false;
                //s.displayPlayer2();
                scoreboard.setState(p2);
                scoreboard.status();
                world.addObject(s,698,707);
            }
            
            Score s1=new Score();
            s1.displayOne(score);
            Score s2=new Score();
            s2.displayTwo(score2);
            Score s3=new Score();
            s3.displayTotalOne(pScoreOne);
            Score s4=new Score();
            s4.displayTotalTwo(pScoreTwo);
           // PersistantScore.addToBoard(score,score2);*/
            
            if(Greenfoot.mouseClicked(this))
            {
                //world.removeObject(s);
                //world.addObject(s1,668,800);
                //world.addObject(s2,668,840);
                //world.addObject(s3,356,822);
                //world.addObject(s4,356,830);
                //ScoreBoard sc=new ScoreBoard(display);
                System.out.println(command);
                command.execute();
                ChipsOne.cFlag=true; 
                ChipsTwo.cFlag=true;
                val=false;
            }

        }
    }   
    
   /* public void calculate(List<Dice> dicelist)
    {
            int sumOfDice = dicelist.get(0).faceValue + dicelist.get(1).faceValue + dicelist.get(2).faceValue;
            if(dicelist.get(0).faceValue==dicelist.get(1).faceValue && dicelist.get(0).faceValue==dicelist.get(2).faceValue)
            {
                selectTile("Triple");
            }

            if (sumOfDice > 3 && sumOfDice < 11) selectTile("Small");
            if (sumOfDice > 10 && sumOfDice < 18) selectTile("Big");
            if (sumOfDice != 3 && sumOfDice !=18) selectTile("Number_"+sumOfDice);
            int a[]=new int[3];
            a[0]=dicelist.get(0).faceValue;
            a[1]=dicelist.get(1).faceValue;
            a[2]=dicelist.get(2).faceValue;
            for(int i=0;i<a.length-1;i++)
            {
                for(int j=1;j<a.length;j++)
                {
                    if(a[i]>a[j])
                    {
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
            selectTile("Combo"+a[0]+"And"+a[1]);
            selectTile("Combo"+a[1]+"And"+a[2]);
            selectTile("Combo"+a[0]+"And"+a[2]);
            ScoreBoard scoreboard = new ScoreBoard();
            GameState p1=new PlayerOne();
            GameState p2 = new PlayerTwo();
            //if(IFlag)
            {
                pScoreOne=pScoreOne + score;
                pScoreTwo=pScoreTwo + score2;
            }
            Score s=new Score();
            if(score==score2&&score==0)
            {
                IFlag=false;
                //s.displayZero();
                //world.addObject(s,698,707);
                System.out.println("Equal zero");
            }
            else if(score==score2&&score!=0)
            {
                IFlag=false;
                //s.displayEqual();
                //world.addObject(s,698,707);
                System.out.println("Equal");
            }
            else if(score>score2)
            {
                IFlag=false;
                //s.displayPlayer1();
                scoreboard.setState(p1);
                scoreboard.status();
                //world.addObject(s,698,707);
            }
            else if(score<score2&&IFlag)
            {
                IFlag=false;
                //s.displayPlayer2();
                scoreboard.setState(p2);
                scoreboard.status();
               // world.addObject(s,698,707);
            }
            
            Score s1=new Score();
            s1.displayOne(score);
            Score s2=new Score();
            s2.displayTwo(score2);
            Score s3=new Score();
            s3.displayTotalOne(pScoreOne);
            Score s4=new Score();
            s4.displayTotalTwo(pScoreTwo);
           // PersistantScore.addToBoard(score,score2);
            
           /* if(Greenfoot.mouseClicked(this))
            {
                world.removeObject(s);
                world.addObject(s1,668,800);
                world.addObject(s2,668,840);
                world.addObject(s3,356,822);
                world.addObject(s4,356,830);*/
    /*            ChipsOne.cFlag=true; 
                ChipsTwo.cFlag=true;
                val=false;
            //}
    }

    public void selectTile(String string)
    {
        World world;
        world = getWorld();
        List<SicBoTiles> list = world.getObjects(SicBoTiles.class);
        List<ChipsOne> chiplist = world.getObjects(ChipsOne.class);
        List<ChipsTwo> chiplist2 = world.getObjects(ChipsTwo.class);
        for (int i = 0; i <list.size() ; i++) /* System.out.println( list.get(i)); */
      /*  {
            if((list.get(i).toString()).contains(string))
            { 
                list.get(i).highlight(); 
                for (int j = 0; j <chiplist.size() ; j++) 
                {
                    if(list.get(i).isChipOnIt(chiplist.get(j)))
                    {
                        score = score + chiplist.get(j).value * list.get(i).factor;
                    }
                }
                for (int j = 0; j <chiplist2.size() ; j++) 
                {
                    if(list.get(i).isChipOnItTwo(chiplist2.get(j)))
                    {
                        score2 = score2 + chiplist2.get(j).value * list.get(i).factor;
                    }
                }
            }
        }
    }*/
}
