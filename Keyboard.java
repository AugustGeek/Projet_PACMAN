package View;

import javafx.scene.shape.*;
import Model.Pacman;
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
					Pacman.setPE_direction("Down");
				else if(ke.getCode().getName()=="Up")
					Pacman.setPE_direction("Up");
				else if(ke.getCode().getName()=="Right")
					Pacman.setPE_direction("Right");
				else if(ke.getCode().getName()=="Left")
					Pacman.setPE_direction("Left");
			}
		}); 

		this.setTranslateX(50);
		this.setTranslateY(50);
		this.getChildren().add(fond_clavier);
	}
}
