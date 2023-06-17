package com.example.grup6;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class oyunYeri extends kullanıcıdanHarfAlma {
   // implements IhayırKontrol
    static hayırKontrol hayırKontrol = new hayırKontrol() ;

    static Button btn1 = new Button("S");
    static Button btn2 = new Button("P");
    static Button btn3 = new Button("E");
    static Button btn4 = new Button("L");
    static Button btn5 = new Button("İ");
    static Button btn6 = new Button("N");
    static Button btn7 = new Button("G");
    static ArrayList<String> bulunanKelime = new ArrayList<String>();
    static int sayacEkle = 0;
    static int puan=0;

    public static void oyunKonsol() throws Exception{

        File sozluk = new File("TurkishWords.txt");
        ArrayList<String> sozlukListesi = new ArrayList<String>();

        try {
            Scanner sc = new Scanner(sozluk);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().toUpperCase(Locale.forLanguageTag("tr_TR"));
                sozlukListesi.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Stage stage=new Stage();
                                                                                              //ÇİÇEĞİMİZ Başlanıç
//----------------------------------------------------------------------------------------------------------------------
                                                                                    //Buton Görsel Başlangıç
        btn1.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btn1.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,24));

        btn1.setMaxSize(100,100);
        btn1.setPrefSize(100,100);
        btn1.setShape(new Circle(35));

        btn2.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btn2.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,24));

        btn2.setMaxSize(100,100);
        btn2.setPrefSize(100,100);
        btn2.setShape(new Circle(35));

        btn3.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btn3.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,24));

        btn3.setMaxSize(100,100);
        btn3.setPrefSize(100,100);
        btn3.setShape(new Circle(35));

        btn4.setStyle("-fx-border-color:purple ;"+"-fx-background-color: yellow;");
        btn4.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,24));

        btn4.setMaxSize(100,100);
        btn4.setPrefSize(100,100);
        btn4.setShape(new Circle(35));

        btn5.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btn5.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,24));

        btn5.setMaxSize(100,100);
        btn5.setPrefSize(100,100);
        btn5.setShape(new Circle(35));

        btn6.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btn6.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,24));

        btn6.setMaxSize(100,100);
        btn6.setPrefSize(100,100);
        btn6.setShape(new Circle(35));

        btn7.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");
        btn7.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,24));

        btn7.setMaxSize(100,100);
        btn7.setPrefSize(100,100);
        btn7.setShape(new Circle(35));

        VBox vBox1=new VBox(3,btn1,btn2);
        vBox1.setPadding(new Insets(120,15,50,10));
        vBox1.setSpacing(10);

        VBox vBox2=new VBox(3,btn3,btn4,btn5);
        vBox2.setPadding(new Insets(50,1,5,1));
        vBox2.setSpacing(10);

        VBox vBox3=new VBox(2,btn6,btn7);
        vBox3.setPadding(new Insets(120,15,50,10));
        vBox3.setSpacing(10);

        HBox hBox=new HBox();
        hBox.getChildren().addAll(vBox1,vBox2,vBox3);
        hBox.setSpacing(3);
        hBox.setAlignment(Pos.CENTER);
                                                                                             //Buton Görsel Bitiş
                                                                                                  // ÇİÇEĞİMİZ Bitiş
//----------------------------------------------------------------------------------------------------------------------
                                                                          //3'lü buton Ekle Sil Karıştır Başlanıç
        Button btnsil = new Button("Sil");
        Button btnmix = new Button("Karıştır");
        Button btnekle = new Button("Ekle");

        btnsil.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        btnsil.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
        btnmix.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        btnmix.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));
        btnekle.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        btnekle.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));

        btnsil.setMaxSize(100,50);
        btnsil.setPrefSize(100,50);
        btnmix.setMaxSize(100,50);
        btnmix.setPrefSize(100,50);
        btnekle.setMaxSize(100,50);
        btnekle.setPrefSize(100,50);

        HBox hBoxUcluButon = new HBox(3,btnsil,btnmix,btnekle);
        hBoxUcluButon.setSpacing(10);
        hBoxUcluButon.setPadding(new Insets(10,10,10,20));
        hBoxUcluButon.setAlignment(Pos.CENTER);
                                                                                //3'lü Buton Ekle Sil Karıştır BİTİŞ
//----------------------------------------------------------------------------------------------------------------------
                                                                               //Butona basılınca girilen yer Başlangıç
        TextField textFieldGirilen=new TextField();
        textFieldGirilen.setMaxSize(380,50);
        textFieldGirilen.setPrefSize(380,50);
        textFieldGirilen.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        textFieldGirilen.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));

        HBox hBtextFieldGirilen1=new HBox(textFieldGirilen);
        hBtextFieldGirilen1.setSpacing(10);
        hBtextFieldGirilen1.setPadding(new Insets(100,50,0,30));
        hBtextFieldGirilen1.setAlignment(Pos.CENTER);
                                                                                 //Butona basılınca girilen yer Bitiş
