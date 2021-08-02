package section01.s01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloFX2 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox();		// 컨테이너(버티칼)
		vbox.setPrefWidth(400);		// 폭
		vbox.setPrefHeight(200);	// 높이
		vbox.setAlignment(Pos.CENTER);	// 정렬(배치:왼쪽,가운데, 오른쪽, ..)
		vbox.setSpacing(20);
		
		Label hello = new Label();
		hello.setText("Hello");
		hello.setFont(new Font(50));

		Label javaFX = new Label();
		javaFX.setText("JavaFX");
		javaFX.setFont(new Font(50));

		vbox.getChildren().add(hello);
		vbox.getChildren().add(javaFX);
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setTitle("Hello JavaFX Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
