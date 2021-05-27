/*
 * AnchorPane Layout
 * - 좌표를 지정하여 컨트롤을 배치하는 컨테이너
 */
package section04.s01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AnchorPaneLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AnchorPane Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
