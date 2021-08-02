package section06.s01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

import java.lang.Number;

public class RootController implements Initializable {
	@FXML private Slider sliderFX;
	@FXML private Label labelFX;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sliderFX.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, 
					Number oldValue, Number newValue) {
				System.out.printf("sliderFX.valueProperty: old(%f), new(%f)\n", 
						oldValue.doubleValue(), newValue.doubleValue());
				labelFX.setFont(new Font(newValue.doubleValue()));
			}
			
		});
	}
}
