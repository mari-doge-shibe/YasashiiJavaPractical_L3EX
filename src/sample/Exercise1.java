package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Exercise1 extends Application {
    private Label lb;
    private Button bt;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        // create a control
        lb = new Label("いらっしゃいませ");
        bt = new Button("購入");

        // create a pane
        BorderPane bp = new BorderPane();

        // add the control to the pane
        bp.setTop(lb);
        bp.setCenter(bt);

        // create a scene
        Scene sc = new Scene(bp, 300, 200);

        // register an event handler
        bt.setOnAction(new SampleEventHandler());

        // add the scene to the stage
        stage.setScene(sc);

        // display the stage
        stage.setTitle("サンプル");
        stage.show();
    }

    // event handler class
    class SampleEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            bt.setText("Thanks!");
        }
    }

}
