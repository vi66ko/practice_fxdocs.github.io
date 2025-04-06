package org.openjfx._2_scene_graph;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

// Layout
import javafx.scene.layout.StackPane;

// Components
import javafx.scene.text.Text;

public class _2_1_Overview {
    public _2_1_Overview(Stage stage) {
        stage.setScene(new Scene(this.createContent(), 300, 300));
        stage.show();
    }

    private Parent createContent() {
        return new StackPane(new Text("Namaste World"));
    }
}
