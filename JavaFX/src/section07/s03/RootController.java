package section07.s03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(FXCollections.observableArrayList(
				"Galaxy-S1", "Galaxy-S2", "Galaxy-S3", "Galaxy-S4", "Galaxy-S6", "Galaxy-S7"));
		
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}
		});
	
		ObservableList phoneList = FXCollections.observableArrayList(
				new Phone("Galaxy-S1", "galaxy01.jpg"),
				new Phone("Galaxy-S2", "galaxy02.jpg"),
				new Phone("Galaxy-S3", "galaxy03.jpg"),
				new Phone("Galaxy-S4", "galaxy04.jpg"),
				new Phone("Galaxy-S5", "galaxy05.jpg"),
				new Phone("Galaxy-S6", "galaxy06.jpg"),
				new Phone("Galaxy-S7", "galaxy07.jpg")
			);
		
		TableColumn<Phone, ?> tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-aligment: CENTER");
		
		TableColumn<Phone, ?> tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-aligment: CENTER");
	
		tableView.setItems(phoneList);
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {
			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				if(newValue != null) {
					imageView.setImage(new Image(getClass().getResource("images/" + newValue.getImage()).toString()));
				}
			}
		});
	}
	
	public void handleBtnOkAction(ActionEvent e) {
		System.out.println("[handleBtnOkAction]");
		String item = listView.getSelectionModel().getSelectedItem();
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		
		System.out.println("[ListView] SmartPhone: " + item);
		System.out.println("[TableView] SmartPhone: " + phone.getSmartPhone());
		System.out.println("[TableView] SmartPhone: " + phone.getImage());
	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
