/*
 * StackPane Container Layout
 * - 컨트롤을 겹쳐서 쌓는 형태의 배치 레이아웃
 * - 카드 레이아웃
 * - 쌓는 순서는 먼저 들어가는 것이 아래로 배치
 * - 맨 마지막에 쌓는 컨트롤이 최상단에 배치
 * - 불투명이면 맨 위의 컨트롤만 보이게 된다.
 * - 레이어 형태의 배치
 */
package section04.s07;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StackPaneLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("StackPane Container Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
