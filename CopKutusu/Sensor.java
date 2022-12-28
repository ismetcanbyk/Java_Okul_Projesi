package CopKutusu;

import CopToplama.CopKamyonu;
import CopToplama.CopTaksi;

public class Sensor extends CopKutusu implements Runnable {

    CopTaksi taksi = new CopTaksi();
    CopKamyonu kamyon = new CopKamyonu();
    int[] copKutusu = new int[30];

    private static int taksiSayisi = 0;
    private static int kamyonSayisi = 0;

    //İç içe sınıfın constructor
    public Sensor() {
    }

    public Sensor(Adres a) {
        copKutusuOlustur(a);
    }

    public static void setTaksiSayisi(int taksiSayisi) {
        Sensor.taksiSayisi = taksiSayisi;
    }

    public static void setKamyonSayisi(int kamyonSayisi) {
        Sensor.kamyonSayisi = kamyonSayisi;
    }

    public int getKamyonSayisi() {
        return kamyonSayisi;
    }

    public int getTaksiSayisi() {
        return taksiSayisi;
    }

    public void copArabasiBelirle(int i, int arrIndis) {
        if (i == 1) {
            taksi.copArabasiBilgi();
            taksi.copBosalt(copKutusu, arrIndis);
        }
        if (i == 3) {
            kamyon.copArabasiBilgi();
            kamyon.copBosalt(copKutusu);
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
                        kamyonSayisi++;
                        counterKamyon = 0;
                    }
                }
                if (copKutusu[i] >= 90) {
                    counter++;
                    copArabasiBelirle(counter, i);
                    taksiSayisi++;
                    counter = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public class Bilgi {

        public void bilgiYazdir(Adres a) {
            System.out.println("\n------------------------");
            System.out.println("İnsan sayısı : " + a.getInsanSayisi());
            System.out.println("Oluşturulan çöp sayısı : " + getCopKutusuSayisi());
            System.out.println("Gelen taksi sayısı : " + getTaksiSayisi());
            System.out.println("Gelen kamyon sayısı : " + getKamyonSayisi());
        }
    }
}
