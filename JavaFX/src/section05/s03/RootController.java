package section05.s03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {
	@FXML private Button btnOk;
	@FXML private Button btnCancel;
	@FXML private Button btnExit;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Ok!!!!");
			}
		});
		
		btnCancel.setOnAction(event -> System.out.println("Cancel!!!"));
		btnExit.setOnAction(event -> System.out.println("Exit!!!"));
		*/
	}
	
	public void handleBtnOk(ActionEvent event) {
		System.out.println("[Ok]!!!!");
	}
	
	public void handleBtnCancel(ActionEvent event) {
		System.out.println("[Cancel]!!!!");
	}

	public void handleBtnExit(ActionEvent event) {
		System.out.println("[Exit]!!!!");
	}

}
