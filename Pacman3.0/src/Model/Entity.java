package Model;

import javafx.scene.image.ImageView;
import java.awt.Rectangle;

public abstract class Entity{
	ImageView GE_image;
	 int GE_h, GE_l;
	 int GE_x, GE_y;
	 int PE_x, PE_y;
	 String PE_direction;
	String PE_next_direction;
	 Rectangle shape;
	 int PE_vitesse;


	
	 Entity(ImageView i, int h_image, int l_image, int x_image, int y_image, int x, int y){
		 GE_image = i;
		 GE_h = h_image;
		 GE_l = l_image;
		 GE_x = x_image;
		 GE_y = y_image;
		 shape=new Rectangle(x, y, l_image, h_image);
		 PE_x = x;
		 PE_y = y;
	 }
	

	public void setGE_image(ImageView gE_image) {
		GE_image = gE_image;
	}
	
	public void setGE_h(int gE_h) {
		GE_h = gE_h;
	}

	public void setGE_l(int gE_l) {
		GE_l = gE_l;
	}

	public  void setGE_x(int gE_x) {
		GE_x = gE_x;
	}

	public  void setGE_y(int gE_y) {
		GE_y = gE_y;
	}

	public  void setPE_x(int pE_x) {
		PE_x = pE_x;
	}

	public  void setPE_y(int pE_y) {
		PE_y = pE_y;
	}

	public  void setPE_direction(String pE_direction) {
		PE_direction = pE_direction;
	}

	public void setPE_next_direction(String pE_next_direction) {
		PE_next_direction = pE_next_direction;
	}

	public void setPE_vitesse(int pE_vitesse) {
		PE_vitesse = pE_vitesse;
	}
	
	public  int getPE_vitesse() {
		return PE_vitesse;
	}


	public ImageView getGE_image() {
		return GE_image;
	}

	public int getGE_h() {
		return GE_h;
	}

	public int getGE_l() {
		return GE_l;
	}

	public  int getGE_x() {
		return GE_x;
	}

	public  int getGE_y() {
		return GE_y;
	}

	public  int getPE_x() {
		return PE_x;
	}

	public  int getPE_y() {
		return PE_y;
	}

	public String getPE_direction() {
		return PE_direction;
	}

	public String getPE_next_direction() {
		return PE_next_direction;
	}

	public  Rectangle getShape() {
		return shape;
	}
	
	public void setShapeLocation(int x, int y)
	{
		this.shape.setLocation(x, y);
	}

}