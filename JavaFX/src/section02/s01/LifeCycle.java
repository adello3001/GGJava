package section02.s01;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycle extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public LifeCycle() {
		System.out.println("LifeCycle()");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+": init()");
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+": start()");
		primaryStage.show();   
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+": stop()");
	}	
}
