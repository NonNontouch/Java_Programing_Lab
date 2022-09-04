package Pro6;

import javafx.collections.ObservableList;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

public class Fan extends StackPane {
    private double startAngle = 15; // Start angle of arcs
    private Timeline timeline; // animation
    private Pane blades = getBlades(); // Create four arcs
    private ObservableList<Node> list = blades.getChildren(); // List of arcs

    /** Construct a timeline */
    public Fan() {
        getChildren().addAll(getCircle(), blades);
        timeline = new Timeline(new KeyFrame(Duration.millis(50), e -> spinfan()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setRate(0);
        timeline.play(); // Start animation
    }

    /** Animate timeline blades */
    protected void spinfan() {
        for (int i = 0; i < list.size(); i++) {
            Arc a = (Arc) list.get(i);
            a.setStartAngle(a.getStartAngle() + startAngle);
        }
    }

    /** Pause animation */
    public void pause() {
        timeline.pause();
    }

    /** Resume animation */
    public void play() {
        timeline.play();
    }

    /** Reverse the direction of timeline spin */
    public void reverse() {
        startAngle *= -1;
    }

    public DoubleProperty rateProperty() {
		return timeline.rateProperty();
	} 
     
    public void setRate(double in){
        timeline.setRate(in);
    }

    /** Add four arcs to a pane and place them in a stack pane */
    private Pane getBlades() {
        Pane pane = new Pane();
        double angle = 0;
        for (int i = 0; i < 4; i++) {
            Arc arc = new Arc(175, 130, 90, 90, angle + 90, 50);
            arc.setFill(Color.RED);
            arc.setType(ArcType.ROUND);
            pane.getChildren().add(arc);
            angle += 90;
        }
        return pane;
    }

    /** Return a Circle */
    private Circle getCircle() {
        Circle c = new Circle();
        c.setRadius(100);
        c.setStroke(Color.BLACK);
        c.setFill(Color.WHITE);
        return c;
    }

}