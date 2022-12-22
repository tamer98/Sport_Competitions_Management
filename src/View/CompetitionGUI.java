package View;

import Model.Basketball;
import Model.FootBall;
import Model.Game;
import Model.Tennis;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CompetitionGUI {
    private HBox hBox;
    private VBox vBox,vBox0,vBox1,vBox2,vBox3,vBox4;
    private Pane pane,pane0,pane1,pane2,pane3,pane4,pane5;
    private Line line,line0,line1,line2,line3,line4,line5,line6,line7,line8,line9,line10;
    private Line line11,line12,line13,line14,line15,line16,line17,line18,line19,line110,line111,line112,line113,line114,line115,line116;
    private static Button btnQ1,btnQ2,btnQ3,btnQ4,btaS1,btnS2,btnF;
    private static TextField txtS1,txtS2,txtS3,txtS4,txtF1,txtF2,txtWinner;
    private DropShadow dropShadow;
    static String currentMatch;
    static int s1 = 0,s2 = 0,f = 0;

    public void trophy(AnchorPane anchor) {
// initializing the components
        dropShadow = new DropShadow();
        hBox = new HBox();
        vBox = new VBox();
        pane = new Pane();
        line = new Line();
        line0 = new Line();
        line1 = new Line();
        line2 = new Line();
        btnQ1 = new Button();
        pane0 = new Pane();
        line3 = new Line();
        line4 = new Line();
        line5 = new Line();
        line6 = new Line();
        btnQ2 = new Button();
        pane1 = new Pane();
        line7 = new Line();
        line8 = new Line();
        line9 = new Line();
        line10 = new Line();
        btnQ3 = new Button();
        pane2 = new Pane();
        line11 = new Line();
        line12 = new Line();
        line13 = new Line();
        line14 = new Line();
        btnQ4 = new Button();
        vBox0 = new VBox();
        txtS1 = new TextField();

        txtS2 = new TextField();
        txtS3 = new TextField();
        txtS4 = new TextField();
        vBox1 = new VBox();
        pane3 = new Pane();
        line15 = new Line();
        line16 = new Line();
        line17 = new Line();
        line18 = new Line();
        btaS1 = new Button();
        pane4 = new Pane();
        line19 = new Line();
        line110 = new Line();
        line111 = new Line();
        line112 = new Line();
        btnS2 = new Button();
        vBox2 = new VBox();
        txtF1 = new TextField();
        txtF2 = new TextField();
        vBox3 = new VBox();
        pane5 = new Pane();
        line113 = new Line();
        line114 = new Line();
        line115 = new Line();
        line116 = new Line();
        btnF = new Button();
        vBox4 = new VBox();
        txtWinner = new TextField();

// setting the semi final and final buttons disable
        btaS1.setDisable(true);
        btnS2.setDisable(true);
        btnF.setDisable(true);


        anchor.setId("AnchorPane");
        anchor.setPrefHeight(700.0);
        anchor.setPrefWidth(1036.0);
// setting the value to center and setting the positions
        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.setLayoutY(118.0);
        hBox.setPrefWidth(1023.0);
        hBox.setSpacing(10.0);

        vBox.setPrefHeight(466.0);
        vBox.setPrefWidth(183.0);
        vBox.setSpacing(60.0);
// setting the location of line
        line.setEndX(80.80001831054688);
        line.setLayoutX(106.0);
        line.setLayoutY(35.0);
        line.setStartX(-6.399993896484375);

        line0.setEndX(-100.00000762939453);
        line0.setEndY(42.19999694824219);
        line0.setLayoutX(200.0);
        line0.setLayoutY(27.0);
        line0.setStartX(-100.00003051757812);
        line0.setStartY(-26.199996948242188);

        line1.setEndX(100.0);
        line1.setStartX(10.199981689453125);

        line2.setEndX(100.0);
        line2.setLayoutY(70.0);
        line2.setStartX(10.199981689453125);

        btnQ1.setLayoutX(42.0);
        btnQ1.setLayoutY(19.0);
        btnQ1.setMnemonicParsing(false);
        btnQ1.setPrefHeight(31.0);
        btnQ1.setPrefWidth(107.0);
        btnQ1.setText("Play a Game");
        btnQ1.setFont(new Font(15.0));


        line3.setEndX(80.80001831054688);
        line3.setLayoutX(106.0);
        line3.setLayoutY(35.0);
        line3.setStartX(-6.399993896484375);

        line4.setEndX(-100.00000762939453);
        line4.setEndY(42.19999694824219);
        line4.setLayoutX(200.0);
        line4.setLayoutY(27.0);
        line4.setStartX(-100.00003051757812);
        line4.setStartY(-26.199996948242188);

        line5.setEndX(100.0);
        line5.setStartX(10.199981689453125);

        line6.setEndX(100.0);
        line6.setLayoutY(70.0);
        line6.setStartX(10.199981689453125);

        btnQ2.setLayoutX(42.0);
        btnQ2.setLayoutY(19.0);
        btnQ2.setMnemonicParsing(false);
        btnQ2.setPrefHeight(31.0);
        btnQ2.setPrefWidth(107.0);
        btnQ2.setText("Play a Game");
        btnQ2.setFont(new Font(15.0));


        line7.setEndX(80.80001831054688);
        line7.setLayoutX(106.0);
        line7.setLayoutY(35.0);
        line7.setStartX(-6.399993896484375);

        line8.setEndX(-100.00000762939453);
        line8.setEndY(42.19999694824219);
        line8.setLayoutX(200.0);
        line8.setLayoutY(27.0);
        line8.setStartX(-100.00003051757812);
        line8.setStartY(-26.199996948242188);

        line9.setEndX(100.0);
        line9.setStartX(10.199981689453125);

        line10.setEndX(100.0);
        line10.setLayoutY(70.0);
        line10.setStartX(10.199981689453125);

        btnQ3.setLayoutX(42.0);
        btnQ3.setLayoutY(19.0);
        btnQ3.setMnemonicParsing(false);
        btnQ3.setPrefHeight(31.0);
        btnQ3.setPrefWidth(107.0);
        btnQ3.setText("Play a Game");
        btnQ3.setFont(new Font(15.0));


        line11.setEndX(80.80001831054688);
        line11.setLayoutX(106.0);
        line11.setLayoutY(35.0);
        line11.setStartX(-6.399993896484375);

        line12.setEndX(-100.00000762939453);
        line12.setEndY(42.19999694824219);
        line12.setLayoutX(200.0);
        line12.setLayoutY(27.0);
        line12.setStartX(-100.00003051757812);
        line12.setStartY(-26.199996948242188);

        line13.setEndX(100.0);
        line13.setStartX(10.199981689453125);

        line14.setEndX(100.0);
        line14.setLayoutY(70.0);
        line14.setStartX(10.199981689453125);

        btnQ4.setLayoutX(42.0);
        btnQ4.setLayoutY(19.0);
        btnQ4.setMnemonicParsing(false);
        btnQ4.setPrefHeight(31.0);
        btnQ4.setPrefWidth(107.0);
        btnQ4.setText("Play a Game");
        btnQ4.setFont(new Font(15.0));

        // setting the allignments to center
        vBox0.setAlignment(javafx.geometry.Pos.CENTER);
        vBox0.setSpacing(103.0);
        txtS1.setEditable(false);
        txtS1.setEffect(addTextEffect());
        txtS2.setEditable(false);
        txtS2.setEffect(addTextEffect());
        txtS3.setEditable(false);
        txtS3.setEffect(addTextEffect());
        txtS4.setEditable(false);
        txtS4.setEffect(addTextEffect());

        vBox1.setAlignment(javafx.geometry.Pos.CENTER);
        vBox1.setPrefHeight(466.0);
        vBox1.setPrefWidth(167.0);
        vBox1.setSpacing(127.0);
// setting the width and height
        pane3.setPrefHeight(130.0);
        pane3.setPrefWidth(150.0);

        line15.setEndX(80.80001831054688);
        line15.setLayoutX(87.4000244140625);
        line15.setLayoutY(65.0);
        line15.setStartX(-6.399993896484375);

        line16.setEndX(-99.50003051757812);
        line16.setEndY(101.5);
        line16.setLayoutX(200.0);
        line16.setLayoutY(27.0);
        line16.setStartX(-100.00003051757812);
        line16.setStartY(-26.199996948242188);

        line17.setEndX(100.0);
        line17.setStartX(10.199981689453125);

        line18.setEndX(100.0);
        line18.setLayoutY(129.0);
        line18.setStartX(10.199981689453125);
// creating the buttons and seting its location
        btaS1.setLayoutX(30.0);
        btaS1.setLayoutY(50.0);
        btaS1.setMnemonicParsing(false);
        btaS1.setPrefHeight(31.0);
        btaS1.setPrefWidth(107.0);
        btaS1.setText("Play a Game");
        btaS1.setFont(new Font(15.0));


        pane4.setPrefWidth(180.0);
// location of line
        line19.setEndX(80.80001831054688);
        line19.setEndY(0.1999664306640625);
        line19.setLayoutX(87.4000244140625);
        line19.setLayoutY(65.0);
        line19.setStartX(-6.399993896484375);

        line110.setEndX(-99.50003051757812);
        line110.setEndY(101.5);
        line110.setLayoutX(200.0);
        line110.setLayoutY(27.0);
        line110.setStartX(-100.00003051757812);
        line110.setStartY(-26.199996948242188);

        line111.setEndX(100.0);
        line111.setStartX(10.199981689453125);

        line112.setEndX(100.0);
        line112.setLayoutY(129.0);
        line112.setStartX(10.199981689453125);

        btnS2.setLayoutX(30.0);
        btnS2.setLayoutY(50.0);
        btnS2.setMnemonicParsing(false);
        btnS2.setPrefHeight(31.0);
        btnS2.setPrefWidth(107.0);
        btnS2.setText("Play a Game");
        btnS2.setFont(new Font(15.0));

        vBox2.setAlignment(javafx.geometry.Pos.CENTER);
        vBox2.setSpacing(231.0);

        txtF1.setEditable(false);
        txtF1.setEffect(addTextEffect());
        txtF2.setEditable(false);
        txtF2.setEffect(addTextEffect());

        vBox3.setAlignment(javafx.geometry.Pos.CENTER);
        vBox3.setPrefHeight(466.0);
        vBox3.setPrefWidth(174.0);

        pane5.setPrefHeight(258.0);
        pane5.setPrefWidth(159.0);

        line113.setEndX(80.80001831054688);
        line113.setLayoutX(105.4000244140625);
        line113.setLayoutY(128.0);
        line113.setStartX(-6.399993896484375);

        line114.setEndX(-99.49993896484375);
        line114.setEndY(228.49996948242188);
        line114.setLayoutX(200.0);
        line114.setLayoutY(27.0);
        line114.setStartX(-100.00003051757812);
        line114.setStartY(-26.199996948242188);

        line115.setEndX(100.0);
        line115.setStartX(10.199981689453125);

        line116.setEndX(100.0);
        line116.setLayoutY(256.0);
        line116.setStartX(10.199981689453125);

        btnF.setLayoutX(46.0);
        btnF.setLayoutY(113.0);
        btnF.setMnemonicParsing(false);
        btnF.setPrefHeight(31.0);
        btnF.setPrefWidth(107.0);
        btnF.setText("Play a Game");
        btnF.setFont(new Font(15.0));


        vBox4.setAlignment(javafx.geometry.Pos.CENTER);

        txtWinner.setEditable(false);

        dropShadow.setColor(javafx.scene.paint.Color.RED);
        txtWinner.setEffect(dropShadow);        // adding the drop shadow effect

        pane.getChildren().addAll(line,line0,line1,line2,btnQ1);        // wraping components in containers
        vBox.getChildren().add(pane);
        pane0.getChildren().addAll(line3,line4,line5,line6,btnQ2);
        vBox.getChildren().add(pane0);
        pane1.getChildren().addAll(line7,line8,line9,line10,btnQ3);
        vBox.getChildren().add(pane1);
        pane2.getChildren().addAll(line11,line12,line13,line14,btnQ4);
        vBox.getChildren().add(pane2);
        hBox.getChildren().add(vBox);
        vBox0.getChildren().addAll(txtS1,txtS2,txtS3,txtS4);
        hBox.getChildren().add(vBox0);
        pane3.getChildren().addAll(line15,line16,line17,line18,btaS1);
        vBox1.getChildren().add(pane3);
        pane4.getChildren().addAll(line19,line110,line111,line112,btnS2);
        vBox1.getChildren().add(pane4);
        hBox.getChildren().add(vBox1);
        vBox2.getChildren().addAll(txtF1,txtF2);
        hBox.getChildren().add(vBox2);
        pane5.getChildren().addAll(line113,line114,line115,line116,btnF);
        vBox3.getChildren().add(pane5);
        hBox.getChildren().add(vBox3);
        vBox4.getChildren().add(txtWinner);
        hBox.getChildren().add(vBox4);
        anchor.getChildren().add(hBox);

        btnQ1.setOnAction(e->{  // action method of Quarter final 1
            System.out.println("checking btn quarterfinal 1");
            GameSelector();         // calling the game selector method
            if(MainGUI.radioSelection.equals("Tennis")) {       // implementing the if statement according to Radio selection
                TennisGUI.lblN1.setText(MainGUI.txtName[1].getText());
                TennisGUI.lblN2.setText(MainGUI.txtName[2].getText());
            }
            else if(MainGUI.radioSelection.equals("Basketball")){
                BasketballGUI.lblN1.setText(MainGUI.txtName[1].getText());
                BasketballGUI.lblN2.setText(MainGUI.txtName[2].getText());
            }
            else if(MainGUI.radioSelection.equals("Soccer")){
                FootballGUI.lblN1.setText(MainGUI.txtName[1].getText());
                FootballGUI.lblN2.setText(MainGUI.txtName[2].getText());
            }
            currentMatch = "Q1";        // q1 to current match string
        });
        btnQ2.setOnAction(e->{
            GameSelector(); //action event for quarter 2
            currentMatch = "Q2";
            if(MainGUI.radioSelection.equals("Tennis")) {
                TennisGUI.lblN1.setText(MainGUI.txtName[3].getText());
                TennisGUI.lblN2.setText(MainGUI.txtName[4].getText());
            }
            else if(MainGUI.radioSelection.equals("Basketball")){
                BasketballGUI.lblN1.setText(MainGUI.txtName[3].getText());
                BasketballGUI.lblN2.setText(MainGUI.txtName[4].getText());
            }
            else if(MainGUI.radioSelection.equals("Soccer")){
                FootballGUI.lblN1.setText(MainGUI.txtName[3].getText());
                FootballGUI.lblN2.setText(MainGUI.txtName[4].getText());
            }
            System.out.println("checking btn quarterfinal 2");
        });
        btnQ3.setOnAction(e->{      //button for quarter final 3
            GameSelector();
            currentMatch = "Q3";
            if(MainGUI.radioSelection.equals("Tennis")) {
                TennisGUI.lblN1.setText(MainGUI.txtName[5].getText());
                TennisGUI.lblN2.setText(MainGUI.txtName[6].getText());
            }
            else if(MainGUI.radioSelection.equals("Basketball")){
                BasketballGUI.lblN1.setText(MainGUI.txtName[5].getText());
                BasketballGUI.lblN2.setText(MainGUI.txtName[6].getText());
            }
            else if(MainGUI.radioSelection.equals("Soccer")){
                FootballGUI.lblN1.setText(MainGUI.txtName[5].getText());
                FootballGUI.lblN2.setText(MainGUI.txtName[6].getText());
            }
            System.out.println("checking btn quarterfinal 3");
        });
        btnQ4.setOnAction(e->{  // button for quarter final 4
            GameSelector();
            currentMatch = "Q4";
            if(MainGUI.radioSelection.equals("Tennis")) {
                TennisGUI.lblN1.setText(MainGUI.txtName[7].getText());
                TennisGUI.lblN2.setText(MainGUI.txtName[8].getText());
            }
            else if(MainGUI.radioSelection.equals("Basketball")){
                BasketballGUI.lblN1.setText(MainGUI.txtName[7].getText());
                BasketballGUI.lblN2.setText(MainGUI.txtName[8].getText());
            }
            else if(MainGUI.radioSelection.equals("Soccer")){
                FootballGUI.lblN1.setText(MainGUI.txtName[7].getText());
                FootballGUI.lblN2.setText(MainGUI.txtName[8].getText());
            }
            System.out.println("checking btn quarterfinal 4");
        });
        btaS1.setOnAction(e->{      // semi final one button
            GameSelector();
            currentMatch = "S1";
            if(MainGUI.radioSelection.equals("Tennis")) {
                TennisGUI.lblN1.setText(txtS1.getText());
                TennisGUI.lblN2.setText(txtS2.getText());
            }else if(MainGUI.radioSelection.equals("Basketball")){
                BasketballGUI.lblN1.setText(txtS1.getText());
                BasketballGUI.lblN2.setText(txtS2.getText());
            }
            else if(MainGUI.radioSelection.equals("Soccer")){
                FootballGUI.lblN1.setText(txtS1.getText());
                FootballGUI.lblN2.setText(txtS2.getText());
            }
            System.out.println("checking btn Semifinal 1");
        });
        btnS2.setOnAction(e->{      // semi final 2 button
            GameSelector();
            currentMatch = "S2";
            if(MainGUI.radioSelection.equals("Tennis")) {
                TennisGUI.lblN1.setText(txtS3.getText());
                TennisGUI.lblN2.setText(txtS4.getText());
            }
            else if(MainGUI.radioSelection.equals("Basketball")){
                BasketballGUI.lblN1.setText(txtS3.getText());
                BasketballGUI.lblN2.setText(txtS4.getText());
            }
            else if(MainGUI.radioSelection.equals("Soccer")){
                FootballGUI.lblN1.setText(txtS3.getText());
                FootballGUI.lblN2.setText(txtS4.getText());
            }
            System.out.println("checking btn Semifinal 2");
        });
        btnF.setOnAction(e->{       // final button
            GameSelector();
            currentMatch = "F";
            if(MainGUI.radioSelection.equals("Tennis")) {
                TennisGUI.lblN1.setText(txtF1.getText());
                TennisGUI.lblN2.setText(txtF2.getText());
            }
            else if(MainGUI.radioSelection.equals("Basketball")){
                BasketballGUI.lblN1.setText(txtF1.getText());
                BasketballGUI.lblN2.setText(txtF2.getText());
            }
            else if(MainGUI.radioSelection.equals("Soccer")){
                FootballGUI.lblN1.setText(txtF1.getText());
                FootballGUI.lblN2.setText(txtF2.getText());
            }
            System.out.println("checking btn final ");
        });

    }
    private void GameSelector(){    // game selecetor method
        Stage p = new Stage();
        if(MainGUI.radioSelection.equals("Tennis")){
            new TennisGUI(p);   // new frame for tennis gui
        }
        if(MainGUI.radioSelection.equals("Basketball")){
            new BasketballGUI(p);
        }
        if(MainGUI.radioSelection.equals("Soccer")){
            new FootballGUI(p);
        }
    }
    private DropShadow addTextEffect() {

        DropShadow ds = new DropShadow();       // drp shadow effect
        ds.setSpread(0);
        ds.setWidth(21);
        ds.setHeight(21);
        ds.setRadius(10);
        ds.setBlurType(BlurType.THREE_PASS_BOX);
        ds.setColor(Color.BLUE);
        return ds;

    }
    static void moveToNext(){       // move to next method
        if(currentMatch.equals("Q1")){
            txtS1.setText(Game.getWinner());    // setting the text for winner
            s1++;
            btnQ1.setDisable(true);
        }
        if(currentMatch.equals("Q2")){
            txtS2.setText(Game.getWinner());     // setting the text for winner
            s1++;
            btnQ2.setDisable(true);
        }
        if(currentMatch.equals("Q3")){
            txtS3.setText(Game.getWinner());
            s2++;
            btnQ3.setDisable(true);
        }
        if(currentMatch.equals("Q4")){
            txtS4.setText(Game.getWinner());
            s2++;
            btnQ4.setDisable(true);
        }
        if(currentMatch.equals("S1")){
            txtF1.setText(Game.getWinner());
            f++;
            btaS1.setDisable(true);
        }
        if(currentMatch.equals("S2")){
            txtF2.setText(Game.getWinner());
            f++;
            btnS2.setDisable(true);
        }
        if(currentMatch.equals("F")){
            txtWinner.setText(Game.getWinner());
            btnF.setDisable(true);
        }
        enableButton();
    }
    public static void enableButton(){
        if(s1 == 2){        // enable next button
            btaS1.setDisable(false);
            s1 = 0;
        }
        if(s2 == 2){
            btnS2.setDisable(false);
            s2 = 0;
        }
        if(f == 2){
            btnF.setDisable(false);
            f = 0;
        }
    }
}
