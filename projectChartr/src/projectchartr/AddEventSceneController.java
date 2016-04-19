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
import static java.time.temporal.ChronoUnit.*;
import java.time.LocalDate;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 */
public class AddEventSceneController implements Initializable {
    @FXML private DatePicker startDateField;
    @FXML private DatePicker endDateField;
    @FXML private TextField durationField;
    @FXML private TextField eventNameField;
    @FXML private TextField eventIDField;
    @FXML private TextArea noteField;
    @FXML private ComboBox dependencyField;
    @FXML private Button previousButton;
    @FXML private Button nextButton;
    @FXML private Button submitButton;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   

    @FXML
    private void showDuration() {
//        int duration = (endDate.getValue().compareTo(startDate.getValue()));
        long diff = DAYS.between(startDateField.getValue(), endDateField.getValue());
        Integer i = (int) (long) diff;
        durationField.setText(Integer.toString(i) + " days");
    }
   /*
    @FXML
    private void showEndDate() {
        long daysToAdd = Integer.parseInt(durationField.getText());
        LocalDate beginDate = startDateField.getValue();
        LocalDate finalDate = beginDate.plusDays(daysToAdd);
        endDateField.setValue(finalDate);
    }*/
    /*
    @FXML
    private void showEndDate(MouseEvent event) {
        long daysToAdd = Integer.parseInt(durationField.getText());
        LocalDate beginDate = startDateField.getValue();
        LocalDate finalDate = beginDate.plusDays(daysToAdd);
        endDateField.setValue(finalDate);
    }
    */
}