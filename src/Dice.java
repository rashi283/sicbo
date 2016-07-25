import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice extends Actor implements ISubject
{
    int faceValue = 0;
    static int counter=0;
    int score,score2,pScoreOne,pScoreTwo;
    IObserver iobserver;
    
    public void addObserver(IObserver io)
    {
        this.iobserver=io;
    }
    
    public void notifyObserver(List<Dice> dicelist,List<SicBoTiles> list)
    {
        iobserver.update(dicelist,list);
    }
    
    public void Dice() 
    {
        setFace();
        
    }
    public void check()
    {
      if(counter>0&&!Greenfoot.isKeyDown("space"))
        {
            ScoreBoard.IFlag=true;
            counter=0;
            ScoreBoard.val=true;
            //ScoreBoard sb=new ScoreBoard();
            calculate();
        }  
    }
    public void act() 
    {
        roll();
        
    }
    public void roll()
    {
   
    if (Greenfoot.isKeyDown("space"))
         { 
            World world; world = getWorld(); int i = 0;
            ChipsOne.cFlag=false;
            ChipsTwo.cFlag=false;
            List<SicBoTiles> list = world.getObjects(SicBoTiles.class);
            for ( i = 0; i <list.size() ; i++) list.get(i).reset();
            int rolls = Greenfoot.getRandomNumber(200);
            while (rolls > 0 )
            {
              setFace();
              rolls--;
            }
            counter++;
            }
     else
     {
         check();
        }
    }

   public void setFace()
   {
    int xx = Greenfoot.getRandomNumber(6);
    if(faceValue == 0)
             {
               faceValue = 6;
               
             }
             
    if (xx == 1)
             {
               setImage("DiceOne.PNG");
               faceValue = 1;
               }
    if (xx == 2)
              {
               setImage("DiceTwo.PNG");
               faceValue = 2;
            }
    if (xx == 3)
             {
               setImage("DiceThree.PNG");
               faceValue = 3;
            }
    if (xx == 4)
            {
               setImage("DiceFour.PNG");
               faceValue = 4;
            }
    if (xx == 5)
             {
               setImage("DiceFive.PNG");
               faceValue = 5;
            }
    if (xx == 6)
             {
               setImage("DiceSix.PNG");
               faceValue = 6;
              }
    }
    
    public void calculate()
    {
            score=0;
            score2=0;
            World world;
            world = getWorld();
            List<Dice> dicelist = world.getObjects(Dice.class);
            int sumOfDice = dicelist.get(0).faceValue + dicelist.get(1).faceValue + dicelist.get(2).faceValue;
            if(dicelist.get(0).faceValue==dicelist.get(1).faceValue && dicelist.get(0).faceValue==dicelist.get(2).faceValue)
            {
                selectTile("Triple");
            }
                    List<SicBoTiles> list = world.getObjects(SicBoTiles.class);
            this.notifyObserver(dicelist,list);
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
            //ScoreBoard scoreboard = new ScoreBoard();
            
            //GameState p1=new PlayerOne();
            //GameState p2 = new PlayerTwo();
            //if(IFlag)
            
            IPlayer p1 = new PlayerOne();
            IPlayer p2 = new PlayerTwo();
            ICommand display;
            List<ScoreBoard> scoreboard = world.getObjects(ScoreBoard.class);
            {
                pScoreOne=pScoreOne + score;
                pScoreTwo=pScoreTwo + score2;
            }
            Score s=new Score();
            if(score==score2&&score==0)
            {
                //world.addObject(s,698,707);
                System.out.println("Equal zero");
            }
            else if(score==score2&&score!=0)
            {
                //world.addObject(s,698,707);
                System.out.println("Equal");
            }
            else if(score>score2)
            {
              //  scoreboard.setState(p1);
               // scoreboard.status();
                //world.addObject(s,698,707);
                display = new Display(p1);
                scoreboard.get(0).setCommand(display);
            }
            else if(score<score2)
            {
                //s/coreboard.setState(p2);
                //scoreboard.status();
               // world.addObject(s,698,707);
               display = new Display(p2);
               scoreboard.get(0).setCommand(display);
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
                ChipsOne.cFlag=true; 
                ChipsTwo.cFlag=true;
              
    }
    
     public void selectTile(String string)
    {
        World world;
        world = getWorld();
        List<SicBoTiles> list = world.getObjects(SicBoTiles.class);
        List<ChipsOne> chiplist = world.getObjects(ChipsOne.class);
        List<ChipsTwo> chiplist2 = world.getObjects(ChipsTwo.class);
        for (int i = 0; i <list.size() ; i++) /* System.out.println( list.get(i)); */
        {
            if((list.get(i).toString()).contains(string))
            { 
                //list.get(i).highlight(); 
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
    }
}
