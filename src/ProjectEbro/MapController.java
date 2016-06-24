/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEbro;

import java.util.ArrayList;


public class MapController {
    
    private ArrayList<Map> mapCollection = new ArrayList<>();
    
    
    public MapController(){}
    
    
    public void loadMaps(){
    
          Map map1 = new Map();
          Map map2 = new Map();
          Map map3 = new Map();
          Map map4 = new Map();
          
          map1.setId("001");
          map2.setId("002");
          map3.setId("003");
          map4.setId("004");
          
          map1.setName("ScrapYard");
          map2.setName("Barrack");
          map3.setName("Alley");
          map4.setName("Exit");
          
          map1.setDesc("Alot of trash is laying here.");
          map2.setDesc("You spot a House.");
          map3.setDesc("It's really dark. You barely can see where you step.");
          map4.setDesc("There is hope!");
          
          map1.setNorth("002");
          map1.setEast("003");
          map2.setSouth("001");
          map3.setWest("001");
          map3.setNorth("004");
          map4.setSouth("003");
          
          mapCollection.add(null);
          mapCollection.add(map1);
          mapCollection.add(map2);
          mapCollection.add(map3);
          mapCollection.add(map4);
          
          
    }
    
    public Map getPlayerLocation(){
    
        for (Map tempMap : mapCollection){
           
           if (tempMap != null){ 
             if (tempMap.containsCreature("player")){
                    return tempMap;}
           }
        }
        
        System.out.println("Player not found in world.");
        return new Map();
        
    }
    
    public Map getNorth(){
        return getMap(getPlayerLocation().getNorth()); 
    }
    
    public Map getSouth(){
        return getMap(getPlayerLocation().getSouth());
    }
    
    public Map getEast(){
        return getMap(getPlayerLocation().getEast());
    }
    
    public Map getWest(){
        return getMap(getPlayerLocation().getWest());
    }
    
    public Map getMap(String id){
    
            for (Map tempMap : mapCollection){
           
           if (tempMap != null ){ 
             if (tempMap.getId().equals(id)){
                    return tempMap;}
           }
        }
        
        System.out.println("Map '" + id + "' not found");
        return new Map();
    
    }
    
    private int getMapId(String id){
    
        for(int n = 1; n<= mapCollection.size();n++){
        
           
            if (mapCollection.get(n).getId().equals(id)){
                return n;
            }
        }          
        System.out.println("Map '" + id + "' not found");
        
        return 0;

    }
    
    

}
