/*
 * 입력 컨트롤
 * - TextField
 * - TextArea
 * - PasswordField
 * - ComboBox
 * - DatePicker
 * - ColorPicker
 * - HTMLEditor
 */
package section07.s02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InputControls extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Input Controls Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
