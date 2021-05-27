/*
 * FXML Controller
 * - 속성과 컨트롤러
 * - 컨트롤 주입
 * - 이벤트 핸들러 등록
 */
package section05.s03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlController extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("FXML Controller Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
