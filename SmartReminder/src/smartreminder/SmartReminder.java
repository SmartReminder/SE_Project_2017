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
    
    
    public static Stage primaryStage;
    public static Pane primaryPane;
    public static Pane secondaryPane;
    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        loginPage = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        profilePage = FXMLLoader.load(getClass().getResource("ProfilePage.fxml"));
        homePage = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        errorLogin = FXMLLoader.load(getClass().getResource("ErrorLogin.fxml"));
        loginForm = FXMLLoader.load(getClass().getResource("FillIdPassword.fxml"));
        groupPage = FXMLLoader.load(getClass().getResource("GroupPage.fxml"));
        
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
