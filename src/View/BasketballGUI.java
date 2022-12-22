package View;

import Controller.AlertController;
import Controller.ErrorController;
import Model.Basketball;
import Model.Tennis;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BasketballGUI {
        //declaring variables
    private Stage primaryStage;

    private Button btnDone;

    static Basketball b;

    static Label lblN1;
    static Label lblN2;

    BasketballGUI(Stage primaryStage){
        // constructor for basketball game pop up
        this.primaryStage = primaryStage;
        try{
            Screen(); // calling the screen method
        }catch (Exception e){
            System.out.println("Error has occured");

        }


    }

    private void Screen(){
            // creating button labels and text fields
        btnDone = new Button("Done");
        Label lblT = new Label("Basketball Game");

        TextField txta1 = new TextField();
        TextField txta2 = new TextField();
        TextField txta3 = new TextField();
        TextField txta4 = new TextField();

        TextField txtb1 = new TextField();
        TextField txtb2 = new TextField();
        TextField txtb3 = new TextField();
        TextField txtb4 = new TextField();
        // setting default size for text fields
        int size = 50;
        txta1.setMaxWidth(size);
        txta1.setMinWidth(size);
        txta2.setMaxWidth(size);
        txta2.setMinWidth(size);
        txta3.setMaxWidth(size);
        txta3.setMinWidth(size);
        txta4.setMaxWidth(size);
        txta4.setMinWidth(size);
        txtb1.setMaxWidth(size);
        txtb1.setMinWidth(size);
        txtb2.setMaxWidth(size);
        txtb2.setMinWidth(size);
        txtb3.setMaxWidth(size);
        txtb3.setMinWidth(size);
        txtb4.setMaxWidth(size);
        txtb4.setMinWidth(size);

        // wraping components in VBOxes and Hbox (atifa)
        lblN1 = new Label();
        lblN2 = new Label();
        VBox vblbl = new VBox(new Label(""),lblN1,lblN2);
        VBox vbc1 = new VBox(new Label("Qa 1"),txta1,txtb1);
        VBox vbc2 = new VBox(new Label("Qa 2"),txta2,txtb2);
        VBox vbc3 = new VBox(new Label("Qa 3"),txta3,txtb3);
        VBox vbc4 = new VBox(new Label("Qa 4"),txta4,txtb4);
        HBox hbname = new HBox(vblbl,vbc1,vbc2,vbc3,vbc4);
        VBox vbm = new VBox(lblT,hbname,btnDone);
        vbm.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbm, 400, 460);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    // setting spaces to all the required components
        hbname.setSpacing(17);
        vblbl.setSpacing(20);
        vbc1.setSpacing(20);
        vbc2.setSpacing(20);
        vbc3.setSpacing(20);
        vbc4.setSpacing(20);
        vbm.setSpacing(90);
        hbname.setAlignment(Pos.CENTER);
        MainGUI.lblTitleStyling(lblT);
        lblT.setEffect(MainGUI.addTextEffect());

        // button done action event method
        btnDone.setOnAction(e->{
            int chk = 0;        // checking if all the numbers are present
            if (ErrorController.numChecker(txta1.getText()) && ErrorController.numChecker(txta2.getText()) && ErrorController.numChecker(txta3.getText()) && ErrorController.numChecker(txta4.getText()) &&
                    ErrorController.numChecker(txtb1.getText()) && ErrorController.numChecker(txtb2.getText()) && ErrorController.numChecker(txtb3.getText()) && ErrorController.numChecker(txtb4.getText()))
            {
                chk = 1;
            }
            else
            {   // alert box if user enter number instead of alphabets
                AlertController a = new AlertController(Alert.AlertType.ERROR,"Score Error","Enter Score in Correct Format");

            }   //if all the values correctly entered then it move further and pass the value to the constructor
            if(chk == 1) {
                b = new Basketball(lblN1.getText(), lblN2.getText(), Integer.parseInt(txta1.getText()), Integer.parseInt(txta2.getText())
                        , Integer.parseInt(txta3.getText()), Integer.parseInt(txta4.getText()), Integer.parseInt(txtb1.getText())
                        , Integer.parseInt(txtb2.getText()), Integer.parseInt(txtb3.getText()), Integer.parseInt(txtb4.getText()));
                CompetitionGUI.moveToNext();    // calling the move to next method
                this.primaryStage.close();      // closing the current stage
            }
        });
    }
}
