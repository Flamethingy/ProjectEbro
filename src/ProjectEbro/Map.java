/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEbro;

import java.util.ArrayList;


/**
 *
 * @author nico
 */
public class Map {
    
    private String id;
    private String name;
    private String desc;
    
    private String north = "";
    private String south = "";
    private String east = "";
    private String west = "";
    
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

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        this.south = south;
    }

    public String getEast() {
        return east;
    }

    public void setEast(String east) {
        this.east = east;
    }

    public String getWest() {
        return west;
    }

    public void setWest(String west) {
        this.west = west;
    }
    
    
    
    
    
    public boolean containsCreature(String id){
    
     return creatures.contains(id);
    
    }
    
    public ArrayList<String> getCreatures(){
        
     return creatures;
        
    }
    
     public ArrayList<String> getCreaturesWithoutPlayer(){
        
     ArrayList<String> list = creatures;
     list.remove("player");
         
     return list;
        
    }
    
    public void addCreature(String id){
    
    creatures.add(id);
    
    }
    
    
    
    
}
