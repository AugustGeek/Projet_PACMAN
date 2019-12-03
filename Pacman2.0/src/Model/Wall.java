package Model;

import java.awt.Rectangle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Wall extends Entity{
	
	
	Wall(int x_image, int y_image, int x, int y){
		super(new ImageView(new Image(Wall.class.getResourceAsStream("images/wall/wall"))), 30, 30, x_image, y_image,  x,  y);
	}
}