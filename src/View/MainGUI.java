
package View;

import Controller.AlertController;
import Controller.ErrorController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class MainGUI extends Application{

    static TextField[] txtName = new TextField[9];  //creating the textfield array
    static int counterTxt = 1;                      //text field counter
    RadioButton rdoTennis,rdoBasketball,rdoSoccer;      //radio button
    static String radioSelection = "";      // string for checking radio selection

    HBox hboxToDisable,hb;                  //creating hbox
    VBox vbforTitle;                        // vbox

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        VBox vboxTextFields = new VBox();       // textfields wraping in VBox
        for(int i = 1; i <= 8; i++){            // loop for creating the text fields
            txtName[i] = new TextField();       //  creating new text fields
            vboxTextFields.getChildren().add(txtName[i]);
            txtName[i].setEditable(false);  // setting editable false
            txtName[i].setEffect(addTextEffect());
        }

        Label lblParticipant = new Label("Participant Name: "); //  adding label
        TextField txtParticipant = new TextField();     // creating new text field
        Button btnAdd = new Button("Add Participant");      // creating button
        Button btnStart = new Button("Start Championship"); //creating another button

        rdoTennis = new RadioButton("Tennis");      // radio buttons
        rdoBasketball = new RadioButton("Basketball");
        rdoSoccer = new RadioButton("Soccer");
        
        BackgroundFill background_fill;
        background_fill = new BackgroundFill(Color.WHITESMOKE,
                CornerRadii.EMPTY, Insets.EMPTY);
        


        Background background = new Background(background_fill);

        GridPane grid = new GridPane();     // wraping components to grid pane
        HBox hb1 = new HBox(lblParticipant,txtParticipant);     //  hbox
        HBox hb2 = new HBox(btnAdd,btnStart);
        VBox vb = new VBox(hb1,hb2);
        VBox vboxRdo = new VBox(rdoTennis,rdoBasketball,rdoSoccer);
        HBox hbox2 = new HBox(vb,vboxRdo);
        hboxToDisable = new HBox(hbox2);
        hb = new HBox(vboxTextFields,hboxToDisable);
        hb.setAlignment(Pos.CENTER);        // setting the position to center
       // hboxToDisable.setStyle("-fx-border-style: solid inside;");
        hb.setBackground(background);
        hb.setSpacing(300);
        Label lblTitle = new Label("Championship");
        lblTitleStyling(lblTitle);  // calling the title styling function from same class
        lblTitle.setEffect(addTextEffect());    // adding dropshadow effect

        vbforTitle = new VBox(lblTitle,hb);
        vbforTitle.setAlignment(Pos.TOP_CENTER);        //  setting allignments
        vbforTitle.setSpacing(80);
        Scene scene = new Scene(vbforTitle, 1340, 700);

        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

        vboxTextFields.setSpacing(34.5);
        vboxTextFields.setAlignment(Pos.CENTER);
        vboxRdo.setAlignment(Pos.CENTER_LEFT);
        vb.setAlignment(Pos.CENTER);
        hbox2.setSpacing(300);
        grid.setHgap(30);
        grid.setVgap(30);
        vboxRdo.setSpacing(10);
        hb1.setSpacing(20);
        hb2.setSpacing(20);
        vb.setSpacing(20);




        btnAdd.setOnAction(e->{ // adding the participant to textfields
            if(ErrorController.nameChecker(txtParticipant.getText())) {
                txtName[counterTxt].setText(txtParticipant.getText());
                counterTxt++;
                txtParticipant.clear();
                if(counterTxt == 9){
                    btnAdd.setDisable(true);
                }
            } else {
                AlertController a = new AlertController(Alert.AlertType.ERROR,"Name Error","Please Enter a Valid Format Name");
            }
        });
        btnStart.setOnAction(e->{
            if(counterTxt != 9){        // alert box for btns
                 AlertController a = new AlertController(Alert.AlertType.ERROR,"Name Error","Please Enter all the Names to Start Championship");
            }
            else{
                if(radioSelection.equals("")){
                    AlertController a = new AlertController(Alert.AlertType.ERROR,"Selection Error","Please Select a Competition to Start Championship");
                }else{      // starting the championship
                    startChampionShip();
               }
            }
        });
        rdoTennis.setOnAction(e->{      // calling the method for radio button to select radio button
            rdo(rdoTennis);
        });
        rdoBasketball.setOnAction(e->{
            rdo(rdoBasketball);
        });
        rdoSoccer.setOnAction(e->{
            rdo(rdoSoccer);
        });
    }

    public void startChampionShip(){        // adding anchorpane to right side when we click start championship button
        hboxToDisable.setVisible(false);
        hb.getChildren().remove(hboxToDisable);
        AnchorPane pane = new AnchorPane();
        CompetitionGUI gui = new CompetitionGUI();
        gui.trophy(pane);
        hb.setSpacing(0);
        vbforTitle.setSpacing(0);
        hb.getChildren().add(pane);
    }
    public void rdo(RadioButton r){     // radio secection method to select radio
        rdoTennis.setSelected(false);
        rdoBasketball.setSelected(false);
        rdoSoccer.setSelected(false);

        r.setSelected(true);        // select the selected radio
        radioSelection = r.getText();   // string to radioselection
        System.out.printf(" rdo "+radioSelection);
    }
    public static DropShadow addTextEffect() {
        // adding the drop shadow effect
        DropShadow ds = new DropShadow();
        ds.setSpread(0);
        ds.setWidth(21);
        ds.setHeight(21);
        ds.setRadius(10);
        ds.setBlurType(BlurType.THREE_PASS_BOX);
        ds.setColor(Color.BLUE);
        return ds;

    }
    // adding the title
    public static void lblTitleStyling(Label lbl){
        lbl.setFont(Font.font("Verdana"
                , FontWeight.BOLD
                , 34));
    }
}
