
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
public class Katana extends Weapons{
    public Katana(){
    name="Katana";
    id="katana";
    desc="Japan technology. Light, but vulnurable";
    damWeap="40-65";
    
    
    }
    
    public void displayWeapon(){
        System.out.println(name);
        System.out.println(desc);
        System.out.println(damWeap);
        System.out.println("Press e for equip");
    }
    
   
  
    
    
    
    public static int damage(){
    Random r= new Random();
    
    int damage=r.nextInt(20)+40; 
        System.out.println(damage);
    return damage;}
    
}
