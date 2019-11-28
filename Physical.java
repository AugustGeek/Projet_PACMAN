package Controller;
import Model.Entity;

public class Physical {
	
	boolean isCollision(Entity e1, Entity e2){
		if(e1.getShape().intersects(e2.getShape())) {return true;}
		return false;
	}
	
	void movement(Entity e){
		if(e.getPE_direction() != null) {
			if(e.getPE_direction() == "Left") { e.setPE_x(e.getPE_x() - e.getPE_vitesse()); }
			if(e.getPE_direction() == "Right") { e.setPE_x(e.getPE_x() + e.getPE_vitesse());}
			if(e.getPE_direction() == "Up") { e.setPE_x(e.getPE_y() + e.getPE_vitesse());}
			if(e.getPE_direction() == "Down") { e.setPE_x(e.getPE_y() - e.getPE_vitesse());}
		}
	}
	
	void stop(Entity e) {
		e.setPE_x(0);
	}
	
	
	
	
	
}
