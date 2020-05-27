package Basic;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class AppMain extends Application {

	public AppMain() { //생성자호출
		System.out.println(Thread.currentThread().getName() + " : AppMain() 실행");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : init() 실행");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {	//주로start 메소드안에 UI를 넣음
		System.out.println(Thread.currentThread().getName() + " : start() 실행");
		VBox root  = new VBox();	//컨트롤을 수직으로 배치함
		root.setPrefWidth(350);	    //넓이
		root.setPrefHeight(150);	//높이
		root.setAlignment(Pos.CENTER);	//컨트롤 중앙정렬
		root.setSpacing(20);	//컨트롤간격
		
		Label label = new Label();	//Label 컨트롤 생성
		label.setText("Hello, HavaFX");
		label.setFont(new Font(50));	//폰트 크기
		
		Button button = new Button();	//Button 컨트롤 생성
		button.setText("확인");
		button.setOnAction(event->Platform.exit());	//클릭 이벤트 처리(람다표현식씀)
	
		
		root.getChildren().add(label);	//컨트롤들을 리턴타입으로 담아줌
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();	// 윈도우 보여주기(창 띄워주기)
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : stop() 실행");
		super.stop();	//뜬 창을 닫으면 실행
	}

	public static void main(String[] args) {
		Application.launch(args); 
	}

}
