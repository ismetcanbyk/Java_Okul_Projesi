package CopKutusu;

public class Adres {
    private int insanSayisi;
    Sensor s = new Sensor();

    public Adres() {

    }

    public void insanSayisi() {
        insanSayisi = (int) (Math.random() * 30 + 1);
    }

    public int copKutusuSecme() {
        s.copKutusuOlustur();
        return (int) (Math.random() * s.getCopKutusuSayisi() );
    }

    public int getInsanSayisi() {
        return insanSayisi;
    }

    public void setInsanSayisi(int insanSayisi) {
        this.insanSayisi = insanSayisi;
    }

}
