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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author 58010622
 */
public class ProfilePageController implements Initializable {

    @FXML
    private Circle imageProfile;
    @FXML
    private ImageView imageView;
    //Image img;
    @FXML
    private Label username_label;
    @FXML
    private Label twi_label;
    @FXML
    private Label ig_label;
    @FXML
    private Label email_label;
    @FXML
    private Label tal_label;
    @FXML
    private Label facebook_label;
    static Image img;   
    static String username;
    static ImageView imageViewTemp;
    static Label username_Temp;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
        imageViewTemp = imageView;
        username_Temp = username_label;
        setInit();
        imageProfile.setFill(new ImagePattern(img));
        
    }   
    static void setInit()
    {
        img = imageViewTemp.getImage();
        username =  FillIdPasswordController.username;  
        username_Temp.setText(username);
    }
     
    
}
