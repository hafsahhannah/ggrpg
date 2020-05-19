
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
public class Blutsauger extends Weapons{
    public Blutsauger(){
    name="Blutsauger";
    id="Blutsauger";
    desc="Bloodsucker in Germany. Germany quality, it sucks for those who are weak";
    damWeap="35-70";
    
    
    
    
    }
    
    public void displayWeapon(){
    System.out.println(name);
        System.out.println(desc);
        System.out.println(damWeap);
        System.out.println("Press e for equip");
    }
    
    
    
    public static int damage(){
    Random r= new Random();
    int damage=r.nextInt(35)+35;
        System.out.println("Damage:"+ damage);
    return damage;}
    
    
}
