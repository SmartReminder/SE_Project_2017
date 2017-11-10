/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartreminder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import static smartreminder.ProfilePageController.imageProfileTemp;
import static smartreminder.ProfilePageController.img;
import static smartreminder.SmartReminder.timeTablePage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddScheduleController implements Initializable {


    @FXML
    private AnchorPane timeTable_pane;
    static  AnchorPane timeTable_paneTemp;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            
        timeTable_paneTemp = timeTable_pane;
        // TODO
    }    
    static void setTimeTable()
    {
        timeTable_paneTemp.getChildren().clear();
        timeTable_paneTemp.getChildren().add(SmartReminder.timeTablePage);
    }
    
    @FXML
    private void adding(ActionEvent event) {
        SmartReminder.primaryStage.getScene().setRoot(SmartReminder.addingSchedulePage);  
    }

    @FXML
    private void backBtn(ActionEvent event) {
         SmartReminder.primaryStage.getScene().setRoot(SmartReminder.homePage);  
    }
    
}
