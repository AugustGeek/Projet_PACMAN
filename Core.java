package Controller;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Entity;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;
import static java.lang.Math.random;

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

	Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(5), new EventHandler<ActionEvent>() {

	    @Override
	    public void handle(ActionEvent event) {
	        System.out.println("this is called every 5 seconds on UI thread");
	    }
	}));
	fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
	fiveSecondsWonder.play();
	
}

