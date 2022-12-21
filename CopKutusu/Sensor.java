package CopKutusu;

import CopToplama.CopKamyonu;
import CopToplama.CopTaksi;


public class Sensor extends CopKutusu implements Runnable {

    private boolean doldu = false;
    CopTaksi taksi = new CopTaksi();
    CopKamyonu kamyon = new CopKamyonu();
    int[] copKutusu = new int[30];
    int[] dupCop = new int[15];

    public Sensor(Adres a) {
        a.insanSayisi();
        copKutusuOlustur(a);
    }

    public void verileriGoruntule() {

    }
    


    public void copArabasiBelirle(int i) {
        if (i == 1) {
            taksi.copArabasiBilgi(); 
        }
        if (i >= 3) {
           kamyon.copArabasiBilgi();
        }

    }

    public int copKutusuSecme() {
        return (int) (Math.random() * getCopKutusuSayisi());
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
        for (int i = 1; i <= a.getInsanSayisi() * 5; i++) {
            int doluluk = (int) (Math.random() * 15 + 1);
            copKutusu[copKutusuSecme()] += doluluk;
            System.out.println("Çöp atılıyor ");
            run();

        }
    }

    @Override
    public void run() {
        try {
            int counter = 0;
            int counterKamyon = 0;

            for (int i = 0; i < getCopKutusuSayisi(); i++) {
                System.out.println((i + 1) + ".çöpün doluluğu : " + copKutusu[i]);
                Thread.sleep(750);
                
                if (copKutusu[i] > 55) {
                    counterKamyon++;
                    dupCop[i] = copKutusu[i];
                    if (counterKamyon >= 3) {
                        copArabasiBelirle(counterKamyon);
                        
                    }
                }

                if (copKutusu[i] > 90) {

                    doldu = true;
                    counter++;
                    copArabasiBelirle(counter);
                    counter = 0;
                    copKutusu[i] = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
