package uyg2;

public class Kitapl�kYonetim {
    
    private Kitapl�k kitapl�k;

    public Kitapl�kYonetim(Kitapl�k kitapl�k) {
        this.kitapl�k = kitapl�k;
    }
    
    public boolean kitapSat(Kitap ktp, Kart krt){
        int rafNo = kitapl�k.kitapAra(ktp.getAd());
        
        if(rafNo == -1){
            System.out.println("Kitap Yok.");
            return false;
        }
        
        else if (krt.odemeYap(ktp.getFiyat())){            
            System.out.println("Satış Gerçekleşti.");
            kitapl�k.kitapSil(rafNo,ktp);
            return true;
        }
        
        else{            
            System.out.println("Bakiye Yetersiz.");
            return false;
        }
        
    }    
    
    
}
