/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartreminder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author 58010622
 */
public class HomePageController implements Initializable {

    @FXML
    private Rectangle dayBlock1;
    @FXML
    private Rectangle dayBlock2;
    @FXML
    private Rectangle dayBlock3;
    @FXML
    private Rectangle dayBlock4;
    @FXML
    private Rectangle dayBlock5;
    @FXML
    private Rectangle dayBlock6;
    @FXML
    private Rectangle dayBlock7;
    @FXML
    private Rectangle dayBlock8;
    @FXML
    private Rectangle dayBlock9;
    @FXML
    private Rectangle dayBlock10;
    @FXML
    private Rectangle dayBlock11;
    @FXML
    private Rectangle dayBlock12;
    @FXML
    private Rectangle dayBlock13;
    @FXML
    private Rectangle dayBlock14;
    @FXML
    private Rectangle dayBlock15;
    @FXML
    private Rectangle dayBlock16;
    @FXML
    private Rectangle dayBlock17;
    @FXML
    private Rectangle dayBlock18;
    @FXML
    private Rectangle dayBlock19;
    @FXML
    private Rectangle dayBlock20;
    @FXML
    private Rectangle dayBlock21;
    @FXML
    private Rectangle dayBlock22;
    @FXML
    private Rectangle dayBlock23;
    @FXML
    private Rectangle dayBlock24;
    @FXML
    private Rectangle dayBlock25;
    @FXML
    private Rectangle dayBlock26;
    @FXML
    private Rectangle dayBlock27;
    @FXML
    private Rectangle dayBlock28;
    @FXML
    private Rectangle dayBlock29;
    @FXML
    private Rectangle dayBlock30;
    @FXML
    private Rectangle dayBlock31;
    @FXML
    private Rectangle dayBlock32;
    @FXML
    private Rectangle dayBlock33;
    @FXML
    private Rectangle dayBlock34;
    @FXML
    private Rectangle dayBlock35;
    @FXML
    private Rectangle dayBlock36;
    @FXML
    private Rectangle dayBlock37;
    @FXML
    private Rectangle dayBlock38;
    @FXML
    private Rectangle dayBlock39;
    @FXML
    private Rectangle dayBlock40;
    @FXML
    private Rectangle dayBlock41;
    @FXML
    private Rectangle dayBlock42;
    @FXML
    private Label dayLabel1;
    @FXML
    private Label dayLabel2;
    @FXML
    private Label dayLabel3;
    @FXML
    private Label dayLabel4;
    @FXML
    private Label dayLabel5;
    @FXML
    private Label dayLabel6;
    @FXML
    private Label dayLabel7;
    @FXML
    private Label dayLabel8;
    @FXML
    private Label dayLabel9;
    @FXML
    private Label dayLabel10;
    @FXML
    private Label dayLabel11;
    @FXML
    private Label dayLabel12;
    @FXML
    private Label dayLabel13;
    @FXML
    private Label dayLabel14;
    @FXML
    private Label dayLabel15;
    @FXML
    private Label dayLabel16;
    @FXML
    private Label dayLabel17;
    @FXML
    private Label dayLabel18;
    @FXML
    private Label dayLabel19;
    @FXML
    private Label dayLabel20;
    @FXML
    private Label dayLabel21;
    @FXML
    private Label dayLabel22;
    @FXML
    private Label dayLabel23;
    @FXML
    private Label dayLabel24;
    @FXML
    private Label dayLabel25;
    @FXML
    private Label dayLabel26;
    @FXML
    private Label dayLabel27;
    @FXML
    private Label dayLabel28;
    @FXML
    private Label dayLabel29;
    @FXML
    private Label dayLabel30;
    @FXML
    private Label dayLabel31;
    @FXML
    private Label dayLabel32;
    @FXML
    private Label dayLabel33;
    @FXML
    private Label dayLabel34;
    @FXML
    private Label dayLabel35;
    @FXML
    private Label dayLabel36;
    @FXML
    private Label dayLabel38;
    @FXML
    private Label dayLabel37;
    @FXML
    private Label dayLabel39;
    @FXML
    private Label dayLabel40;
    @FXML
    private Label dayLabel41;
    @FXML
    private Label dayLabel42;
    @FXML
    private ComboBox year_list;
    
    private static String year;
    private static int month;  
    ObservableList<String> list = FXCollections.observableArrayList("2017","2018");
    @FXML
    private Button julBtn;
    @FXML
    private Label month_label;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO    
         year_list.setItems(list);  
        // year_list.setValue("2018");
    }

    @FXML
    private void list_Action(ActionEvent event) {
        year = year_list.getValue().toString();
        System.out.println(year);
    }

    @FXML
    private void janBtn(ActionEvent event) {
        month = 1;
        month_label.setText("January");
    }

    @FXML
    private void febBtn(ActionEvent event) {
        month = 2;
        month_label.setText("February");
    }

    @FXML
    private void marBtn(ActionEvent event) {
        month = 3;
        month_label.setText("March"); 
    }

    @FXML
    private void aprBtn(ActionEvent event) {
        month = 4;
        month_label.setText("April");
    }

    @FXML
    private void mayBtn(ActionEvent event) {
        month = 5;
        month_label.setText("May");
    }

    @FXML
    private void junBtn(ActionEvent event) {
        month = 6;
        month_label.setText("June");
    }

    @FXML
    private void julBtn(ActionEvent event) {
        month = 7;
        month_label.setText("July");
    }
    @FXML
    private void augBtn(ActionEvent event) {
        month = 8;
        month_label.setText("August");
    }

    @FXML
    private void sepBtn(ActionEvent event) {
        month = 9;
        month_label.setText("September");
    }

    @FXML
    private void octBtn(ActionEvent event) {
        month = 10;
        month_label.setText("October");
    }

    @FXML
    private void novBtn(ActionEvent event) {
        month = 11;
        month_label.setText("November");
    }

    @FXML
    private void decBtn(ActionEvent event) {
        month = 12;
        month_label.setText("December");
    }

}
