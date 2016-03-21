/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectchartr;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author GarethAllenStringer
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
