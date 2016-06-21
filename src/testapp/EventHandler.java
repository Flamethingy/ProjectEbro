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
public class EventHandler {
    
    private MapController maps = new MapController();
    private CreatureController creatures = new CreatureController();

    private String output;
    private String title;
    
    public EventHandler() {
    }
    
    
    public void init(){
    
    maps.loadMaps();
    creatures.loadCreatures();
    
    maps.addCreature("player", "003");
    maps.addCreature("001","003");
    maps.addCreature("002","001");
    maps.addCreature("003", "003");
    maps.addCreature("004", "004");   
    }
       
    public void run(){
        
        
        
        
        output = maps.getPlayerLocation().getDesc();
        title = maps.getPlayerLocation().getName();
        
        for(String tempString : maps.getPlayerLocation().getCreatures()){
        
            if (tempString != null)
                output = output + "\n"+"Meet " + creatures.getCreature(tempString).getName();
        }
        
    
    }
    
    

    public String getOutput() {
        return output;
    }

    public String getTitle() {
        return title;
    }
    
}
