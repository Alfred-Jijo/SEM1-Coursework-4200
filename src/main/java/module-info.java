module main.javasaver {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	
	requires org.controlsfx.controls;
	requires org.kordamp.ikonli.javafx;
	requires eu.hansolo.tilesfx;
	requires com.almasb.fxgl.all;
	
	opens main.javasaver to javafx.fxml;
	exports main.javasaver;
}