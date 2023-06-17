package com.example.grup6;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

//Evete basılınca açılan konum
public class kullanıcıdanHarfAlma  {

    Stage stageHarfAlma = new Stage();
    Label lblH1 = new Label("1.Harf: ");
    Label lblH2 = new Label("2.Harf: ");
    Label lblH3 = new Label("3.Harf: ");
    Label lblH4 = new Label("4.Harf(Ortanca): ");
    Label lblH5 = new Label("5.Harf: ");
    Label lblH6 = new Label("6.Harf: ");
    Label lblH7 = new Label("7.Harf: ");
    static TextField textField1 = new TextField();
    static TextField textField2 = new TextField();
    static TextField textField3 = new TextField();
    static TextField textField4 = new TextField();
    static TextField textField5 = new TextField();
    static TextField textField6 = new TextField();
    static TextField textField7 = new TextField();
    Button btnDevam = new Button("Devam");

    public void kuHarfAlma() {

        VBox vBox = new VBox(7, lblH1, lblH2, lblH3, lblH4, lblH5, lblH6, lblH7);
        vBox.setPadding(new Insets(20, 30, 20, 30));
        vBox.setSpacing(50);


        VBox vBox1 = new VBox(7, textField1, textField2, textField3, textField4, textField5, textField6, textField7);
        vBox1.setPadding(new Insets(20, 30, 20, 30));
        vBox1.setSpacing(25);

        VBox vBoxDevam = new VBox(7, btnDevam);
        vBoxDevam.setPadding(new Insets(250, 40, 40, 10));
        vBoxDevam.setSpacing(30);

        HBox hBox = new HBox();
        hBox.getChildren().addAll(vBox, vBox1, vBoxDevam);
        hBox.setSpacing(15);
        hBox.setAlignment(Pos.CENTER);

        hBox.setBackground(Background.EMPTY);
        hBox.setBackground(new Background(new BackgroundFill(Color.PINK, null, null)));

        Scene scene = new Scene(hBox, 770, 600);
        stageHarfAlma.setScene(scene);
        stageHarfAlma.setTitle("Kullanıcıdan Harf Alma");
        stageHarfAlma.show();

                                                            //Devam Butonuna Bastığın kontrol yapıldığı yerin BAŞLANGICI
        evetKontrol kontrol=new evetKontrol();
        oyunYeri oyunYeri= new oyunYeri();
        btnDevam.setOnAction((ActionEvent Devamm) -> {
            try {
                kontrol.kontrolHarf();
                if (kontrol.kacKelime==true){
                    stageHarfAlma.close();
                    oyunYeri.evetOyun();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });
                                                              //Devam Butonuna Bastığın kontrol yapıldığı yerin BİTİŞİ
//--------------------------------------------------------------------------------------------------------------------
                                                                                                    //DÜZEN
        textField1.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        textField1.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
        textField2.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        textField2.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
        textField3.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        textField3.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
        textField4.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        textField4.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
        textField5.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        textField5.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
        textField6.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        textField6.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
        textField7.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        textField7.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));


        lblH1.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));
        lblH2.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));
        lblH3.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));
        lblH4.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));
        lblH5.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));
        lblH6.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));
        lblH7.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));

        btnDevam.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btnDevam.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
    }
}

