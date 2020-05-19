
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Priest extends NPC{
   
    public Priest (){
    name="Priest";
    desc="He is the bridge between anyone and God. Ask him some advice or prayers. With his wisdom and faith, he'll help.";
    hp=60;
    id="Priest";
   
    }
    
    public void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(desc);
        System.out.println("HP:"+hp);
        System.out.println("Press t to talk");

    }
    public static void dialogueP(){
        System.out.println("Dear servant of The Almighty, what bring you here?");
        System.out.println("1-I'm hurt. Do something.");
        System.out.println("2-Pray for me.");
    }
    
    public static int heal (){
       Random r = new Random();
        System.out.println("By the knowledge given by The Almighty, I shall return you to the great health");
        int maxheal=35;
        int healpoint=r.nextInt(maxheal);
        System.out.println("You gained "+healpoint+" Health!");
        
        return healpoint;
    
    }

}


