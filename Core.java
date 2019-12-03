package Controller;

import java.util.ArrayList;
import Model.Entity;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.util.Duration;


public class Core {
	
	int nbr_Dots, nbr_Lives;
	public static ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public Core(int nbr_Dots, int nbr_Lives) {
		this.nbr_Dots =nbr_Dots;
		this.nbr_Lives=nbr_Lives;
	}
	
	public void set_nbr_Dots(int nbr_Dots) {
		this.nbr_Dots = nbr_Dots;
	}
	
	public void set_nbr_Lives(int nbr_Lives) {
		this.nbr_Lives = nbr_Lives;
	}
	
	
	Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.millis(1), new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent event) {
	        System.out.println("this is called every 5 seconds on UI thread");
	    }
	}));
	void timer() {
		fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
		fiveSecondsWonder.play();
	}
	
	
}

