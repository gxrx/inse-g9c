import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import java.awt.Graphics;
import javax.swing.JLabel;

public class ShapesEx extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        Pane root = new Pane();

        Canvas canvas = new Canvas(320, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //Testing Methods
        
        //Arrow Test. note. arrow co-ords will be auto generated. This is a test.
        //Draw a line between point A and B.
        //format (gc, ax, ay, bx, by)
        drawArrow(gc, 10.0, 10.0, 1000.0, 10.0);

        //Draw Event Box Test
        //Draw the WBT Event Box with given parameters. 
        //note. Event name will be fetched from project. 
        drawEventBox(gc, 100.0, 100.0, 100.0, 30.0, "1.1 Event Test");

        root.getChildren().add(canvas);
        
        Scene scene = new Scene(root, 1300, 1100, Color.WHITESMOKE); //Add scene. Specifies canvas size.
        
        stage.setTitle("Shapes"); //Set window title.
        stage.setScene(scene);
        stage.show(); //show the canvas window.
    }
    //drawShapes() is code from a tutorial. use as a guide to make our shapes.
    /*private void drawShapes(GraphicsContext gc) {

     gc.setFill(Color.GRAY);

     gc.fillOval(30, 30, 50, 50);
     gc.fillOval(110, 30, 80, 50);
     gc.fillRect(220, 30, 50, 50);
     gc.fillRoundRect(30, 120, 50, 50, 20, 20);
     gc.fillArc(110, 120, 60, 60, 45, 180, ArcType.OPEN);
     gc.fillPolygon(new double[]{220, 270, 220},
     new double[]{120, 170, 170}, 3);
     }
     */

    /**
     * Draws an arrow between 2 specified points. co-ords in double format.
     * @param gc Graphical Context
     * @param x1 
     * @param y1
     * @param x2
     * @param y2
     */
        public void drawArrow(GraphicsContext gc, double x1, double y1, double x2, double y2) { 
        gc.strokeLine(x1, y1, x2, y2);
    }

    /**
     * Draws a WBT Event box.
     * @param gc Graphical Context
     * @param x x position
     * @param y y position
     * @param w box width
     * @param h box height
     * @param text box text.
     */
    public void drawEventBox(GraphicsContext gc, double x, double y, double w, double h, String text) {
        gc.setFill(Color.BLACK);
        gc.fillRect(x, y, w, h);
        gc.setFill(Color.WHITE);
        gc.clearRect(x + 2, y + 2, w - 4, h - 4);
        gc.setFill(Color.BLACK);
        gc.fillText(text, x + 2, y + 16, w);
    }

    /**
     * Draws a WBT 
     * @param p project
     */
    public void drawTree(Project p) {       
        //import a project Object from main.
        //draw a title box (project name) at the top centre of the canvas.
        //order the eventList?
        //draw the 1.?.?... branch
            //we need to be able to split the tree at example: 1.1 / 1.2 into multiple branches.
        //increment x field working space
        //draw the 2.?.?... branch
        //continue for no. of braches.
    }

    public static void run() { // run the canvas window
        launch();
    }
}
