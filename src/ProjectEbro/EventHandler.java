
package ProjectEbro;


public class EventHandler {
    
    private MapController maps = new MapController();
    private CreatureController creatures = new CreatureController();
    private Ticket ticket = new Ticket();

    
    public EventHandler() {
    }
    
    
    public void init(){
    
    maps.loadMaps();
    creatures.loadCreatures();
    
    
    maps.getMap("003").addCreature("player");
    maps.getMap("003").addCreature("001");
    maps.getMap("001").addCreature("002");
    maps.getMap("003").addCreature("003");
    maps.getMap("004").addCreature("004");

    }
       
    public void run(){

        ticket.setOutput(maps.getPlayerLocation().getDesc());
        ticket.setTitle(maps.getPlayerLocation().getName());

    }

    public Ticket getTicket() {
        return ticket;
    }
    
    
    private void fillOptions(){
    
      ticket.setOptions("", "",
                        maps.getNorth().getId(), maps.getNorth().getName(), 
                        "", "", 
                        maps.getWest().getId(), maps.getWest().getName(), 
                        "stay", "Stay", 
                        maps.getEast().getId(), maps.getEast().getName(), 
                        "", "", 
                        maps.getSouth().getId(), maps.getSouth().getName(), 
                        "", "");
    
    
    }
    
    
    


    
}
