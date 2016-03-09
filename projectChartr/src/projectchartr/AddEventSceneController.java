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
import static java.time.temporal.ChronoUnit.DAYS;

/**
 * FXML Controller class
 *
 * @author GarethAllenStringer
 */
public class AddEventSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    private DatePicker startDate;
    @FXML
    private TextField durationField;
    @FXML
    private DatePicker endDate;
    
    @FXML
    private void showDuration() {
//        int duration = (endDate.getValue().compareTo(startDate.getValue()));
        long diff = DAYS.between(startDate.getValue(), endDate.getValue());
        Integer i = (int) (long) diff;
        durationField.setText(Integer.toString(i) + " days");
        
    }
    
   
    @FXML
    private void showEndDate() {
        
    }
    
    
}
