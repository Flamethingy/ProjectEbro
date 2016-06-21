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
public class Map {
    
    private String id;
    private String name;
    private String desc;
    
    private ArrayList<String> creatures = new ArrayList();

    public Map() {
        
    }

    public Map(String id) {
        this.id = id;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public boolean containsCreature(String id){
    
     return creatures.contains(id);
    
    }
    
    public ArrayList<String> getCreatures(){
        
     return creatures;
        
    }
    
    public void addCreature(String id){
    
    creatures.add(id);
    
    }
    
    
    
    
}
