/*
 * --module-path ${PATH_TO_JAVAFX} --add-modules=javafx.controls
 */
package section02.s02;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StageScene extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox();		// 컨테이너(버티칼)
		vbox.setPrefWidth(400);		// 폭
		vbox.setPrefHeight(200);	// 높이
		vbox.setAlignment(Pos.CENTER);	// 정렬(배치:왼쪽,가운데, 오른쪽, ..)
		vbox.setSpacing(20);
		
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("종료버튼");
		button.setOnAction(event->Platform.exit());  // 이벤트

		vbox.getChildren().add(label);
		vbox.getChildren().add(button);
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setTitle("Stage & Scene Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
