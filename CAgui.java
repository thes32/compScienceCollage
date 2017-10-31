package main;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CAgui extends Application{
    static Scene main, chooseP, pCat, chooseS, displayS, batteryS, appsS, touchS, jackS, otherS, endS, makeModel;
    static Button portable, stationary, phone, tablet, laptop, display, battery, apps, touchscreen, other, jack, makeModelButton;
    static Button wrong_color, broken, blank, lowlife, not_charging, not_responding, not_responding2, not_working_at_all, not_working, submit, quit;
    public static String type, pType, problem, make, model;
    static Stage thestage;
    static Label lb1, lb2, lb3, lb4, lb5;
    static TextField tx, tx2, tx3;
    static VBox vb1, vb2, vb3, vb4, vb5, vb6, vb7, vb8, vb9, vb10, vb11;
    static DateFormat dateFormat;
    static Date date;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) {
        thestage = primaryStage;
        
        dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        date = new Date();
        
        vb1 = new VBox();
        vb1.setAlignment(Pos.CENTER);
        vb2 = new VBox();
        vb2.setAlignment(Pos.CENTER);
        vb3 = new VBox();
        vb3.setAlignment(Pos.CENTER);
        vb4 = new VBox();
        vb4.setAlignment(Pos.CENTER);
        vb5 = new VBox();
        vb5.setAlignment(Pos.CENTER);
        vb6 = new VBox();
        vb6.setAlignment(Pos.CENTER);
        vb7 = new VBox();
        vb7.setAlignment(Pos.CENTER);
        vb8 = new VBox();
        vb8.setAlignment(Pos.CENTER);
        vb9 = new VBox();
        vb9.setAlignment(Pos.CENTER);
        vb10 = new VBox();
        vb10.setAlignment(Pos.CENTER);
        vb11 = new VBox();
        vb11.setAlignment(Pos.CENTER);
        
        lb1 = new Label("Please select which category your problem belongs to");
        lb2 = new Label("What is your problem");
        lb3 = new Label();
        lb4 = new Label("What is the make of the phone? e.g Apple, Samsung...");
        lb5 = new Label("What is the model of your phone? e.g 7S, S7 Edge...");
        
        tx = new TextField();
        tx.setPrefWidth(750);
        tx.setPrefHeight(50);
        tx2 = new TextField();
        tx2.setPrefWidth(750);
        tx2.setPrefHeight(50);
        tx3 = new TextField();
        tx3.setPrefWidth(750);
        tx3.setPrefHeight(50);
        
        portable = new Button("Portable Devices");
        stationary = new Button("Desktop Computer");
        phone = new Button("Phone");
        tablet = new Button("Tablet");
        laptop = new Button("Laptop");
        display = new Button("Display");
        battery = new Button("Battery");
        apps = new Button("Apps");
        touchscreen = new Button("Touchscreen");
        jack = new Button("Headphone Jack");
        other = new Button("Other");
        submit = new Button("Submit");
        wrong_color = new Button("Wrong Color");
        broken = new Button("Broken/Cracked");
        blank = new Button("Blank");
        lowlife = new Button("Fast drain");
        not_charging = new Button("Not charging");
        not_responding = new Button("Not responding");
        not_responding2 = new Button("Still not responding");
        not_working_at_all = new Button("Not working at all");
        not_working = new Button("Not working");
        quit = new Button("Quit");
        makeModelButton = new Button("Continue");
        
        portable.setOnAction(e-> click(e));
        stationary.setOnAction(e-> click(e));
        phone.setOnAction(e-> click(e));
        tablet.setOnAction(e-> click(e));
        laptop.setOnAction(e-> click(e));
        display.setOnAction(e-> click(e));
        battery.setOnAction(e-> click(e));
        apps.setOnAction(e-> click(e));
        touchscreen.setOnAction(e-> click(e));
        jack.setOnAction(e-> click(e));
        other.setOnAction(e-> click(e));
        submit.setOnAction(e-> click(e));
        wrong_color.setOnAction(e-> click(e));
        broken.setOnAction(e-> click(e));
        blank.setOnAction(e-> click(e));
        lowlife.setOnAction(e-> click(e));
        not_charging.setOnAction(e-> click(e));
        not_responding.setOnAction(e-> click(e));
        not_responding2.setOnAction(e-> click(e));
        not_working_at_all.setOnAction(e-> click(e));
        not_working.setOnAction(e-> click(e));
        quit.setOnAction(e-> click(e));
        makeModelButton.setOnAction(e-> click(e));
        
        portable.setPrefSize(150, 70);
        stationary.setPrefSize(150, 70);
        phone.setPrefSize(150, 70);
        tablet.setPrefSize(150, 70);
        laptop.setPrefSize(150, 70);
        display.setPrefSize(150, 70);
        battery.setPrefSize(150, 70);
        apps.setPrefSize(150, 70);
        touchscreen.setPrefSize(150, 70);
        jack.setPrefSize(150, 70);
        other.setPrefSize(150, 70);
        submit.setPrefSize(150, 70);
        wrong_color.setPrefSize(150, 70);
        broken.setPrefSize(150, 70);
        blank.setPrefSize(150, 70);
        lowlife.setPrefSize(150, 70);
        not_charging.setPrefSize(150, 70);
        not_responding.setPrefSize(150, 70);
        not_responding2.setPrefSize(150, 70);
        not_working_at_all.setPrefSize(150, 70);
        not_working.setPrefSize(150, 70);
        quit.setPrefSize(100, 50);
        makeModelButton.setPrefSize(100, 50);
        
        vb1.getChildren().addAll(portable, stationary);
        vb1.setSpacing(10);
        vb2.getChildren().addAll(phone, tablet, laptop);
        vb2.setSpacing(10);
        vb3.getChildren().addAll(lb1, display, battery, apps, touchscreen, jack, other);
        vb3.setSpacing(10);
        vb4.getChildren().addAll(lb2, tx, submit);
        vb4.setSpacing(10);
        vb5.getChildren().addAll(wrong_color, broken, blank);
        vb5.setSpacing(10);
        vb6.getChildren().addAll(lowlife, not_charging);
        vb6.setSpacing(10);
        vb7.getChildren().addAll(not_responding, not_responding2);
        vb7.setSpacing(10);
        vb8.getChildren().addAll(not_working_at_all);
        vb8.setSpacing(10);
        vb9.getChildren().addAll(not_working);
        vb9.setSpacing(10);
        vb10.getChildren().addAll(lb3, quit);
        vb10.setSpacing(10);
        vb11.getChildren().addAll(lb4, tx2, lb5, tx3, makeModelButton);
        vb11.setSpacing(10);
        
        main = new Scene(vb1, 1280, 720);
        makeModel = new Scene(vb11, 1280, 720);
        chooseP = new Scene(vb2, 1280, 720);
        pCat = new Scene(vb3, 1280, 720);
        otherS = new Scene(vb4, 1280, 720);
        displayS = new Scene(vb5, 1280, 720);
        batteryS = new Scene(vb6, 1280, 720);
        appsS = new Scene(vb7, 1280, 720);
        touchS = new Scene(vb8, 1280, 720);
        jackS = new Scene(vb9, 1280, 720);
        endS = new Scene(vb10, 1280, 720);
        
        
        primaryStage.setTitle("Troubleshooting - by Serban V");
        primaryStage.setScene(main);
        primaryStage.show();
    }
    
    public static void click(ActionEvent e) {
        if (e.getSource()==portable) {
            thestage.setScene(makeModel);
        }
        if (e.getSource()==stationary) {
            
        }
        if (e.getSource()==phone) {
            type = "phone";
            thestage.setScene(pCat);
        }
        if (e.getSource()==tablet) {
            type = "tablet";
            thestage.setScene(pCat);
        }
        if (e.getSource()==laptop) {
            type = "laptop";
            thestage.setScene(pCat);
        }
        if (e.getSource()==display) {
            pType = "display";
            thestage.setScene(displayS);
        }
        if (e.getSource()==battery) {
            pType = "battery";
            thestage.setScene(batteryS);
        }
        if (e.getSource()==apps) {
            pType = "apps";
            thestage.setScene(appsS);
        }
        if (e.getSource()==touchscreen) {
            pType = "touchscreen";
            thestage.setScene( touchS);
        }
        if (e.getSource()==jack) {
            pType = "jack";
            thestage.setScene(jackS);
        }
        if (e.getSource()==other) {
            pType = "other";
            thestage.setScene(otherS);
        }
        if (e.getSource()==submit) {
            problem = tx.getText();
            go();
        }
        
        
        if (e.getSource()==wrong_color) {
            problem = "wrong color";
            lb3.setText("Restart your phone. If the problem persists, go to a repair shop");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==broken) {
            problem = "broken";
            lb3.setText("See a repair shop or a store");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==blank) {
            problem = "blank";
            lb3.setText("Hold the power button for a few seconds, if it does not work see a repair shop");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==lowlife) {
            problem = "fast drain";
            lb3.setText("Replace your battery, or see a store/repair shop");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==not_charging) {
            problem = "not charging";
            lb3.setText("Change charger or see a repair shop");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==not_responding) {
            problem = "not responding";
            lb3.setText("Restart your phone");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==not_responding2) {
            problem = "still not responding after restart";
            lb3.setText("Factory restart, or go to a repair shop");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==not_working_at_all) {
            problem = "not working at all";
            lb3.setText("Restart your phone, or go to a repair shop");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==not_working) {
            problem = "not working";
            lb3.setText("Change headphones or go to a repair shop");
            thestage.setScene(endS);
            go();
        }
        if (e.getSource()==quit){
            Platform.exit();
        }
        
        if (e.getSource()==makeModelButton){
        	make = tx2.getText();
        	model = tx3.getText();
        	thestage.setScene(chooseP);
        }
    }
    
    public static void go() {
        try {
            new runModels();
        } catch (IOException ex) {
            Logger.getLogger(CAgui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class runModels {
    
    static File file;
    static FileWriter fw;
    static BufferedWriter bw;
    static PrintWriter pw;
    
    runModels() throws IOException{
        file = new File("GUItech.csv");
        fw = new FileWriter(file, true);
        bw = new BufferedWriter(fw);
        pw = new PrintWriter(bw);
        
        Random rand = new Random();
        int random = rand.nextInt((999999 - 10000) + 1) + 10000;
        
        pw.println(random + "," + CAgui.type + "," + CAgui.make + "," + CAgui.model + "," + CAgui.pType + "," + CAgui.problem.toUpperCase() + "," + CAgui.dateFormat.format(CAgui.date));
        
        pw.close();
        
        System.out.println("EXPORTED");
    }
}