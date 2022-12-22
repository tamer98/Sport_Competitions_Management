package View;


import Controller.AlertController;
import Controller.ErrorController;
import Model.FootBall;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FootballGUI {
    private Stage primaryStage;

    private Button btnDone;

    static FootBall f;

    static Label lblN1;
    static Label lblN2;

    FootballGUI(Stage primaryStage){
        // constructor
        this.primaryStage = primaryStage;
        try{
            Screen();
        }catch (Exception e){
            System.out.println("Error has occured");

        }


    }
        // screen method
    private void Screen(){
        //creating buttons labels and text fields
        btnDone = new Button("Done");
        Label lblT = new Label("Soccer Game");

        TextField txta1 = new TextField();
        TextField txta2 = new TextField();

        TextField txtb1 = new TextField();
        TextField txtb2 = new TextField();
        // setting the width for the text fields
        int size = 90;
        txta1.setMaxWidth(size);
        txta1.setMinWidth(size);
        txta2.setMaxWidth(size);
        txta2.setMinWidth(size);
        txtb1.setMaxWidth(size);
        txtb1.setMinWidth(size);
        txtb2.setMaxWidth(size);
        txtb2.setMinWidth(size);

    // adding labels and wraping the componenets to vbox and hbox
        lblN1 = new Label();
        lblN2 = new Label();
        VBox vblbl = new VBox(new Label(""),lblN1,lblN2);
        Label lblhalf = new Label("Half 1");
        VBox vbc1 = new VBox(lblhalf,txta1,txtb1);
        VBox vbc2 = new VBox(new Label("Half 2"),txta2,txtb2);
        HBox hbname = new HBox(vblbl,vbc1,vbc2);
        VBox vbm = new VBox(lblT,hbname,btnDone);
        vbm.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbm, 400, 460);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        // setting the spaces to all the required components
        hbname.setSpacing(17);
        vblbl.setSpacing(20);
        vbc1.setSpacing(20);
        vbc2.setSpacing(20);
        vbm.setSpacing(90);
        hbname.setAlignment(Pos.CENTER);
        MainGUI.lblTitleStyling(lblT);
        lblT.setEffect(MainGUI.addTextEffect());    // adding the drop shadow effect

        btnDone.setOnAction(e->{
            try {
                int chk = 0;
                if(vbc2.isVisible()) {      // cheking that all the values are correctly entered if vbox is Invisible
                    if (ErrorController.numChecker(txta1.getText()) && ErrorController.numChecker(txta2.getText()) && ErrorController.numChecker(txtb1.getText()) && ErrorController.numChecker(txtb2.getText()))
                    {
                        chk = 1;
                    }
                }else{  // checking if the values are correclty entered if vbox is enable
                    if (ErrorController.numChecker(txta1.getText()) && ErrorController.numChecker(txtb1.getText())){
                        chk = 1;
                    }
                }
                if(chk ==1) {       // adding value to constructor for penelty and another half
                    if (lblhalf.getText().equals("Penelty") || lblhalf.getText().equals("Another Half")) {
                        f = new FootBall(lblN1.getText(), lblN2.getText(), Integer.parseInt(txta1.getText()), 0
                                , Integer.parseInt(txtb1.getText()), 0);
                    }
                    // adding value to constructor if its in initial for (half1,half2)
                    if (!lblhalf.getText().equals("Another Half") && !lblhalf.getText().equals("Penelty")) {
                        f = new FootBall(lblN1.getText(), lblN2.getText(), Integer.parseInt(txta1.getText()), Integer.parseInt(txta2.getText())
                                , Integer.parseInt(txtb1.getText()), Integer.parseInt(txtb2.getText()));
                    }       // setting the label to penelty if their is another half written and decision is still pending
                    if (lblhalf.getText().equals("Another Half") && (Integer.parseInt(txta1.getText()) == Integer.parseInt(txtb1.getText()))) {
                        vbc2.setVisible(false);
                        lblhalf.setText("Penelty");
                        txta1.clear();
                        txtb1.clear();
                    }
                    // if result is draw for initial stage then it move for another half
                    if ((Integer.parseInt(txta1.getText()) + Integer.parseInt(txta2.getText())) == (Integer.parseInt(txtb1.getText()) + Integer.parseInt(txtb2.getText()))) {
                        vbc2.setVisible(false);
                        lblhalf.setText("Another Half");
                        txta1.clear();
                        txtb1.clear();

                    }

                    // if winner is selected then it move further and close the primary stage
                    if (!FootBall.getWinner().equals("none")) {
                        CompetitionGUI.moveToNext();
                        this.primaryStage.close();
                    }
                }else { // error for incorrect data
                    AlertController a = new AlertController(Alert.AlertType.ERROR,"Score Error","Enter Score in Correct Format");

                }
            }catch (Exception ex){

            }

        });
    }
}
