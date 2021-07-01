/*
 * ºä ÄÁÆ®·Ñ
 * - ListView
 * - TableView
 * - ImageView
 */
package section07.s03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewControls extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("section07_s03_root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("View Controls Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
