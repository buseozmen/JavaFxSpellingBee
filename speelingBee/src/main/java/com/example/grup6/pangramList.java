package com.example.grup6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class pangramList {
    static ArrayList<String> pangramKelimeListesi = new ArrayList<String>();
    static java.util.ArrayList pangramkelimeListesiArray=pangramKelimeListesi;

    public static ArrayList pangramBulma() {
        File sozluk = new File("TurkishWords.txt");
        String[] alfabe = new String[]{"A","B","C","Ç","D","E","F","G","Ğ","H","I","İ","J","K","L","M","N","O","Ö","P","R","S","Ş","T","U","Ü","V","Y","Z"};
        //Sözlüğü array listeye ekleme
        try {
            Scanner sc = new Scanner(sozluk);
            ArrayList<String> sozlukListesi = new ArrayList<String>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine().toUpperCase();
                sozlukListesi.add(line);
            }
            //--------------------------------------------------------------------------------------------------------
            //Sözlükteki Pangram Kelimeleri Bulma
            int sayac = 0;
            for (int i = 0; i < sozlukListesi.size(); i++) {
                for (int j = 0; j < alfabe.length; j++) {
                    if (sozlukListesi.get(i).contains(alfabe[j])) {
                        sayac++;
                        continue;
                    } else
                        continue;
                }//for2 J
                if (sayac == 7) {
                    pangramKelimeListesi.add(sozlukListesi.get(i));
                    sayac = 0;
                    continue;
                } else {
                    sayac = 0;
                    continue;
                }
            }//for1 i
            //-----------------------------------------------------------------------------------------------------------
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }//catch
        return pangramkelimeListesiArray;
    }
}
