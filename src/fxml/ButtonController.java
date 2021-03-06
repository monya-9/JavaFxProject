package fxml;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonController implements Initializable {
	@FXML Button btnNew;
	@FXML Button btnOpen;
	@FXML Button btnSave;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image img = new Image("/panes/icons/new.png");
		btnNew.setGraphic(new ImageView(img));
		Image img2 = new Image("/panes/icons/open.png");
		btnOpen.setGraphic(new ImageView(img2));
		Image img3 = new Image("/panes/icons/save.png");
		btnSave.setGraphic(new ImageView(img3));
		
		btnNew.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("New Clicked");
			}
		});
		btnOpen.setOnAction((event)-> System.out.println("Open clicked"));	//위와 같음 람다표현식
	}
	
	public void btnSaveAction(ActionEvent event) {  //fxml에 적음
		System.out.println("Save Clicked");
	}

}
