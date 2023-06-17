package com.example.grup6;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class hayırKontrol {
   static ArrayList<String> butondaKullanılacakHarf=new ArrayList<String>();
    public static ArrayList<String> hayırKontrol(){

        Random random =new Random();
        ArrayList<String> hayırPangramList=pangramList.pangramBulma();
        String[] alfabe = new String[]{"A","B","C","Ç","D","E","F","G","Ğ","H","I","İ","J","K","L","M","N","O","Ö","P","R","S","Ş","T","U","Ü","V","Y","Z"};
        ArrayList<String> secilenPangramKelime= new ArrayList<String>();
        ArrayList<String> alınan7Harf=new ArrayList<String>();

        int uzunluk = hayırPangramList.size();
        int secilenIndex;
        secilenIndex= ThreadLocalRandom.current().nextInt(0,uzunluk+1);
        secilenPangramKelime.add(hayırPangramList.get(secilenIndex));

        for (int i = 0; i <secilenPangramKelime.size(); i++) {
            for (int j = 0; j < alfabe.length; j++) {
                if (secilenPangramKelime.get(i).contains(alfabe[j])) {
                    alınan7Harf.add(alfabe[j]);
                    continue;
                } else
                    continue;
            }//for2 J
        }//for1 i

        int uzunlukAtanacak= alınan7Harf.size();
        int atanacakHarfIndex;

        int sayac=0;

        while (sayac!=7){

            atanacakHarfIndex =ThreadLocalRandom.current().nextInt(0,uzunlukAtanacak);
            butondaKullanılacakHarf.add(alınan7Harf.get(atanacakHarfIndex));
            alınan7Harf.remove(atanacakHarfIndex);
            sayac++;
            uzunlukAtanacak--;

        }
        return butondaKullanılacakHarf;
    }
}
