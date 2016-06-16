package de.hhu.propra16;


import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
    @FXML
    Text alert;
    public void handleButton(){
        alert.setVisible(true);
    }
}
