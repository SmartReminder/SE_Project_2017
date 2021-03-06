/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartreminder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import classes.UserAccount;
import javax.persistence.*;

/**
 *
 * @author 58010622
 */
public class SmartReminder extends Application {
    
    public static Parent loginPage;
    public static Parent homePage;
    public static Parent errorLogin;
    public static Parent loginForm;
    public static Parent profilePage;
    public static Parent groupPage;
    public static Parent addSchedulePage;
    public static Parent addingSchedulePage;
    public static Parent timeTablePage;
    
    public static Stage primaryStage;
    public static Pane primaryPane;
    public static Pane secondaryPane;
    
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("./db/database.odb");
    
    @Override
    public void start(Stage stage) throws Exception {
        
        /*UserAccount tmpUser = new UserAccount("testid", "testpass", "095-852-9865");
        
        EntityManager em = emf.createEntityManager();
 
        // Store 1000 Point objects in the database:
        em.getTransaction().begin();
        
        em.persist(tmpUser);
                
        em.getTransaction().commit();
        
        // Close the database connection:
        em.close();
        emf.close();*/
        
        primaryStage = stage;
        loginPage = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        profilePage = FXMLLoader.load(getClass().getResource("ProfilePage.fxml"));
        homePage = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        errorLogin = FXMLLoader.load(getClass().getResource("ErrorLogin.fxml"));
        loginForm = FXMLLoader.load(getClass().getResource("FillIdPassword.fxml"));
        groupPage = FXMLLoader.load(getClass().getResource("GroupPage.fxml"));
        addSchedulePage = FXMLLoader.load(getClass().getResource("AddSchedule.fxml"));
        addingSchedulePage = FXMLLoader.load(getClass().getResource("AddingSchedule.fxml"));
        timeTablePage = FXMLLoader.load(getClass().getResource("TimeTable.fxml"));
        
        Scene scene = new Scene(loginPage);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Smart Reminder");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
