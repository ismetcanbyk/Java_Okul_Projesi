package CopKutusu;

import CopToplama.CopToplama;

public class Sensor extends CopKutusu {

    private boolean doldu = false;

    

    int[] copKutusu = new int[30];

    public Sensor(Adres a) {
        a.insanSayisi();
        copKutusuOlustur(a);
    }

    public void verileriGoruntule() {

    }

    public void dolulukOraniHesapla() {
        int counter = 0;
        int counterKamyon = 0;

        for (int i = 0; i < getCopKutusuSayisi(); i++) {
            System.out.println((i+1)+".çöpün doluluğu : "+copKutusu[i]);

            if (copKutusu[i]>55) {
                counterKamyon++;
                if (counterKamyon >=3) {
                    copArabasiBelirle(counterKamyon);
                }
            }


            if(copKutusu[i]>90){
               
                doldu = true;
                counter++;
                copArabasiBelirle(counter);
                counter = 0;
                copKutusu[i]=0;
            }
        }

    }

    public void copArabasiBelirle(int i){
        if (i == 1) {
           System.out.println("Taksi");
        }
        if (i >= 3) {
            System.out.println("Kamyon");

        }
    }


    public int copKutusuSecme() {
        return (int) (Math.random() * getCopKutusuSayisi() );
    }

    @Override
    public void copKutulari() {
        for (int i = 1; i <= getCopKutusuSayisi(); i++) {
            copKutusu[i] = 0;
        }

    }

    @Override
    public void copAt(Adres a) {
            copKutulari();
        for (int i = 1; i <= a.getInsanSayisi()*5; i++) {
            int doluluk = (int) (Math.random() * 15 + 1);
            copKutusu[copKutusuSecme()] += doluluk;
            System.out.println("Çöp atıldı ");
            dolulukOraniHesapla();
            
        }
    }

}
