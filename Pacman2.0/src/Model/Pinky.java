package Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pinky extends Ghost{
	
	
	Pinky(int x, int y, int mode){
		super(new ImageView(new Image(Pinky.class.getResourceAsStream("images/Pinky/right"))), 70, 70, 10, 10, x,  y, mode);
	}
}