package com.example.grup6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;


public class play extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label lbl = new Label("SPELLİNG FLOWER OYUNUMUZA HOŞGELDİNİZ");
        lbl.setFont(Font.font("Darbe", FontWeight.BOLD, FontPosture.REGULAR,20));
        lbl.setTextFill(Color.web("#BF00FF"));

        Button btnP = new Button("PLAY");
        btnP.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btnP.setFont(Font.font("Lucida Sans Unicode",FontWeight.BLACK,FontPosture.ITALIC,24));
        btnP.setMaxSize(200,200);
        btnP.setPrefSize(100,100);

        VBox box = new VBox(10,lbl,btnP);
        box.setPadding(new Insets(50,50,50,50));
        box.setSpacing(20);
        box.setAlignment(Pos.CENTER);

        box.setBackground(Background.EMPTY);
        box.setBackground(new Background(new BackgroundFill(Color.PINK, null, null)));
        Scene scene =new Scene(box,770,600);

        stage.setScene(scene);
        stage.setTitle("Spelling Flower");
        stage.show();

                                                        //2.Form Başlangıç
        options opGetirme=new options();
        btnP.setOnAction((ActionEvent options) -> {
            try {
                stage.close();
                opGetirme.optionsFormOluşturma();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
                                                         //2.Form Bitiş
    }
}
