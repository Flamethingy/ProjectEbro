/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.util.ArrayList;

/**
 *
 * @author nico
 */
public class CreatureController {
    

    private ArrayList<Creature> creatureCollection = new ArrayList();

    public CreatureController() {
    }
    
    public void loadCreatures(){
    
        Creature creature1 = new Creature();
        Creature creature2 = new Creature();
        Creature creature3 = new Creature();
        Creature creature4 = new Creature();
        creature1.setId("001");
        creature2.setId("002");
        creature3.setId("003");
        creature4.setId("004");
        creature1.setName("Trixie");
        creature1.setGender(2);
        creature2.setName("Tim");
        creature2.setGender(1);
        creature3.setName("Paul");
        creature3.setGender(1);
        creature4.setName("Vanessa");
        creature4.setGender(2);
        
        Creature player = new Creature();
        player.setId("player");
        player.setName("Nico");
        
        creatureCollection.add(null);
        creatureCollection.add(creature1);
        creatureCollection.add(creature2);
        creatureCollection.add(player);
        creatureCollection.add(creature3);
        creatureCollection.add(creature4);
    
    }
    
    public Creature getPlayer(){
    
        for (Creature tempCreature : creatureCollection){
        
          if (tempCreature != null){
            if (tempCreature.getId().equals("player")){
                return tempCreature;
            }
          }
          }
        System.out.println("Player not found");
        return new Creature();
        
    }    
    
    public Creature getCreature(String id){
    
        for (Creature tempCreature : creatureCollection){
        
          if (tempCreature != null){
            if (tempCreature.getId().equals(id)){
                return tempCreature;
            }
           }
          }
        System.out.println("Creature '" + id + "' not found");
        return new Creature();
        
    } 
    
}
