package Model;


import java.awt.Rectangle;

import javafx.scene.image.ImageView;

public class Ghost extends Entity{
	private int mode;
	
	Ghost(ImageView i, int h_image, int l_image, int x_image, int y_image, int x, int y, int mode){
		super(i, h_image, l_image, x_image, y_image, x,  y);
		this.mode = mode;
	}

}