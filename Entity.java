package Model;

import javafx.scene.image.ImageView;
import java.awt.Rectangle;

public abstract class Entity implements Graphic_entity, Physic_entity{
	ImageView GE_image;
	double GE_h, GE_l, GE_x, GE_y;
	double PE_x, PE_y;
	String PE_direction;
	String PE_next_direction;
	Rectangle shape;


	
	 Entity(ImageView i, double h_image, double l_image, double x_image, double y_image, Rectangle s, double x, double y){
		 GE_image = i;
		 GE_h = h_image;
		 GE_l = l_image;
		 GE_x = x_image;
		 GE_y = y_image;
		 shape=s;
		 PE_x = x;
		 PE_y = y;
	 }
	
	

	public void setGE_image(ImageView gE_image) {
		GE_image = gE_image;
	}
	
	public void setGE_h(double gE_h) {
		GE_h = gE_h;
	}

	public void setGE_l(double gE_l) {
		GE_l = gE_l;
	}

	public void setGE_x(double gE_x) {
		GE_x = gE_x;
	}

	public void setGE_y(double gE_y) {
		GE_y = gE_y;
	}

	public void setPE_x(double pE_x) {
		PE_x = pE_x;
	}

	public void setPE_y(double pE_y) {
		PE_y = pE_y;
	}

	public void setPE_direction(String pE_direction) {
		PE_direction = pE_direction;
	}

	public void setPE_next_direction(String pE_next_direction) {
		PE_next_direction = pE_next_direction;
	}

	public void setShape(Rectangle shape) {
		this.shape = shape;
	}

	public ImageView getGE_image() {
		return GE_image;
	}

	public double getGE_h() {
		return GE_h;
	}

	public double getGE_l() {
		return GE_l;
	}

	public double getGE_x() {
		return GE_x;
	}

	public double getGE_y() {
		return GE_y;
	}

	public double getPE_x() {
		return PE_x;
	}

	public double getPE_y() {
		return PE_y;
	}

	public String getPE_direction() {
		return PE_direction;
	}

	public String getPE_next_direction() {
		return PE_next_direction;
	}

	public Rectangle getShape() {
		return shape;
	}

}

