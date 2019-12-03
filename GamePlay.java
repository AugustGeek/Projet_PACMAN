package Model;

import java.util.ArrayList;
import Controller.*;

public class GamePlay {
	
	public static ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public GamePlay()
	{
		Pacman p = new Pacman(30, 30, 30, 30);
		Wall w1 = new Wall(0, 0, 0, 0);
		Wall w2 = new Wall(30, 0, 30, 0);
		Wall w3 = new Wall(0, 30, 0, 30);
		Wall w4 = new Wall(30, 30, 30, 30);

		
		
		entities.add(p);
		entities.add(w1);
		entities.add(w2);
		entities.add(w3);
		//entyties.add(w4);


	}

	public static ArrayList<Entity> getEntyties() {
		return entities;
	}
	
	int type_Collision(Entity p, ArrayList<Entity> entities){
		Entity entite = new Entity();
		outerloop:
		for(Entity e : entities) {
			if(Physical.isCollision(p, e)) {
				entite = e;
				break outerloop;
			}
		}
		if(entite instanceof Wall) {
			return 0;
		}
		if(entite instanceof Small_coin) {
			return 1;
		}
		if(entite instanceof Big_coin) {
			return 2;
		}
		if(entite instanceof Ghost) {
			return 3;
		}
		else {
			return 999;
		}
	}
	
	
	/* A COMPLETER */
	
	void collision_Manager(Entity p, ArrayList<Entity> entities) {
		
		switch(type_Collision(p, entities)) {
		case 0 :
			//pac man s'arrête
			Physical.stop(p); //envoi de l'ordre au moteur physique
			//envoi de l'ordre au moteur physique
			break;
		case 1 : 
			//le score augmente
			//envoi de l'ordre d'afficher nouveau score au moteur graphique
			break;
		case 2 :			//Le super pouvoir du pacman

			//le score augmente
			//envoi de l'ordre d'afficher nouveau score au moteur graphique
			break;
		case 3 :
			//le joueur perd une vie
			//envoi de l'ordre d'afficher son nouveau nombre de vie au moteur graphique
			break;
		default :
			//erreur
		}
	}
	
	void health_Manager(boolean lifelost) {
		if(lifelost){ // perte d'une vie
			//si le joueur a moins de 2 vies ----> PERDU
			//sinon -----> vie - 1
		}
		else { //vie gagnee
			//si le pacman a moins de 4 vie ---> rajouter une vie
			//sinon rien faire
		}
	}
	/*
	 
	 
	 */

}
