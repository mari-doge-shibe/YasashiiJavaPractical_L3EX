package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import javafx.application.Application;

public class Exercise2 extends Application {
    private Button bt;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        bt = new Button("ようこそ。");

        BorderPane bp = new BorderPane();

        bp.setCenter(bt);

        Scene sc = new Scene(bp, 300, 200);

        bt.addEventHandler(MouseEvent.MOUSE_ENTERED, new SampleEventHandler());
        bt.addEventHandler(MouseEvent.MOUSE_EXITED, new SampleEventHandler());

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    // event handler class
    class SampleEventHandler implements EventHandler<MouseEvent> {
        public void handle(MouseEvent e) {
            if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
                bt.setText("いらっしゃいませ。");
            } else if(e.getEventType() == MouseEvent.MOUSE_EXITED) {
                bt.setText("ようこそ。");
            }
        }
    }

}
