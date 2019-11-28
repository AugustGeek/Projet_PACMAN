package Model;

import java.awt.Rectangle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Inky extends Ghost{
	
	
	Inky(Rectangle s, double x, double y, int mode){
		super(new ImageView(new Image(Inky.class.getResourceAsStream("view/images/Inky/right"))), 70, 70, 10, 10,  s,  x,  y, mode);
	}
}