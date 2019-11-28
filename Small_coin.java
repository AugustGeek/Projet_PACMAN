package Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Small_coin extends Entity{
	
	public Small_coin(int x_image, int y_image, int x, int y){
		super(new ImageView(new Image(Pacman.class.getResourceAsStream("images/Pastille/small"))), 30, 30, x_image, y_image,  x,  y);
	}
}
