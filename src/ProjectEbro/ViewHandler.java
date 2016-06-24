/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEbro;


import java.util.Observable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


/**
 *
 * @author nico
 */
public class ViewHandler extends Observable{
 
    
    final int windowWidth = 1000;
    final int windowHeight = 800;
    
    private Ticket ticket = new Ticket();
    
    private int input = 0; 
    
    private StackPane root = new StackPane();
    private Scene scene = new Scene(root, windowWidth, windowHeight);
  
    private StackPane outputPane = new StackPane();
    private Label output = new Label("TestDesc");
    private StackPane namePane = new StackPane();
    private Label name = new Label("TestName");
    private HBox buttonPane1 = new HBox();
    private HBox buttonPane2 = new HBox();
    private HBox buttonPane3 = new HBox();
    private VBox buttonPanePane = new VBox();
    
    private Button btn1 = new Button("Option1");
    private Button btn2 = new Button("Option2");
    private Button btn3 = new Button("Option3");
    private Button btn4 = new Button("Option4");
    private Button btn5 = new Button("Option5");
    private Button btn6 = new Button("Option6");
    private Button btn7 = new Button("Option7");
    private Button btn8 = new Button("Option8");
    private Button btn9 = new Button("Option9");
    
    
    public ViewHandler() {
        
        outputPane.setAlignment(Pos.CENTER);
        outputPane.getChildren().add(output);
        namePane.setAlignment((Pos.TOP_CENTER));
        namePane.getChildren().add(name);
        buttonPanePane.setAlignment(Pos.BOTTOM_CENTER);
        buttonPane1.getChildren().add(btn1);
        buttonPane1.getChildren().add(btn2);
        buttonPane1.getChildren().add(btn3);
        buttonPane2.getChildren().add(btn4);
        buttonPane2.getChildren().add(btn5);
        buttonPane2.getChildren().add(btn6);
        buttonPane3.getChildren().add(btn7);
        buttonPane3.getChildren().add(btn8);
        buttonPane3.getChildren().add(btn9);
        root.getChildren().add(outputPane);
        root.getChildren().add(namePane);
        buttonPanePane.getChildren().add(buttonPane1);
        buttonPanePane.getChildren().add(buttonPane2);
        buttonPanePane.getChildren().add(buttonPane3);
        root.getChildren().add(buttonPanePane);
        btn1.setOnAction((event)->{setInput(1);});
        btn2.setOnAction((event)->{setInput(2);});
        btn3.setOnAction((event)->{setInput(3);});
        btn4.setOnAction((event)->{setInput(4);});
        btn5.setOnAction((event)->{setInput(5);});
        btn6.setOnAction((event)->{setInput(6);});
        btn7.setOnAction((event)->{setInput(7);});
        btn8.setOnAction((event)->{setInput(8);});
        btn9.setOnAction((event)->{setInput(9);});
    }


    
    public StackPane getRoot() {
        return root;
    }

    public Scene getScene() {
        return scene;
    }
    
    public void clearInput(){
    input = 0;
    }
    
    private void setInput(int i){
    
    input = i;
    setChanged();
    notifyObservers();
    
    }


    public void synchronize(Ticket aTicket){
    
        ticket.setOutput(aTicket.getOutput());
        ticket.setTitle(aTicket.getTitle());
        
        update();
    }
        
    public void update(){
    
       output.setText(ticket.getOutput());
       name.setText(ticket.getTitle());

    }
    
   
     
        
        
        
        
    
    
}
