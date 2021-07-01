/*
 * 버튼 컨트롤
 * - Button       : 기본버튼
 * - CheckBox     : 다중 체크박스에서 복수의 선택가능
 * - RadioButton  : 다중 라디오버튼에서 하나만 선택가능
 * - ToggleButton : 토글(On/Off) 스위치 형태
 * - Hyperlink    : 사이트로 연결
 */
package section07.s01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonControls extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Button Controls Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
