/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectchartr;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 */
public class NewProjectSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private TextField txtProjectName;
    @FXML private Button btnConfirm;
    @FXML private DatePicker dpStartDate, dpEndDate;
    private LocalDate sDate, eDate;
    @FXML protected void confirmNewProject(ActionEvent e) throws IOException
    {
        /*sDate = dpStartDate.getValue();
        eDate = dpEndDate.getValue();
        
        if(sDate.isAfter(eDate))
        {
            System.err.println("Start Date is after End Date");
        }
        // Check Login Details from DB
        // <SQL Fancy stuff here>
        // Compare Username and Passwords 
        // Open next window if true
        // Show an error if false
        Properties props = new Properties();
        props.put("user", "up616531");
        props.put("password", "");
        props.put("database", "Test");
       /* Connection dbSession;
        try {
            dbSession = DriverManager.getConnection(
                    "jdbc:mysql://104.155.100.96:3306/Test",props);
            System.out.println("Connected to DB! YAY!");
        } catch (Exception ex) {
            System.err.println("Failed to connect to DB because reasons");
        }   */
       
       try {
           Parent p = FXMLLoader.load(getClass().getResource("mainWindowScene.fxml"));   
           Stage s = (Stage) btnConfirm.getScene().getWindow();
           Scene n = new Scene(p);
           s.close();
           s.setScene(n);
           s.show();   
           s.setTitle("Work Breakdown Tree");
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
