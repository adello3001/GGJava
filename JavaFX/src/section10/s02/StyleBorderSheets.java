/*
 * CSS(Cascading Style Sheets) 캐스케이딩 스타일 시트
 */
package section10.s02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StyleBorderSheets extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
		primaryStage.setTitle("Cascading Style Sheets - Border Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
