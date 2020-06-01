package fxml;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

public class BindingController implements Initializable {
	@FXML
	TextArea textArea1;
	@FXML
	TextArea textArea2;
	@FXML
	Label label;
	@FXML
	Slider slider;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		slider.valueProperty().addListener(new ChangeListener<Number>() { // 값이 변할때마다 지정

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number oldVal, Number newVal) {
				System.out.println(newVal);
				label.setFont((new Font(newVal.doubleValue()))); // 폰트값 지정
			}

		});
		
//		textArea2.textProperty().bind(textArea1.textProperty());	//바인딩 (textArea2에 속성을 textArea1에 묶어줌) , 단방향
//		textArea2.textProperty().bindBidirectional(textArea1.textProperty());	//바인딩 쌍방향
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());	// 쌍방향2
	}

}
