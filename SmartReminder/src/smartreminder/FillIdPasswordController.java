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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 58010622
 */
public class FillIdPasswordController implements Initializable {

    @FXML
    private TextField id_field;
    @FXML
    private PasswordField password_field;
    
    public static String username="";   
    public static String password;
    static public TextField changeid_field;
    static public PasswordField changpassword_field;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        changeid_field = id_field;
        changpassword_field = password_field;
    }    

    @FXML
    private void btnLogin(ActionEvent event) {
        username = id_field.getText();
        password = password_field.getText();
        
        if(password.equals("1234") && (username .equals("umaru")|| username .equals("moira")) ){
            HomePageController.changeUsername.setText(username);  
            SmartReminder.primaryStage.getScene().setRoot(SmartReminder.homePage);
        }
        else
        {  
            SmartReminder.primaryPane.getChildren().clear();
            SmartReminder.primaryPane.getChildren().add(SmartReminder.errorLogin); 
        }
    }
    
}
