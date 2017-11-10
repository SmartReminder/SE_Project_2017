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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddingScheduleController implements Initializable {

    @FXML
    private TextField detail;
    @FXML
    private TextField scheduleName;
    
    public static String sch_input = "";
    public static String detail_input = "";
    ObservableList<String> startTimelist = FXCollections.observableArrayList("00.00","00.30","01.00","01.30","02.00","02.30","03.00","03.30","04.00","04.30","05.00","05.30","06.00","06.30","07.00","07.30","08.00","08.30","09.00","09.30","10.00","10.30","11.00","11.30","12.00","12.30","13.00","13.30","14.00","14.30","15.00","15.30","16.00","16.30","17.00","17.30","18.00","18.30","19.00","19.30","20.00","20.30","21.00","21.30","22.00","22.30","23.00","23.30");
    ObservableList<String> finishTimelist = FXCollections.observableArrayList("00.00","00.30","01.00","01.30","02.00","02.30","03.00","03.30","04.00","04.30","05.00","05.30","06.00","06.30","07.00","07.30","08.00","08.30","09.00","09.30","10.00","10.30","11.00","11.30","12.00","12.30","13.00","13.30","14.00","14.30","15.00","15.30","16.00","16.30","17.00","17.30","18.00","18.30","19.00","19.30","20.00","20.30","21.00","21.30","22.00","22.30","23.00","23.30");
     ObservableList<String> preAlarmlist = FXCollections.observableArrayList("5","10","15","20","25","30");
    @FXML
    private Button save;
    @FXML
    private ComboBox<String> preAlarmList;
    @FXML
    private CheckBox checkRepeat;
    @FXML
    private ListView<String> startTime;
    @FXML
    private ListView<String> finishTime;
    boolean checkRepeatValue; 
    String select_startTime;
    String select_finishTime;
    String select_pre;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setInit();
    }    
    void setInit()
    {
        startTime.setItems(startTimelist);
        finishTime.setItems(finishTimelist);
        preAlarmList.setItems(preAlarmlist);
        
    }
    @FXML
    private void Clicking(ActionEvent event) {
        sch_input = scheduleName.getText();
        detail_input = detail.getText();
        System.out.println(sch_input);
        System.out.println(detail_input);
        System.out.println(select_startTime);
        System.out.println(select_finishTime);
        System.out.println(select_pre);   
        System.out.println(checkRepeatValue);  
        SmartReminder.primaryStage.getScene().setRoot(SmartReminder.addSchedulePage);
        
    }

    @FXML
    private void checkBoxOnClick(ActionEvent event) {
         checkRepeatValue = checkRepeat.isSelected();
    }

    @FXML
    private void backOnclick(ActionEvent event) {
         SmartReminder.primaryStage.getScene().setRoot(SmartReminder.addSchedulePage);
    }

    @FXML
    private void SelectStartTime(MouseEvent event) {
        if(event.getClickCount() == 1){
            select_startTime = startTime.getSelectionModel().getSelectedItem();
        }    
    }

    @FXML
    private void SelectFinishTime(MouseEvent event) {
        if(event.getClickCount() == 1){
            select_finishTime = finishTime.getSelectionModel().getSelectedItem();
        }
    }

    @FXML
    private void preAlarming(ActionEvent event) {
        select_pre = preAlarmList.getValue(); 
    }
    
}
