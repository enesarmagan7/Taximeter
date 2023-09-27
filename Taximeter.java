package Letcode;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        //Taksimetre açılış ücreti 10 Tl
        double taxiMeter=10;
        int kiloMeter;
        //Taksi gidiş mesafesi
        Scanner sc=new Scanner(System.in);

        System.out.println("Taksimetre kaç km");
       kiloMeter=sc.nextInt();
       //Taksimetre KM başına 2.20 TL tutmaktadır.
      //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacak.
        taxiMeter+=kiloMeter*2.20;
       taxiMeter=taxiMeter<20? 20:taxiMeter;
       System.out.println("Taksimetre tutarı: "+ taxiMeter+"TL");
    }
}
