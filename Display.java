package View;

import Controller.Graphical;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Display extends Application {
	
	public static void main(String[] args) {
        Application.launch(Display.class, args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pacman");
        Group root = new Group();
        Scene scene = new Scene(root, 900, 640, Color.WHITESMOKE);
        

        Graphical game = new Graphical();
        //while(true)
        game.init_board();
        Keyboard k = new Keyboard();

        root.getChildren().add(k);
        root.getChildren().add(game);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
