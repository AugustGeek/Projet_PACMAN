package Model;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pacman extends Entity{
	
	
	public Pacman(int x_image, int y_image, int x, int y){
		super(new ImageView(new Image(Pacman.class.getResourceAsStream("images/closed/right"))), 30, 30, x_image, y_image,  x,  y);
	}
}
