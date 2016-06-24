
package ProjectEbro;

import javafx.application.Application;
import javafx.stage.Stage;


public class ProjectEbro extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Main main = new Main();
        main.init(primaryStage);
       
        
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
