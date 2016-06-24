
package ProjectEbro;



import java.util.Observable;
import java.util.Observer;
import javafx.stage.Stage;

public class Main implements Observer {
    
    ViewHandler view = new ViewHandler();
    EventHandler events = new EventHandler();
    
    public Main(){}
    
    
    public void init(Stage primaryStage){
        
        
        primaryStage.setTitle("ProjectEbro");
        primaryStage.setScene(view.getScene());
        primaryStage.show();        
        
        events.init();
        view.addObserver(this);
        run();
    }
    
    public void run(){
    
            events.run();
            view.synchronize(events.getTicket());
            

       }

    @Override
    public void update(Observable o, Object o1) {
        
        run();
        
    }
       
     
        
    
    
}
