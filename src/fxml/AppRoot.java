package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppRoot extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Parent 는 HBox 보다 상위
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml")); // 만든" ~.fxml"파일을 불러옴
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("FXML sample");
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
