package CopKutusu;

import java.util.ArrayList;

public class Sensor extends CopKutusu {

    private int dolulukOrani;
    private boolean doldu = false;

    int copKutusu[];

    public Sensor() {
        a.insanSayisi();
    }

    public void verileriGoruntule() {

    }

    public void dolulukOraniHesapla() {
        for (int i = 0; i < getCopKutusuSayisi(); i++) {
            System.out.println("1.çöpün doluluğu : "+copKutusu[i]);

            if(copKutusu[i]>90){
                System.out.println("doldu");
                doldu = true;
            }
        }
    }

    @Override
    public void copKutulari() {
        for (int i = 1; i <= getCopKutusuSayisi(); i++) {
            copKutusu[i] = 0;
        }

    }

    @Override
    public void copAt() {

        for (int i = 1; i <= a.getInsanSayisi(); i++) {
            copKutusu[a.copKutusuSecme()] = (int) (Math.random() * 15 + 1);
            System.out.println("Çöp atıldı ");
            dolulukOraniHesapla();
            
        }
    }

}
