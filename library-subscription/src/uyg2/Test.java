package uyg2;

public class Test {
    
    public static void main(String[] args) {
        
        
        System.out.println(Kitap.isbnNedir());
        
        
        Kitap kitap1 = new Kitap("Kitap1","Yazar1","1234");
        Kitap kitap2 = new Kitap("Kitap2","Yazar2","1235");
        Kitap kitap3 = new Kitap("Kitap3","Yazar3","1236");
//        System.out.println(kitap1);
//        kitap1.setAd("Kitap2");
//        System.out.println(kitap1);
//        System.out.println(kitap1.isbnNedir());
//        System.out.println(Kitap.getkitapSayiyi());
        
//        Raf raf1 = new Raf(); //bu şekilde de raf nesnesini oluşturabilirdik ancak tasarım gereği kitaplık nesnesi içerisinde oluşturulmasını istedik.
//        raf1.kitapEkle(kitap1);
//        raf1.kitapEkle(kitap2);
//        raf1.kitapEkle(kitap3);
//        raf1.rafGoster();
//        raf1.kitapSil(1);
//        raf1.kitapSil(kitap3);
//        raf1.rafGoster();
        Kitap kitap4 = new Kitap("Kitap4","Yazar4","1237");
        Kitap kitap5 = new Kitap("Kitap5","Yazar5","1238");
        Kitap kitap6 = new Kitap("Kitap6","Yazar6","1239");
        
        Kitapl�k kitapl�k = new Kitapl�k(5);
        
        kitapl�k.kitapEkle(kitap3, 0);
        kitapl�k.kitapEkle(kitap1, 0);
        kitapl�k.kitapEkle(kitap2, 0);
        
        kitapl�k.kitapEkle(kitap4, 1);
        kitapl�k.kitapEkle(kitap5, 1);
        kitapl�k.kitapEkle(kitap6, 2);


        
        
//        kitaplık.tumRaflariGoster();
        
//        kitaplık.kitapSil(0, kitap1);
//        kitaplık.kitapSil(1, 1);
        
        kitapl�k.tumRaflariGoster();
        
        System.out.println("----- Uyg2 -----");

        kitapl�k.kitapEkle(kitap3, 0);
        kitapl�k.kitapEkle(kitap1, 0);
        kitapl�k.kitapEkle(kitap2, 0);
        
        kitapl�k.kitapEkle(kitap4, 1);
        kitapl�k.kitapEkle(kitap5, 1);
        kitapl�k.kitapEkle(kitap6, 2);
        
        
        
        Kitapl�kYonetim kitapl�kYonetim = new Kitapl�kYonetim(kitapl�k);
        
     
        
        Kart kart1 = new OgrenciKart�(0,"Ali",50);
//        OgrenciKartı kart1 = new OgrenciKartı(0,"Ali",50);
        
        
        Kart kart2 = new YetiskinKart�(1,"Ayşe",50);
//        YetiskinKartı kart2 = new YetiskinKartı(1,"Ayşe",50);
      
        
        System.out.println(kart1);
        System.out.println(kart2);
    
        
        kitapl�kYonetim.kitapSat(kitap1, kart1);
        kitapl�kYonetim.kitapSat(kitap2, kart1);
        kitapl�kYonetim.kitapSat(kitap3, kart1);
        kitapl�kYonetim.kitapSat(kitap4, kart1);
        kitapl�kYonetim.kitapSat(kitap5, kart1);
        System.out.println(kart1);
        kitapl�kYonetim.kitapSat(kitap6, kart1);
        System.out.println(kart1);
        
        System.out.println("********************");
        
        kitapl�kYonetim.kitapSat(kitap1, kart2);
        kitapl�kYonetim.kitapSat(kitap2, kart2);
        kitapl�kYonetim.kitapSat(kitap3, kart2);
        kitapl�kYonetim.kitapSat(kitap4, kart2);
        kitapl�kYonetim.kitapSat(kitap5, kart2);
        System.out.println(kart2);
        kitapl�kYonetim.kitapSat(kitap6, kart2);

        //kitaplık.tumRaflariGoster();

        


    }
    
}
