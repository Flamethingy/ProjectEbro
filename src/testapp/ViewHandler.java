/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 *
 * @author nico
 */
public class ViewHandler {
 
    
    final int windowWidth = 1000;
    final int windowHeight = 800;
    
    private StackPane root = new StackPane();
    private Scene scene = new Scene(root, windowWidth, windowHeight);
  
    private StackPane descPane = new StackPane();
    private Label desc = new Label("TestDesc");
    private StackPane namePane = new StackPane();
    private Label name = new Label("TestName");
    
    
    
    public ViewHandler() {
        
        descPane.setAlignment(Pos.CENTER);
        descPane.getChildren().add(desc);
        namePane.setAlignment((Pos.TOP_CENTER));
        namePane.getChildren().add(name);
        
        root.getChildren().add(descPane);
        root.getChildren().add(namePane);
    }

    public StackPane getRoot() {
        return root;
    }

    public Scene getScene() {
        return scene;
    }
    
    public void addText(String text){
    
    Label str = new Label(text);
    root.getChildren().add(str);
    
    
    }
    
    public void setTitle(String text){
    name.setText(text);
    }
    
    public void setOutput(String text){
    
    desc.setText(text);
    }
        
        
        
        
        
        
        
        
    
    
}