//---------------------------------------------------------------------------------------------------------------------
                                                                                    //Yukarı Tarafın Birleşimi Başlangıç
        VBox vBoxgenel = new VBox();
        vBoxgenel.getChildren().addAll(hBtextFieldGirilen1,hBox,hBoxUcluButon);
        vBoxgenel.setSpacing(3);
                                                                                    //Yukarı Tarafın Birleşimi Bitiş
//----------------------------------------------------------------------------------------------------------------------
                                                                             //Liste TExtField Ve Kapat Tuşu Başlangıç
        ListView kelimeListView = new ListView();
        kelimeListView.setMaxSize(250,400);
        kelimeListView.setPrefSize(250,400);
        kelimeListView.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #c9a0dc;");

        Button btnKapat=new Button("Kapat");

        btnKapat.setStyle("-fx-border-color:purple ;"+"-fx-background-color: #ccccff;");
        btnKapat.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,20));

        btnKapat.setMaxSize(100,50);
        btnKapat.setPrefSize(100,50);

        VBox vBoxKelimeList=new VBox(kelimeListView,btnKapat);
        vBoxKelimeList.setSpacing(10);
        vBoxKelimeList.setPadding(new Insets(10,10,10,10));
        vBoxKelimeList.setAlignment(Pos.CENTER);
                                                                                 //Liste TExtField Ve Kapat Tuşu Bitiş
//---------------------------------------------------------------------------------------------------------------------
                                                                                                     //Puan Başlangıç
        Label labelPuan = new Label("Puan");
        labelPuan.setMaxSize(80, 20);
        labelPuan.setPrefSize(50, 50);

        Label lblPuan = new Label();
        lblPuan.setMaxSize(80, 20);
        lblPuan.setPrefSize(50, 50);
        lblPuan.setText(String.valueOf(0));

        lblPuan.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));
        labelPuan.setFont(Font.font("Lucida Sans Unicode", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC,15));

        VBox vBoxPuan = new VBox(labelPuan, lblPuan);
        vBoxPuan.setPadding(new Insets(0,1,180,2));
        vBoxPuan.setSpacing(10);
        vBoxPuan.setAlignment(Pos.CENTER);
                                                                                                         // Puan Bitiş
//---------------------------------------------------------------------------------------------------------------------
                                                                                        //Bütün görüntü birleşim yeri
        HBox hBoxGenel=new HBox();
        hBoxGenel.getChildren().addAll(vBoxPuan,vBoxgenel,vBoxKelimeList);
        hBoxGenel.setAlignment(Pos.CENTER);

        hBoxGenel.setBackground(Background.EMPTY);
        hBoxGenel.setBackground(new Background(new BackgroundFill(Color.PINK, null, null)));

        Scene scene=new Scene(hBoxGenel,770,600);
        stage.setScene(scene);
        stage.setTitle("Spelling Flower");
        stage.show();
