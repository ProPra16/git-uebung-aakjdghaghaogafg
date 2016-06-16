package de.hhu.propra16;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.animation.AnimationTimer;
import javafx.scene.text.Text;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
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
    }
}
