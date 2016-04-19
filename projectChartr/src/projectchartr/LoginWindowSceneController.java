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
 */
public class LoginWindowSceneController implements Initializable {
    @FXML private Label projectName;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private CheckBox rememberMeCheckBox;
    @FXML private Button loginButton;
    @FXML private Button registerButton;
    @FXML private Hyperlink forgottenDetailsHyperlink;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
