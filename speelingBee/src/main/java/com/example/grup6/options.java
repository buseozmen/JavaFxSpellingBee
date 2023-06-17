package com.example.grup6;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class options {
    public  void optionsFormOluşturma() {

        Stage stageOpt=new Stage();
                                                                                            // Görsel Alan Başlangıç
//---------------------------------------------------------------------------------------------------------------------
        Label lblOpt=new Label("OYUNDA Kİ HARFLERİ KENDİNİZ Mİ SEÇMEK İSTERSİNİZ? ");
        lblOpt.setFont(Font.font("Darbe", FontWeight.BOLD, FontPosture.REGULAR,20));
        lblOpt.setTextFill(Color.web("#BF00FF"));

        Button btnEvet=new Button("Evet");
        Button btnHayir=new Button("Hayır");

        btnEvet.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btnEvet.setFont(Font.font("Lucida Sans Unicode", FontWeight.BLACK, FontPosture.ITALIC,24));
        btnHayir.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btnHayir.setFont(Font.font("Lucida Sans Unicode",FontWeight.BLACK,FontPosture.ITALIC,24));

        btnEvet.setMaxSize(200,200);
        btnEvet.setPrefSize(100,100);
        btnHayir.setMaxSize(200,200);
        btnHayir.setPrefSize(100,100);


        VBox boxOpt = new VBox(lblOpt,btnEvet,btnHayir);
        boxOpt.setPadding(new Insets(50,50,50,50));
        boxOpt.setSpacing(20);
        boxOpt.setAlignment(Pos.CENTER);

        boxOpt.setBackground(Background.EMPTY);
        boxOpt.setBackground(new Background(new BackgroundFill(Color.PINK, null, null)));

        Scene sceneOpt=new Scene(boxOpt, 770, 600);
        stageOpt.setScene(sceneOpt);
        stageOpt.setTitle("Options");
        stageOpt.show();
                                                                                         // Görsel Alan Bitiş

                                                                                         //Evet Buton Formu başlangıç
//----------------------------------------------------------------------------------------------------------------------
        kullanıcıdanHarfAlma kullanıcıdanHarfAlma= new kullanıcıdanHarfAlma();
        btnEvet.setOnAction((ActionEvent evetOptions) -> {
            try {
                stageOpt.close();
                kullanıcıdanHarfAlma.kuHarfAlma();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
                                                                                         //Evet Buton Formu bitiş
//---------------------------------------------------------------------------------------------------------------------
                                                                                      //Hayır Buton Formu Başlangıç
        oyunYeri oyunHayır=new oyunYeri();
        btnHayir.setOnAction((ActionEvent hayırOptions)->{
            try {
                stageOpt.close();
                oyunHayır.hayırOyun();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        });
                                                                                             //Hayır Buton Formu Bitiş
//----------------------------------------------------------------------------------------------------------------------
    }
}
