package Model;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Inky extends Ghost{
	
	
	Inky(int x, int y, int mode){
		super(new ImageView(new Image(Inky.class.getResourceAsStream("images/Inky/right"))), 70, 70, 10, 10, x,  y, mode);
	}
}