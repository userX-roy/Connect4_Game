module ConnectFour {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens roy.connect.four to javafx.graphics, javafx.fxml;
}
