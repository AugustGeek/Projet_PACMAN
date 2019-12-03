package Controller;
import Model.Entity;

public class Physical {
	
	public static boolean isCollision(Entity e1, Entity e2){
		if(e1.getShape().intersects(e2.getShape())) {return true;}
		return false;
	}
	
	public void movement_physical(Entity e){
		if(e.getPE_direction() != null) {
			if(e.getPE_direction() == "Left"){
				move_left(e);
			}
			if(e.getPE_direction() == "Right") { 
				move_right(e);
			}
			if(e.getPE_direction() == "Up") { 
				move_up(e);
			}
			if(e.getPE_direction() == "Down") { 
				move_down(e);
			}
		}
	}
	
	public static void move_left(Entity e) {
		e.setPE_x(e.getPE_x() - e.getPE_vitesse());
		e.setShapeLocation(e.getPE_x() - e.getPE_vitesse(), e.getPE_y());
	}
	public static void move_right(Entity e) {
		e.setPE_x(e.getPE_x() + e.getPE_vitesse());
		e.setShapeLocation(e.getPE_x() + e.getPE_vitesse(), e.getPE_y());
	}
	public static void move_up(Entity e) {
		e.setPE_x(e.getPE_x() - e.getPE_vitesse());
		e.setShapeLocation(e.getPE_x(), e.getPE_y() + e.getPE_vitesse());
	}
	public static void move_down(Entity e) {
		e.setPE_x(e.getPE_x() - e.getPE_vitesse());
		e.setShapeLocation(e.getPE_x(), e.getPE_y() - e.getPE_vitesse());
	}
	
	public static void stop(Entity e) {
		e.setPE_vitesse(0);
	}
	
	
	
}