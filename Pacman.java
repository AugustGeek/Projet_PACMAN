package Model;

import java.awt.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pacman extends Entity{
	
	
	Pacman(Rectangle s, double x, double y, int mode){
		super(new ImageView(new Image(Pacman.class.getResourceAsStream("view/images/Pacman/right"))), 50, 50, 10, 10,  s,  x,  y);
	}
}