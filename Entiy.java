package Pacman;


abstract class Entity implements Graphic_entity, Physic_entity{
	ImageView GE_image;
	double GE_h, GE_l, GE_x, GE_y;
	double PE_x, PE_y;
	char PE_direction;
	char PE_next_direction;
	Shape shape;
	
	Entity(){
		super();
		
	}
	
}
class Shape{
	double h, l;
	Shape(double h, double l){
		this.h =h;
		this.l=l;
	}
}
