package fxml;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController implements Initializable {	//이벤트를 처리할 클래스
	@FXML
	TextField textFiel;   //Root.fxml에 있는 아이디필드 가져옴
	@FXML
	Button btnOk;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		textFiel.setText("초기화합니다.");
		btnOk.setOnAction(new EventHandler<ActionEvent>() {  //(new Ev~) 익면구현 객체 실현
			
			@Override
			public void handle(ActionEvent event) {
				Platform.exit();
			}
		});
	} 

}
