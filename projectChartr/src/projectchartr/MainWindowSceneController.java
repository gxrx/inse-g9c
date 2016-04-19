/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectchartr;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class MainWindowSceneController implements Initializable {

    @FXML private Button addEvBttn;
    @FXML private Button editEvBttn;
    @FXML private Button remEvBttn;
    @FXML private Button openButton;
    @FXML private Button saveButton;
    @FXML private Button printButton;
    @FXML private ListView eventsList;
    @FXML private Label baseLineLabel;
    /**
     * Initializes the controller class.
     */
    
    @FXML
    protected void addEvButton(ActionEvent e) throws IOException
    {
        try {
           Parent p = FXMLLoader.load(getClass().getResource("addEventScene.fxml"));   
           Stage s = new Stage();
           Scene n = new Scene(p);
           s.setScene(n);
           s.setTitle("Add Event");
           s.show();   
       }
           
       catch (Exception ex)
       {
           System.err.print(ex);
       }
       
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
