/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author wejdan
 */
public class TaskFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text t1 = new Text("NAME :");
        TextField f1 =new TextField();

        Text t2 = new Text("Date");
        DatePicker datePicker = new DatePicker(); 
        
        ToggleGroup gender = new ToggleGroup();
        Text t3 = new Text("gender: ");
        RadioButton r1 = new RadioButton("Male");
        r1.setToggleGroup(gender);
        RadioButton r2 = new RadioButton("Female");
        r2.setToggleGroup(gender);

        Text t4 = new Text("Reservation");
        Button b1 = new Button("Yes");
        Button b2 = new Button("No");


        Text t7 = new Text("Technologies Known"); 
        CheckBox javaCheckBox = new CheckBox("Java"); 
        javaCheckBox.setIndeterminate(false); 
        CheckBox dotnetCheckBox = new CheckBox("DotNet"); 
        javaCheckBox.setIndeterminate(false); 

        Text t5 = new Text("Educational qualification");
        ObservableList<String> names = FXCollections.observableArrayList( 
        "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil"); 
        ListView<String> educationListView = new ListView<String>(names);
        Text t6 = new Text("Location");
        ChoiceBox locationchoiceBox = new ChoiceBox(); 
        locationchoiceBox.getItems().addAll
        ("Cairo", "Usa", "Ksa", "Germany"); 

        Button b3 = new Button("Register");
       
        GridPane root = new GridPane();
        
        root.setPadding(new Insets(20, 20, 20, 20));  
        root.setVgap(15); 
        root.setHgap(5);       
        root.setAlignment(Pos.CENTER); 
        root.setMinSize(550, 550); 
         
        root.add(t1,0,0);
        root.add(f1,0,1);

        root.add(t2,0,2);
        root.add(datePicker,0,3);
        
        root.add(t3,0,5);
        root.add(r2,0,6);
        root.add(r1,1,6);
        
        root.add(t4,0,8);
        root.add(b1,1,8);
        root.add(b2,2,8);
        
        root.add(t7,0,9);
        root.add(javaCheckBox,1,9);
        root.add(dotnetCheckBox,2,9);
        
        root.add(t5,0,10);
        root.add(educationListView,1,10);
        
        root.add(t6,0,11);
        root.add(locationchoiceBox,1,11);
        
        root.add(b3,2, 12);
        
        root.setStyle("-fx-background-color:white;");
        
        t1.setStyle("-fx-font:normal bold 13px 'serif'");
        t2.setStyle("-fx-font:normal bold 13px 'serif' ");
        t3.setStyle("-fx-font:normal bold 13px 'serif' ");
        t4.setStyle("-fx-font:normal bold 13px 'serif' ");
        t5.setStyle("-fx-font:normal bold 13px 'serif' ");
        t6.setStyle("-fx-font:normal bold 13px 'serif' ");
        t7.setStyle("-fx-font:normal bold 13px 'serif' ");
    
        b1.setStyle("-fx-color:blue;");
        b2.setStyle("-fx-color:blue;");
        b3.setStyle("-fx-color:blue;");
     
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Registration Form"); 
         
        primaryStage.setScene(scene);  
      
        primaryStage.show();      
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}