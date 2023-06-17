package com.example.grup6;

import javax.swing.*;
import java.util.ArrayList;

public class evetKontrol extends kullanıcıdanHarfAlma{
    public static boolean kacKelime = false;
    public static void kontrolHarf() {
        ArrayList<String> harfKontrolListesi = new ArrayList<>();
        ArrayList<String> yeniPangramListesi = pangramList.pangramBulma();

        int sayacKontrol1 = 0;
        int sayacKontrol2 = 0;
        int sayacKontrol3 = 0;
        int sayacKontrolAynımı = 0;

        harfKontrolListesi.add(textField1.getText().toUpperCase());
        harfKontrolListesi.add(textField2.getText().toUpperCase());
        harfKontrolListesi.add(textField3.getText().toUpperCase());
        harfKontrolListesi.add(textField4.getText().toUpperCase());
        harfKontrolListesi.add(textField5.getText().toUpperCase());
        harfKontrolListesi.add(textField6.getText().toUpperCase());
        harfKontrolListesi.add(textField7.getText().toUpperCase());


        //kontorol harf mi ve karakter sayısı BAŞLANGIÇ
        for (int i = 0; i < harfKontrolListesi.size(); i++) {
            int karaterSayisi = harfKontrolListesi.get(i).length();
            char karakterHarfmi = harfKontrolListesi.get(i).charAt(0);

            if ((karaterSayisi == 1) && (Character.isLetter(karakterHarfmi))) {
                sayacKontrol1++;
            } else {
                JOptionPane.showMessageDialog(null, "Birden fazla harf ya da Harf olmayan sembol girdiniz");
                break;
            }
        }
                                                                            //kontorol harf mi ve karakter sayısı Bitiş
//----------------------------------------------------------------------------------------------------------------------
                                                                            //aynı harf var mı yok mu kontrol Başlangıç
        for (int x = 0; x < harfKontrolListesi.size(); x++) {
            for (int y = 0; y < harfKontrolListesi.size(); y++) {
                if (harfKontrolListesi.get(x).charAt(0) != harfKontrolListesi.get(y).charAt(0)) {
                    sayacKontrol3++;
                }
            }
            if (sayacKontrol3 < 6) {
                JOptionPane.showMessageDialog(null, "Lütfen farklı harfler giriniz");
                break;
            } else {
                sayacKontrolAynımı++;
                sayacKontrol3=0;
                continue;
            }
        }
                                                                                //aynı harf var mı yok mu kontrol Bitiş
//----------------------------------------------------------------------------------------------------------------------
                                                                 //Pangram sözlükten pangram var  mı kontrolü BAŞLANGIÇ
        if ((sayacKontrol1 == 7) && (sayacKontrolAynımı == 7)) { //7 tane girdi mi?
            for (int k = 0; k < yeniPangramListesi.size(); k++) {
                for (int j = 0; j < harfKontrolListesi.size(); j++) {
                    if (yeniPangramListesi.get(k).contains(harfKontrolListesi.get(j))) {
                        sayacKontrol2++;
                        continue;
                    } else {
                        sayacKontrol2 = 0;
                        break;
                    }
                }
                if (sayacKontrol2 == 7) {
                    kacKelime = true;
                    break;
                }
            }
        }
                                                                 //Pangram sözlükten pangram var  mı kontrolü Bitiş
//---------------------------------------------------------------------------------------------------------------------
    }
}
