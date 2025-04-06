package org.openjfx;

import javafx.application.Application;
import javafx.stage.Stage;

// Custome
import org.openjfx._2_scene_graph._2_1_Overview;
import org.openjfx._2_scene_graph._2_2_0_Transformations;
import org.openjfx._2_scene_graph._2_2_1_Translate;
import org.openjfx._2_scene_graph._2_2_2_Scale;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // new _2_1_Overview(stage);
        // new _2_2_0_Transformations(stage);
        // new _2_2_1_Translate(stage);
        new _2_2_2_Scale(stage);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
