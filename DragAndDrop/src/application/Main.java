package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Main extends Application {
	Pane target = new Pane();
	ScrollPane SP = new ScrollPane();
	DragAndDrop Dnd = new DragAndDrop();
	VBox VB = new VBox();
	Scene scene = new Scene(target, 600, 600);
	ImageController IC = new ImageController();
	@Override
	public void start(Stage primaryStage) {
		SP.setPrefSize(100, 600);
		Dnd.EstablishtTarget(IC.getAnd_(), target);
		VB.getChildren().add(IC.getAnd_());
		SP.setContent(VB);
		target.getChildren().add(SP);
		primaryStage.setResizable(true);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
