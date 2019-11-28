package Model;

import java.awt.Rectangle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pinky extends Ghost{
	
	
	Pinky(Rectangle s, double x, double y, int mode){
		super(new ImageView(new Image(Pinky.class.getResourceAsStream("view/images/Pinky/right"))), 70, 70, 10, 10,  s,  x,  y, mode);
	}
}