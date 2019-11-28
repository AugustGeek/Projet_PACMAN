package Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Blinky extends Ghost{
	
	
	Blinky(Shape s, double x, double y, int mode){
		super(new ImageView(new Image(Blinky.class.getResourceAsStream("view/images/Blinky/right"))), 70, 70, 10, 10,  s,  x,  y, mode);
	}
}
