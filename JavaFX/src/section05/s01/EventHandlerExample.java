/*
 * 이벤트 처리
 * - 이벤트 핸들러(Event Handler)
 */
package section05.s01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class EventHandlerExample extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPrefSize(200,50);
		root.setAlignment(Pos.TOP_CENTER);
		root.setSpacing(20);
		
		Button btnOk = new Button("Ok");
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("[Ok 버튼 클릭]");
				EventType<?> et = event.getEventType(); 
				System.out.println("EventType: " + et.getName());
			}
		});
		
		root.getChildren().addAll(btnOk);
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Event Handler Demo");
		primaryStage.setScene(scene);
		
		// primaryStage.setOnCloseRequest(event -> System.out.println("종료"));
		primaryStage.setOnCloseRequest((WindowEvent event) -> {
			System.out.println("[종료]");
			EventType<?> et = event.getEventType(); 
			System.out.println("EventType: " + et.getName());
		});
		
		primaryStage.show();
	}
}
