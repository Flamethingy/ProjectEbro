/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;


import javafx.stage.Stage;
/**
 *
 * @author nico
 */
public class Main {
    
    ViewHandler view = new ViewHandler();
    EventHandler events = new EventHandler();
    
    public Main(){}
    
    
    public void init(Stage primaryStage){
        
        
        primaryStage.setTitle("TestApp");
        primaryStage.setScene(view.getScene());
        primaryStage.show();        
        
        events.init();
        run();
    }
    
    public void run(){
    
        events.run();
        view.setTitle(events.getTitle());
        view.setOutput(events.getOutput());
    
    
    }
    
}
