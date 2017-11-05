/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartreminder;

import java.awt.Paint;
import java.net.URL;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.GridPane.getColumnIndex;
import javafx.scene.paint.Color;

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
    
    int year = Calendar.getInstance().get(Calendar.YEAR);
    private static int month;  
    ObservableList<String> list = FXCollections.observableArrayList("2017","2018");
    @FXML
    private Button julBtn;
    @FXML
    private Label month_label;
    @FXML
    private Label month_label1;
    @FXML
    private Label month_label2;
    @FXML
    private GridPane calendarPane;
    private Label[] dayLabel = new Label[42];
    private Rectangle[] dayBlock = new Rectangle[42];
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO    
        Calendar c = Calendar.getInstance();
        month = c.get(Calendar.MONTH);
        String defaultMonth = new DateFormatSymbols().getMonths()[month];
        generateCalendar(month,year);
        month_label.setText(defaultMonth);
         year_list.setItems(list);  
    }
    
    

    @FXML
    private void list_Action(ActionEvent event) {
        year = Integer.parseInt(year_list.getValue().toString());
        generateCalendar(month,year);
    }

    @FXML
    private void janBtn(ActionEvent event) {
        month = 0;
        month_label.setText("January");
        generateCalendar(month,year);
    }

    @FXML
    private void febBtn(ActionEvent event) {
        month = 1;
        month_label.setText("February");
        generateCalendar(month,year);
    }

    @FXML
    private void marBtn(ActionEvent event) {
        month = 2;
        month_label.setText("March"); 
        generateCalendar(month,year);
    }

    @FXML
    private void aprBtn(ActionEvent event) {
        month = 3;
        month_label.setText("April");
        generateCalendar(month,year);
    }

    @FXML
    private void mayBtn(ActionEvent event) {
        month = 4;
        month_label.setText("May");
        generateCalendar(month,year);
    }

    @FXML
    private void junBtn(ActionEvent event) {
        month = 5;
        month_label.setText("June");
        generateCalendar(month,year);
    }

    @FXML
    private void julBtn(ActionEvent event) {
        month = 6;
        month_label.setText("July");
        generateCalendar(month,year);
    }
    @FXML
    private void augBtn(ActionEvent event) {
        month = 7;
        month_label.setText("August");
        generateCalendar(month,year);
    }

    @FXML
    private void sepBtn(ActionEvent event) {
        month = 8;
        month_label.setText("September");
        generateCalendar(month,year);
    }

    @FXML
    private void octBtn(ActionEvent event) {
        month = 9;
        month_label.setText("October");
        generateCalendar(month,year);
    }

    @FXML
    private void novBtn(ActionEvent event) {
        month = 10;
        month_label.setText("November");
        generateCalendar(month,year);
    }

    @FXML
    private void decBtn(ActionEvent event) {
        month = 11;
        month_label.setText("December");
        generateCalendar(month,year);
    }

    @FXML
    private void signOut(MouseEvent event) {
        SmartReminder.primaryStage.getScene().setRoot(SmartReminder.loginPage);
    }

   void generateCalendar(int month,int year){
        int count_day = 1;
        int rectangle_loop = 1;
         //month in Calendar class start at 0(0 = january) 
         Calendar c = Calendar.getInstance();
         c.set(year, month, 1);
         int day_of_week = c.get(Calendar.DAY_OF_WEEK);
         //day of week started at 1 (1 = sunday)
         
        // Get the number of days in that month
         int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH); 
         
         //Get the number of days in that previous month
         month = (month == 0) ? 11 : month-1;
         c.set(year,month,1);
         int daysInPreviousMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
         int day = daysInPreviousMonth+2-day_of_week;
         int dayinMonth = 1;
         if(day_of_week == 1){
             day = 1;           
         }
         for (Node child : calendarPane.getChildren()) {
            if(child.getId()!=null){
                if(child.getId().contains("dayBlock")){
                    dayBlock[rectangle_loop-1] = (Rectangle) child;
                    rectangle_loop++;
                }
                if(child.getId().contains("dayLabel")){
                    dayLabel[count_day-1] = (Label) child;
                    if(count_day < day_of_week){
                        dayLabel[count_day-1].setText(String.valueOf(day++));
                        dayBlock[count_day-1].setFill(Color.AZURE);
                        day = (count_day+1==day_of_week) ? 1 : day;
                    }
                    else if(count_day < daysInMonth+day_of_week)
                    {
                        String x = child.getTypeSelector();
                        System.out.println(x);
                       dayBlock[count_day-1].setFill(Color.WHITE);
                       dayLabel[count_day-1].setText(String.valueOf(day++));
                       day = (day-1==daysInMonth) ? 1 : day;
                    }
                    else
                    {
                       dayBlock[count_day-1].setFill(Color.AZURE);
                       dayLabel[count_day-1].setText(String.valueOf(day++));
                    }
                    count_day++;
                    //System.out.println(child);
                }
            }
        }
    }
   
}