//---------------------------------------------------------------------------------------------------------------------
                                                                                  //Çiçeğin Buton Kelime Yazma Başlangıç
        btn1.setOnAction((ActionEvent)->{
            try {
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn1.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(keyE -> {
            if (keyE.getCode()==KeyCode.getKeyCode(btn1.getText())){
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn1.getText()));
            }
        }));
        btn2.setOnAction((ActionEvent)->{
            try {
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn2.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(keyE -> {
            if (keyE.getCode()== KeyCode.getKeyCode(btn2.getText())){
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn2.getText()));
            }
        }));
        btn3.setOnAction((ActionEvent)->{
            try {
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn3.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(keyE -> {
            if (keyE.getCode()== KeyCode.getKeyCode(btn3.getText())){
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn3.getText()));
            }
        }));
        btn4.setOnAction((ActionEvent)->{
            try {
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn4.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(keyE -> {
            if (keyE.getCode()== KeyCode.getKeyCode(btn4.getText())){
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn4.getText()));
            }
        }));
        btn5.setOnAction((ActionEvent)->{
            try {
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn5.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(keyE -> {
            if (keyE.getCode()== KeyCode.getKeyCode(btn5.getText())){
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn5.getText()));
            }
        }));
        btn6.setOnAction((ActionEvent)->{
            try {
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn6.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(keyE -> {
            if (keyE.getCode()== KeyCode.getKeyCode(btn6.getText())){
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn6.getText()));
            }
        }));
        btn7.setOnAction((ActionEvent)->{
            try {
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn7.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(keyE -> {
            if (keyE.getCode()== KeyCode.getKeyCode(btn7.getText())){
                String atama=textFieldGirilen.getText();
                textFieldGirilen.setText(atama+(btn7.getText()));
            }
        }));
                                                                                 //Çiçeğin Buton Kelime Yazma Bitiş
//---------------------------------------------------------------------------------------------------------------------
                                                                                    //Buton Ekle Başlangıç
        btnekle.setOnAction((ActionEvent) -> {
            try {

                if ((textFieldGirilen.getText().length() >= 3) && (sozlukListesi.contains(textFieldGirilen.getText()))
                        && (textFieldGirilen.getText().contains(btn4.getText()) && (bulunanKelime.contains(textFieldGirilen.getText()) == false))) {
                    bulunanKelime.add(textFieldGirilen.getText());
                    kelimeListView.getItems().add(bulunanKelime.get(sayacEkle));
                    sayacEkle++;
                    if (pangramList.pangramkelimeListesiArray.contains(textFieldGirilen.getText())){
                        puan= (textFieldGirilen.getText().length() - 2) + 7+ puan ;

                        lblPuan.setText( String.valueOf(puan));
                    }
                    else {
                        puan = (textFieldGirilen.getText().length() - 2) + puan;
                        lblPuan.setText(String.valueOf(puan));
                    }
                }
                textFieldGirilen.setText("");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED, (keyE -> {
            if (keyE.getCode() == KeyCode.ENTER) {
                if ((textFieldGirilen.getText().length() >= 3) && (sozlukListesi.contains(textFieldGirilen.getText())) &&
                        (textFieldGirilen.getText().contains(btn4.getText()) && (bulunanKelime.contains(textFieldGirilen.getText()) == false))) {
                    bulunanKelime.add(textFieldGirilen.getText());
                    kelimeListView.getItems().add(bulunanKelime.get(sayacEkle));
                    System.out.println("yaz " + textFieldGirilen.getText());
                    sayacEkle++;
                }
            }
        }));
                                                                                            //Buton Ekle Bitiş
//----------------------------------------------------------------------------------------------------------------------
                                                                                        //Buton Karıştır Başlangıç
        btnmix.setOnAction((ActionEvent) -> {
            try {

                ArrayList<String> karistirBtn = new ArrayList<>();
                karistirBtn.add(btn1.getText());
                karistirBtn.add(btn2.getText());
                karistirBtn.add(btn3.getText());
                karistirBtn.add(btn5.getText());
                karistirBtn.add(btn6.getText());
                karistirBtn.add(btn7.getText());

                Collections.shuffle(karistirBtn);
                btn1.setText(karistirBtn.get(0));
                btn2.setText(karistirBtn.get(1));
                btn3.setText(karistirBtn.get(2));
                btn5.setText(karistirBtn.get(3));
                btn6.setText(karistirBtn.get(4));
                btn7.setText(karistirBtn.get(5));

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
                                                                                             //Buton Karıştır Bitiş
//----------------------------------------------------------------------------------------------------------------------
                                                                                                 //Silme Butonu
        btnsil.setOnAction((ActionEvent)->{
            try {
                if (textFieldGirilen!=null)
                {textFieldGirilen.setText(textFieldGirilen.getText().substring(0,textFieldGirilen.getText().length()-1));}

            } catch (Exception e) {
                System.out.println(e);
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(key -> {
            if ((key.getCode()== KeyCode.BACK_SPACE) && (textFieldGirilen!=null)){
                textFieldGirilen.setText(textFieldGirilen.getText().substring(0,textFieldGirilen.getText().length()-1));
            }


        }));
                                                                                //Silme Buton or Key Bitiş
//---------------------------------------------------------------------------------------------------------------------
                                                                                                //Kapat Butonu
        btnKapat.setOnAction((ActionEvent)->{
            try {
                stage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        scene.addEventHandler(KeyEvent.KEY_PRESSED,(keyE -> {
            if (keyE.getCode()== KeyCode.ESCAPE){
                stage.close();
            }
        }));
                                                                                                //Kapat Butonu Bitiş
//----------------------------------------------------------------------------------------------------------------------


    }

    public static void evetOyun(){
        try {
            btn1= new Button(textField1.getText().toUpperCase());
            btn2= new Button(textField2.getText().toUpperCase());
            btn3= new Button(textField3.getText().toUpperCase());
            btn4= new Button(textField4.getText().toUpperCase());
            btn5= new Button(textField5.getText().toUpperCase());
            btn6= new Button(textField6.getText().toUpperCase());
            btn7= new Button(textField7.getText().toUpperCase());
            oyunKonsol();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//Evet Bitiş

    public static void hayırOyun(){
        try {
            btn1= new Button(hayırKontrol.hayırKontrol().get(0));
            btn2= new Button(hayırKontrol.hayırKontrol().get(1));
            btn3= new Button(hayırKontrol.hayırKontrol().get(2));
            btn4= new Button(hayırKontrol.hayırKontrol().get(3));
            btn5= new Button(hayırKontrol.hayırKontrol().get(4));
            btn6= new Button(hayırKontrol.hayırKontrol().get(5));
            btn7= new Button(hayırKontrol.hayırKontrol().get(6));
            oyunKonsol();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//Hayır Bitiş
}
