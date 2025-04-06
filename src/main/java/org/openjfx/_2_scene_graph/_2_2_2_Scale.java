package org.openjfx._2_scene_graph;

// Layout
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

// Components
import javafx.scene.shape.Rectangle;

// Styles
import javafx.scene.paint.Color;

public class _2_2_2_Scale {

    public _2_2_2_Scale(Stage stage) {
        stage.setScene(new Scene(this.createContent(), 300, 300, Color.GRAY));
        stage.show();
    }

    private Parent createContent() {
        Rectangle box = new Rectangle(100, 50, Color.CHOCOLATE);

        this.transform(box);

        return new Pane(box);
    }

    private void transform(Rectangle box) {
        box.setTranslateX(100);
        box.setTranslateY(200);
        box.setScaleX(1.5);
        box.setScaleY(2.5);
    }
}
