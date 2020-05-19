
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
public class wisepanda extends NPC{
    public wisepanda(){
    name= "Wise Panda";
    id="Wise Panda";
    desc="He's a panda, but hey look, he's wise!";
    hp=75;
    }
public void display(){
    System.out.println(name);
    System.out.println(desc);
    System.out.println("HP:"+hp);



}

public void dialogue1(){
    System.out.println("Young man, you seems in trouble.");
    System.out.println("Do you need some recovery?");
    System.out.println("I know fighting with the Chicken is no easy.");
    System.out.println("But of course...you need justice. I won't let you down");
}
    
    
    
    public int heal (){
       Random r = new Random();
        System.out.println("By the power I have, I shall return you to the great health");
        int maxheal=25;
        int healpoint=r.nextInt(maxheal)+10;
        System.out.println("You gained "+healpoint+" Health!");
        System.out.println("Ok now? Go young man!  ");
        return healpoint;
    
    }
    
   



}
