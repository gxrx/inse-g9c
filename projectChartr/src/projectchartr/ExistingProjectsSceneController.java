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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class ExistingProjectsSceneController implements Initializable {
    
    @FXML private Button newProjectButton;
    @FXML private Label projectNameLabel;
    /**
     * Initializes the controller class.
     */
    @FXML 
    protected void openNewProj(ActionEvent e) throws IOException
    {
        try {
           Parent p = FXMLLoader.load(getClass().getResource("newProjectScene.fxml"));   
           Stage s = (Stage) newProjectButton.getScene().getWindow();
           Scene n = new Scene(p);
           s.close();
           s.setScene(n);
           s.setTitle("New Project");
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
