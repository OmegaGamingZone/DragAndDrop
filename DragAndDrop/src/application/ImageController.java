package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {
	private Image And = new Image("AND.png", 100, 100, true, true, true);// Se asigna la imagen
	private ImageView And_ = new ImageView(And);// Se asigna imagen para uso como objeto
	public Image getAnd() {
		return And;
	}
	public void setAnd(Image and) {
		And = and;
	}
	public ImageView getAnd_() {
		return And_;
	}
	public void setAnd_(ImageView and_) {
		And_ = and_;
	}
}
