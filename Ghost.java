package Model;

import java.awt.Rectangle;
import javafx.scene.image.ImageView;

public class Ghost extends Entity{
	private int mode;
	
	Ghost(ImageView i, double h_image, double l_image, double x_image, double y_image, Rectangle s, double x, double y, int mode){
		super(i, 70, 70, 10, y,  s,  x,  y);
		this.mode = mode;
	}

}
