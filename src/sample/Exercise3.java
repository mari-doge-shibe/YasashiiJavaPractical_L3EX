package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// code displaying the name of the key pressed

public class Exercise3 extends Application {
    private Label lb1, lb2;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        lb1 = new Label("キーを押してください。");
        lb2 = new Label();

        BorderPane bp = new BorderPane();

        bp.setTop(lb1);
        bp.setBottom(lb2);

        Scene sc = new Scene(bp, 300, 200);

        sc.setOnKeyPressed(new SampleEventHandler());

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    // event handler class
    class SampleEventHandler implements EventHandler<KeyEvent> {
        public void handle(KeyEvent e) {
            KeyCode k = e.getCode();
            lb2.setText(k.toString() + "ですね。");
        }
    }


}
