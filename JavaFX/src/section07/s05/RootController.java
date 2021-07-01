package section07.s05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;


public class RootController implements Initializable {
	@FXML private PieChart pieChart;
	@FXML private BarChart barChart;
	@FXML private AreaChart areaChart;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("AWT", 50),
				new PieChart.Data("Swing", 10),
				new PieChart.Data("SWT", 10),
				new PieChart.Data("JavaFX", 50)));
		
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("남자");
		series1.setData(FXCollections.observableArrayList(
				new XYChart.Data("2015", 80),
				new XYChart.Data("2016", 60),
				new XYChart.Data("2017", 70),
				new XYChart.Data("2018", 40)));
		
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("여자");
		series2.setData(FXCollections.observableArrayList(
				new XYChart.Data("2015", 90),
				new XYChart.Data("2016", 70),
				new XYChart.Data("2017", 90),
				new XYChart.Data("2018", 99)));
		
		barChart.getData().add(series1);
		barChart.getData().add(series2);
	
		XYChart.Series series3 = new XYChart.Series();
		series3.setName("평균온도");
		series3.setData(FXCollections.observableArrayList(
				new XYChart.Data("2015", 25),
				new XYChart.Data("2016", 27),
				new XYChart.Data("2017", 26),
				new XYChart.Data("2018", 20)));
		
		areaChart.getData().add(series3);
		
	}
}
