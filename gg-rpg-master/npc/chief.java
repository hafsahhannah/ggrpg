/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class chief extends NPC{

  
    public chief() {
id= "chief";
hp= 75;

accuracy= 50;
desc= "Your master. Heed him, as he owns knowledge.";
name= "Chief";

}
 //can anyone adjust it to be accessible to player in certain condition???
    public void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(desc);
        System.out.println("HP:"+hp);
        System.out.println("Press t to talk");

    }
   //Where should actually I put this..... 
   
    
}
