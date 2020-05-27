package fxml;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();	//HBox 컨테이너 생성
		hbox.setPadding(new Insets(10));	//안쪽 여백 설정
		hbox.setSpacing(10);	//컨트롤 간의 수평 간격 설정

		TextField textField = new TextField();	//TextField 컨트롤 생성
		textField.setPrefWidth(200);	//TextField의 폭 설정
		
		Button button = new Button();
		button.setText("확인");
		
		ObservableList list = hbox.getChildren();	//HBox의 ObservableList 얻기
		list.add(textField);	//TextField 컨트롤 배치
		list.add(button);	//Button의 컨트로 배치
		
		Scene scene = new Scene(hbox);	//장면 생성
		
		primaryStage.setTitle("AppMain");	//윈도우 창 제목 설정
		primaryStage.setScene(scene);	//윈도우 창에 장면 설정
		primaryStage.show();	//윈도우 창 보여주기
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
