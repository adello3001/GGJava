package section03.s02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PaddingMargin extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(50,10,10,50)); // top, right, bottom, left
		hbox.setSpacing(10);
		
		Button button1 = new Button();
		button1.setText("버튼1");
		button1.setPrefSize(100,100); // width, height
		
		Button button2 = new Button();
		button2.setText("버튼2");
		button2.setPrefSize(100,100); // width, height

		hbox.getChildren().add(button1);
		hbox.getChildren().add(button2);
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("Padding & Margin Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
