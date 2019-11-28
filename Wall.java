package Model;

import java.awt.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Wall extends Entity{
	
	
	Wall(Rectangle s, double x, double y, int mode){
		super(new ImageView(new Image(Wall.class.getResourceAsStream("view/images/Wall/right"))), 70, 70, 10, 10,  s,  x,  y);
	}
}