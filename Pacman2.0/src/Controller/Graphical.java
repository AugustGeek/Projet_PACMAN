package Controller;


import Model.Entity;
import Model.GamePlay;
import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Graphical extends Parent{

	public Graphical()
	{
		Rectangle fond_Systeme = new Rectangle();
		fond_Systeme.setWidth(900);
		fond_Systeme.setHeight(600);

		this.setTranslateX(0);
		this.setTranslateY(40);
		this.getChildren().add(fond_Systeme);		

	}
	
	public void init_board()
	{
		GamePlay gp = new GamePlay();
		for(int i=0; i<GamePlay.entities.size(); i++)
		{
			gp.getEntities().get(i).getGE_image().setFitHeight(gp.getEntities().get(i).getGE_h());
			gp.getEntities().get(i).getGE_image().setFitWidth(gp.getEntities().get(i).getGE_l());
			gp.getEntities().get(i).getGE_image().setTranslateX(gp.getEntities().get(i).getGE_x());
			gp.getEntities().get(i).getGE_image().setTranslateY(gp.getEntities().get(i).getGE_y());
			this.getChildren().add(gp.getEntities().get(i).getGE_image());
		}
	}
	
	public void change(Entity e, int x, int y)
	{
		e.setGE_x(e.getGE_x()+x);
		e.setGE_y(e.getGE_y()+y);
	}
	
	public void show(Entity e)
	{
		e.getGE_image().setFitHeight(e.getGE_h());
		e.getGE_image().setFitWidth(e.getGE_l());
		e.getGE_image().setTranslateX(e.getGE_x());
		e.getGE_image().setTranslateY(e.getGE_y());
		this.getChildren().add(e.getGE_image());
	}
	
	public static void translate(Entity e)
	{
		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(0.1),e.getGE_image()); 
		translateTransition.setFromY(e.getGE_y());
		translateTransition.setToY(e.getGE_y()+2);
		e.setGE_y(e.getGE_y()+2);
		translateTransition.setAutoReverse(true); 
		translateTransition.play();
	}


}
