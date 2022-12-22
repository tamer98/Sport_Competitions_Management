package View;

import Controller.AlertController;
import Controller.ErrorController;
import Model.Tennis;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TennisGUI{

    private Stage primaryStage;

    private Button btnDone;

    static Tennis t;

    static Label lblN1;
    static Label lblN2;

    TennisGUI(Stage primaryStage){
        // constructor
        this.primaryStage = primaryStage;
        try{
            Screen();
        }catch (Exception e){
            System.out.println("Error has occured");

        }


    }

    private void Screen(){
        // screen method
        btnDone = new Button("Done");
        Label lblT = new Label("Tennis Game");
        // textfields
        TextField txta1 = new TextField();
        TextField txta2 = new TextField();
        TextField txta3 = new TextField();
        TextField txta4 = new TextField();
        TextField txta5 = new TextField();

        TextField txtb1 = new TextField();
        TextField txtb2 = new TextField();
        TextField txtb3 = new TextField();
        TextField txtb4 = new TextField();
        TextField txtb5 = new TextField();
        // setting the width to text fields
        int size = 48;
        txta1.setMaxWidth(size);
        txta1.setMinWidth(size);
        txta2.setMaxWidth(size);
        txta2.setMinWidth(size);
        txta3.setMaxWidth(size);
        txta3.setMinWidth(size);
        txta4.setMaxWidth(size);
        txta4.setMinWidth(size);
        txta5.setMaxWidth(size);
        txta5.setMinWidth(size);
        txtb1.setMaxWidth(size);
        txtb1.setMinWidth(size);
        txtb2.setMaxWidth(size);
        txtb2.setMinWidth(size);
        txtb3.setMaxWidth(size);
        txtb3.setMinWidth(size);
        txtb4.setMaxWidth(size);
        txtb4.setMinWidth(size);
        txtb5.setMaxWidth(size);
        txtb5.setMinWidth(size);

        // creating two labels
        lblN1 = new Label();
        lblN2 = new Label();
     //   HBox hb0 = new HBox(new Label("\t\t"),);
        VBox vblbl = new VBox(new Label(""),lblN1,lblN2);
        VBox vbc1 = new VBox(new Label("set 1"),txta1,txtb1);   // adding components to vbox
        VBox vbc2 = new VBox(new Label("set 2"),txta2,txtb2);
        VBox vbc3 = new VBox(new Label("set 3"),txta3,txtb3);
        VBox vbc4 = new VBox(new Label("set 4"),txta4,txtb4);
        VBox vbc5 = new VBox(new Label("set 5"),txta5,txtb5);
        HBox hbname = new HBox(vblbl,vbc1,vbc2,vbc3,vbc4,vbc5);
        VBox vbm = new VBox(lblT,hbname,btnDone);
        vbm.setAlignment(Pos.CENTER);   // allignments
        Scene scene = new Scene(vbm, 400, 460);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();



        hbname.setSpacing(17);
        vblbl.setSpacing(20);
        vbc1.setSpacing(20);
        vbc2.setSpacing(20);
        vbc3.setSpacing(20);        // set spacing to components
        vbc4.setSpacing(20);
        vbc5.setSpacing(20);
        vbm.setSpacing(90);
        hbname.setAlignment(Pos.CENTER);    // seting allingment center
        MainGUI.lblTitleStyling(lblT);  // styling the label
        lblT.setEffect(MainGUI.addTextEffect());

        btnDone.setOnAction(e->{
            int chk = 0;        // cehking if the textfields are not empty
            if (ErrorController.numChecker(txta1.getText()) && ErrorController.numChecker(txta2.getText()) && ErrorController.numChecker(txta3.getText()) && ErrorController.numChecker(txta4.getText()) && ErrorController.numChecker(txta5.getText())&&
                    ErrorController.numChecker(txtb1.getText()) && ErrorController.numChecker(txtb2.getText()) && ErrorController.numChecker(txtb3.getText()) && ErrorController.numChecker(txtb4.getText()) &&  ErrorController.numChecker(txtb5.getText()))
            {
                chk = 1;
            }
            else
            {       // alert box
                AlertController a = new AlertController(Alert.AlertType.ERROR,"Score Error","Enter Score in Correct Format");
            }
            if(chk == 1) {      // if all the texfeilds are not empty  then it move to nect
                t = new Tennis(lblN1.getText(), lblN2.getText(), Integer.parseInt(txta1.getText()), Integer.parseInt(txta2.getText())
                        , Integer.parseInt(txta3.getText()), Integer.parseInt(txta4.getText()), Integer.parseInt(txta5.getText()), Integer.parseInt(txtb1.getText())
                        , Integer.parseInt(txtb2.getText()), Integer.parseInt(txtb3.getText()), Integer.parseInt(txtb4.getText()), Integer.parseInt(txtb5.getText()));
                CompetitionGUI.moveToNext();
                this.primaryStage.close();
            }
        });
        txtb3.textProperty().addListener((observable, oldValue, newValue) -> {
            if((Integer.parseInt(txta1.getText())>Integer.parseInt(txtb1.getText())) && (Integer.parseInt(txta2.getText())>Integer.parseInt(txtb2.getText())) &&(Integer.parseInt(txta3.getText())>Integer.parseInt(txtb3.getText())) ||
                    (Integer.parseInt(txta1.getText())<Integer.parseInt(txtb1.getText())) && (Integer.parseInt(txta2.getText())<Integer.parseInt(txtb2.getText())) &&(Integer.parseInt(txta3.getText())<Integer.parseInt(txtb3.getText()))) {

                txta4.setText("0");
                txta5.setText("0");
                txtb4.setText("0");
                txtb5.setText("0");
                vbc4.setVisible(false);
                vbc5.setVisible(false);
            }
        });
    }


}
