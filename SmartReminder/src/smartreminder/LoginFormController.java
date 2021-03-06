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
import javafx.scene.layout.Pane;
import classes.UserAccount;
import java.util.List;
import javax.persistence.*;

/**
 * FXML Controller class
 *
 * @author 58010622
 */
public class LoginFormController implements Initializable {

    private static String username;   
    private static String password;
   
    @FXML
    private TextField id_field;
    @FXML
    private PasswordField password_field;

    List<UserAccount> users;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        EntityManager em = SmartReminder.emf.createEntityManager();
 
        // Store 1000 Point objects in the database:
        em.getTransaction().begin();
        
        TypedQuery<UserAccount> query = em.createQuery("SELECT user FROM UserAccount user", UserAccount.class);
        users = query.getResultList();
        
        em.close();
        SmartReminder.emf.close();
    }    

    @FXML
    private void btnLogin(ActionEvent event) {
        username = id_field.getText();
        password = password_field.getText();
        
        if(password.equals("1234") && username .equals("umaru"))
            SmartReminder.primaryStage.getScene().setRoot(SmartReminder.homePage);
        else
        {  
            SmartReminder.primaryPane.getChildren().clear();
            SmartReminder.primaryPane.getChildren().add(SmartReminder.errorLogin); 
        }
    }
    
}
