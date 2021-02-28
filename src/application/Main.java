package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
    	stage.setTitle("Table View with Search");
    	
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Sample.fxml"));
        Scene scene = new Scene(root);
        
        JMetro jMetro = new JMetro(Style.LIGHT);
        jMetro.setScene(scene);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
