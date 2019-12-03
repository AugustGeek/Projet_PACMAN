
package Model;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class Blinky extends Ghost{	
	
	Blinky(int x_image, int y_image, int x, int y, int mode){
		super(new ImageView(new Image(Blinky.class.getResourceAsStream("images/Blinky/right"))), 30, 30,  x_image, y_image, x,  y, mode);
	}
}