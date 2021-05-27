/*
 * 커스텀 다이얼로그 컨트롤
 */
package section09.s03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomDialogControls extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Custom Dialog Controls Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
