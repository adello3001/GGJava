/*
 * 미디어 컨트롤
 * - MediaView
 * - MediaPlayer
 * - ProgressBar
 * - ProgressIndicateor
 * - Slider
 */
package section07.s04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MediaControls extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Media Controls Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
