package Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Clyde extends Ghost{
	
	
	Clyde(int x, int y, int mode){
		super(new ImageView(new Image(Clyde.class.getResourceAsStream("images/Clyde/right"))), 70, 70, 10, 10,  x,  y, mode);
	}
}