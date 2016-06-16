package de.hhu.propra16;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
    @FXML
    Text time;

    @FXML
    void time(ActionEvent event){
        AnimationTimer timer = new TimeAction(time);
        timer.start();
    }
}
