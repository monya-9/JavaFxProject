package view_pack;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewController implements Initializable {
	@FXML
	ListView<String> listView;
	@FXML
	TableView<Phone> tableView;
	@FXML ImageView imageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 초기화 지정.
		ObservableList<String> list = FXCollections.observableArrayList("GalaxyS1", "GalaxyS2", "GalaxyS3", "GalaxyS4");
		list.add("GalaxyS5"); // 이렇게 넣기, 위에처럼 괄호에 바로 넣기 둘다가능
		list.add("GalaxyS6");
		list.add("GalaxyS7");
		listView.setItems(list);

		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {		//리스트뷰를 클릭하면 테이블뷰에 해당하는것이 선택됨.

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());   //포인트가 자동으로 맞춰지면서 스크롤이 내려지는것
			}

		});

		tableView.setItems(FXCollections.observableArrayList(new Phone("Galaxys1", "Phone01.png"),
				new Phone("Galaxys2", "Phone02.png"), new Phone("Galaxys3", "Phone03.png"),
				new Phone("Galaxys4", "Phone04.png"), new Phone("Galaxys5", "Phone05.png"),
				new Phone("Galaxys6", "Phone06.png"), new Phone("Galaxys7", "Phone07.png")));

		TableColumn<Phone, ?> tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));

//		tableView.getColumns().get(0).setCellValueFactory(new PropertyValueFactory("smartPhone")); //위와 같음

		TableColumn<Phone, ?> tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {	//테이블뷰 선택시 해당 이미지 가져오기

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				imageView.setImage(new Image("/images/"+ newValue.getImage() ));
			}
		});
		imageView.setImage(new Image("/images/phone01.png"));

	}

	public void handleBtnRegAction() {

	}

	public void handleBtnCancelAction() {

	}

}
