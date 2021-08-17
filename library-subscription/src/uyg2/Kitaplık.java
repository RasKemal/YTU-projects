package uyg2;

public class Kitapl�k {
    
    private Raf[] raf;

    public Kitapl�k(int n) {
        this.raf = new Raf[n];
        for (int i = 0; i < raf.length; i++){
            raf[i] = new Raf();
        }
    }
    
    public void kitapEkle(Kitap k, int RafNo){
        raf[RafNo].kitapEkle(k);
    }
    public void kitapSil(int RafNo, int S�raNo){
        raf[RafNo].kitapSil(S�raNo);
    }
    public void kitapSil(int RafNo, Kitap k){
        raf[RafNo].kitapSil(k);
    }
    public void rafGoster(int n){
        raf[n].rafGoster();
    }
    public void tumRaflariGoster(){
        for (int i = 0; i < raf.length; i++){
            System.out.println(i + ". Raftaki Kitaplar");
            rafGoster(i);
        }
    }
    public int kitapAra(String KitapAd�){
        int n = raf.length;
        for (int i = 0; i < n; i++){
            for(Kitap kitap: raf[i].getKitaplar()){
                if(kitap != null && kitap.getAd().equals(KitapAd�))
                {
                    System.out.println("Aranan kitap " + i + ". rafta bulunuyor.");
                    return i;
                }                    
            }
        }
        System.out.println("Kitap Yok");
        return -1;
    }
    

    
    
    
}
