package Model;


public interface Physic_entity {
	
	public void setPE_x(int pE_x);

	public void setPE_y(int pE_y);

	public static void setPE_direction(String pE_direction) {
	}

	public void setPE_next_direction(String pE_next_direction);
	
	public void setPE_vitesse(int vitesse);
	
	public int getPE_vitesse();
	
	public int getPE_x();

	public int getPE_y();

	public String getPE_direction();

	public String getPE_next_direction();

}
