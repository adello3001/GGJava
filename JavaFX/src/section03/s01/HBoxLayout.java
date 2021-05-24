/*
 * JavaFX Layout
 * - 자바코드에서 프로그램적으로 레이아웃을 코드 방식
 */
package section03.s01;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HBoxLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(50));
		hbox.setSpacing(50);
		
		TextField textField = new TextField();
		textField.setPrefWidth(200);
		textField.setPrefHeight(50);
		textField.setFont(new Font(30));
		
		Button button = new Button();
		button.setText("확인");
		
		ObservableList list = hbox.getChildren();
		list.add(textField);
		list.add(button);
		
		Scene scene =  new Scene(hbox);
		
		primaryStage.setTitle("HBox Layout Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
