/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
 
 // just to remind you that I still can't figure out the selection menu to equip any weapons. All weapons has their own class.
public class retiredBlacksmith extends NPC{
    public retiredBlacksmith(){
    name="Blacksmith";
    id="Blacksmith";
    hp=65;
    desc="He forged weapons. But he retired after the Hurricane hit his family. He finds people who seek revenge.";
    
    }
    public void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(desc);
        System.out.println("HP:"+hp);
        System.out.println("Press t to talk");

    }
    
    public static void introBlacks(){
        System.out.println("Hello young boy. Going for an adventure huh? Killing the Rages?");
        System.out.println("If that's your intention, I think I've found a person I could help.");
        System.out.println("Wanna some useful tools?");
    }
    public static void menuWeapons(){
        
        
        System.out.println("1-Katana");
        System.out.println("2-Excalibur");
        System.out.println("3-Blutsauger");
        System.out.println("0-Nope...");
                
    
    
    }
}
