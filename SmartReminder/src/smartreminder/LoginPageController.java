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

/**
 * FXML Controller class
 *
 * @author 58010622
 */
public class LoginPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         
    }    

    @FXML
    private void btnLogin(ActionEvent event) {
        
        SmartReminder.primaryStage.getScene().setRoot(SmartReminder.homePage);
    }
    
}
