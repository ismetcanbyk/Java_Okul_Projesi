package CopKutusu;

public class Sensor extends CopKutusu {

    private int dolulukOrani;
    private boolean doldu = false;

    

    int[] copKutusu = new int[30];

    public Sensor(Adres a) {
        a.insanSayisi();
        copKutusuOlustur(a);
    }

    public void verileriGoruntule() {

    }

    public void dolulukOraniHesapla() {
        for (int i = 0; i < getCopKutusuSayisi(); i++) {
            System.out.println((i+1)+".çöpün doluluğu : "+copKutusu[i]);

            if(copKutusu[i]>90){
                System.out.println((i+1)+". çöp doldu - boşaltılıyor");
                
                doldu = true;
                copKutusu[i] = 0;
            }
        }
    }


    public int copKutusuSecme() {
        int a = (int) (Math.random() * getCopKutusuSayisi() );
        System.out.println(a);
        return a;
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
            int test = (int) (Math.random() * 15 + 1);
            copKutusu[copKutusuSecme()] += test;
            System.out.println("Çöp atıldı ");
            dolulukOraniHesapla();
            
        }
    }

}
