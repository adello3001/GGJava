/*
 * FXML Layout
 */
package section03.s03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml10.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("FXML Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
