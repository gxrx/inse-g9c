/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectchartr;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


/**
 * FXML Controller class
 *
 * @author GarethAllenStringer
 */
public class NewProjectSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private TextField txtProjectName;
    @FXML private Button btnConfirm;
    @FXML private DatePicker dpStartDate, dpEndDate;
    
    @FXML protected void confirmNewProject(ActionEvent e)
    {
        // Check Login Details from DB
        // <SQL Fancy stuff here>
        // Compare Username and Passwords 
        // Open next window if true
        // Show an error if false
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
