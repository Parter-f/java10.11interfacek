package hu.petrik.Orai1004;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<Kolcsonozheto> katalogus;
    static List<Dvd> dvdk = new ArrayList<>();

    public static void main(String[] args) {


        Konyv konyv1 = new Konyv("A Gyűrük Ura" , "J.R.R Tolkien" , "AABBCC-121314");
        Dvd dvd1 = new Dvd("Star Wars V. rész - a Briodalom visszavág" , 124);
        Dvd dvd2 = new Dvd("Star Wars IV. rész - Egy új remény" , 121);
        Dvd dvd3 = new Dvd("Star Wars VI. rész - a Briodalom visszavág" , 131);
        Dvd dvd4 = new Dvd("A gyűrűk Ura - A gyűrű szövetsége" , 178);
        Dvd dvd5 = new Dvd("A gyűrűk Ura - A király visszatér" , 201);
        Dvd dvd6 = new Dvd("A gyűrűk Ura - A két torony" , 179);
        Ujsag ujsag1 = new Ujsag("Képes Sport" , 2007 , 23);


        System.out.println(konyv1.getIsbn());
        System.out.println(konyv1.megjelenitendoNev());

        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(ujsag1);
        katalogus.add(dvd4);
        katalogus.add(dvd5);
        katalogus.add(dvd6);


        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd6);
        dvdk.add(dvd5);


        for (Kolcsonozheto k : katalogus) {
            System.out.println(k.megjelenitendoNev() + " " + k.meddigKolcsonozheto());
        }
        Collections.sort(dvdk);
        for(Dvd d : dvdk){
            System.out.println(d.megjelenitendoNev() + " " + d.meddigKolcsonozheto());
        }

        System.out.println();
    }
}
