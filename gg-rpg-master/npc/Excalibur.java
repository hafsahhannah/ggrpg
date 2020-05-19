
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
public class Excalibur extends Weapons{
    public Excalibur(){
    name="Excalibur";
    id="excalibur";
    desc="A copy ori weapon. Made in China because England blacksmith goes on strike. Grade triple A, good one";
    damWeap="30-65";
    }
    
    public void displayWeapon(){
    System.out.println(name);
        System.out.println(desc);
        System.out.println(damWeap);
        System.out.println("Press e for equip");}

public static int damage(){
Random r = new Random();
int damage=r.nextInt(35)+30;
    System.out.println("Damage:"+damage);
return damage;
}


}
