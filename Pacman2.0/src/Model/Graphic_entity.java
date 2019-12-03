package Model;

import javafx.scene.image.ImageView;

public interface Graphic_entity {		
		

		public static void setGE_image(ImageView gE_image){
		}
		
		public void setGE_h(int gE_h);

		public void setGE_l(int gE_l);

		public static void setGE_x(int gE_x){
		}

		public static void setGE_y(int gE_y){
		}


		public ImageView getGE_image();

		public int getGE_h();

		public int getGE_l();

		public static int getGE_x(){
			return 0;
		}

		public static int getGE_y(){
			return 0;
		}

}
