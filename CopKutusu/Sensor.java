package CopKutusu;

import CopToplama.CopKamyonu;
import CopToplama.CopTaksi;

public class Sensor extends CopKutusu implements Runnable {

    private boolean doldu = false;
    CopTaksi taksi = new CopTaksi();
    CopKamyonu kamyon = new CopKamyonu();
    int[] copKutusu = new int[30];

    public Sensor(Adres a) {
        copKutusuOlustur(a);
    }

    public void verileriGoruntule() {

    }

    public void copArabasiBelirle(int i, int x) {
        if (i == 1) {
            taksi.copArabasiBilgi();
            taksi.copBosalt(copKutusu, x);

        }
        if (i >= 3) {
            kamyon.copArabasiBilgi();
            kamyon.copBosalt(copKutusu, x);
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
            int doluluk = (int) (Math.random() * 22 + 1);
            copKutusu[copKutusuSecme()] += doluluk;

            System.out.println("\nÇöp atılıyor \n");
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

                Thread.sleep(450);

                if (copKutusu[i] > 55) {
                    counterKamyon++;

                    if (counterKamyon >= 3) {
                        copArabasiBelirle(counterKamyon, i);
                    }
                }

                if (copKutusu[i] > 90) {
                    doldu = true;
                    counter++;
                    copArabasiBelirle(counter, i);
                    counter = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
