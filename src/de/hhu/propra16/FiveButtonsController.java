package de.hhu.propra16;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.awt.event.ActionEvent;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {

    @FXML
    Button dbutton;
    @FXML
    public void farbe(ActionEvent event){
        dbutton.getScene().setFill(Color.BLUE);
    }
}
