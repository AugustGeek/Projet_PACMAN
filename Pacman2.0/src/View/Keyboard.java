package View;

import javafx.scene.shape.*;
import Controller.Graphical;
import Model.GamePlay;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.KeyEvent;

public class Keyboard extends Parent{


	public Keyboard(){

		
		Rectangle fond_clavier = new Rectangle();
		fond_clavier.setWidth(0);
		fond_clavier.setHeight(0); 
		fond_clavier.setFocusTraversable(true); 
		fond_clavier.setOnKeyPressed(new EventHandler<KeyEvent>(){
			public void handle(KeyEvent ke){
				if(ke.getCode().getName()=="Down")
					Graphical.translate(GamePlay.getEntities().get(0));
					//Pacman.setPE_direction("Down");
				else if(ke.getCode().getName()=="Up")
					Graphical.translate(GamePlay.getEntities().get(0));
					//Pacman.setPE_direction("Up");
				else if(ke.getCode().getName()=="Right")
					Graphical.translate(GamePlay.getEntities().get(0));
					//Pacman.setPE_direction("Right");
				else if(ke.getCode().getName()=="Left")
					Graphical.translate(GamePlay.getEntities().get(0));
					//Pacman.setPE_direction("Left");
			}
		}); 

		this.setTranslateX(50);
		this.setTranslateY(50);
		this.getChildren().add(fond_clavier);
	}
}
