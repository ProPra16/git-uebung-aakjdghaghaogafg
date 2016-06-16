package de.hhu.propra16;

import javafx.animation.AnimationTimer;
import javafx.scene.text.Text;

import java.time.LocalTime;

/**
 * Created by pic16-15 on 6/16/16.
 */
public class TimeAction extends AnimationTimer{
    Text text;
    public TimeAction(Text text){
        this.text=text;
    }
    @Override
    public void handle(long l) {
        LocalTime current = LocalTime.now();
        text.setText(current.toString());
    }
}
