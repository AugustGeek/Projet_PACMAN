package Model;

import javafx.scene.image.Image;
import java.awt.Rectangle;

import javafx.scene.image.ImageView;

public class Clyde extends Ghost{
	
	
	Clyde(Rectangle s, double x, double y, int mode){
		super(new ImageView(new Image(Clyde.class.getResourceAsStream("view/images/Clyde/right"))), 70, 70, 10, 10,  s,  x,  y, mode);
	}
}