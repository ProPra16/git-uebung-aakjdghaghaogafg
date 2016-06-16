package de.hhu.propra16;

import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.awt.event.ActionEvent;
=======
import javafx.event.ActionEvent;
import javafx.animation.AnimationTimer;
import javafx.scene.text.Text;
>>>>>>> origin/master

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
<<<<<<< HEAD

    @FXML
    Button dbutton;
    @FXML
    public void farbe(ActionEvent event){
        dbutton.getScene().setFill(Color.BLUE);
=======
    @FXML
    Text time;

    @FXML
    Text alert;

    public void handleButton() {
        alert.setVisible(true);
    }

    @FXML
    protected void handlekillbutton(ActionEvent kill) {
        System.exit(0);
    }

    @FXML
    void time(ActionEvent event){
        AnimationTimer timer = new TimeAction(time);
        timer.start();
>>>>>>> origin/master
    }
}
