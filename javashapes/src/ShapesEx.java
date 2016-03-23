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
       // drawShapes(gc);
       // drawArrow(gc);
        
        //testing draw box
        drawEventBox(gc, 100.0, 100.0, 100.0, 30.0, "1.1 Event Test");
        

        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 1300, 1100, Color.WHITESMOKE);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

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

    public void drawArrow(GraphicsContext gc) {
        gc.lineTo(0.0, 200.0);
        gc.lineTo(200.0, 200.0);
        gc.strokeLine(10.0, 20.0, 40.0, 50.0);
        //make a new shapre object
        //draw an arrow.
    }
    
    public void drawEventBox(GraphicsContext gc,double x,double y,double w,double h, String text)
    {   
       gc.setFill(Color.BLACK);
       gc.fillRect(x, y, w, h);
       gc.setFill(Color.WHITE); 
       gc.clearRect(x+2, y+2, w-4, h-4);
       gc.setFill(Color.BLACK);
       gc.fillText(text, x+2,y+16,w);
    }
    
    
    
    public void drawTree(Project p){
       
    }
    

    public static void run() {
        launch();
    }
}
