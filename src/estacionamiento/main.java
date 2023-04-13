package estacionamiento;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;


public class main extends Application{


    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException{
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("view/main.fxml"));
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
        stage.setTitle("203405 Estacionamieno");
        stage.show();
        
    }
    
}
