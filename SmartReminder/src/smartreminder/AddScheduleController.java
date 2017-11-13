/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartreminder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.ImagePattern;
import static smartreminder.ProfilePageController.imageProfileTemp;
import static smartreminder.ProfilePageController.img;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddScheduleController implements Initializable {

    @FXML
    private ImageView imageAdd;
    private Image img;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        img = new Image("file:src/Image/sign-add-icon.png");
        imageAdd.setImage(img);
        // TODO
    }    

    @FXML
    private void adding(MouseEvent event) {
        SmartReminder.primaryStage.getScene().setRoot(SmartReminder.addingSchedulePage);
    }
    
}
