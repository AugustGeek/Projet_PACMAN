package Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Big_coin extends Entity{
	
	public Big_coin(int x_image, int y_image, int x, int y){
		super(new ImageView(new Image(Pacman.class.getResourceAsStream("images/Pastille/big"))), 30, 30, x_image, y_image,  x,  y);
	}
}