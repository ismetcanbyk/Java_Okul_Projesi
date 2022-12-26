package CopKutusu;

public class Adres {
    private int insanSayisi;

    public Adres() {
        insanSayisi();
    }

    public Adres(int insanSayisi) {
        this.insanSayisi = insanSayisi;
    }

    public void insanSayisi() {
        this.insanSayisi = (int) (Math.random() * 20 + 4);
    }

    public int getInsanSayisi() {
        return insanSayisi;
    }

    public void setInsanSayisi(int insanSayisi) {
        this.insanSayisi = insanSayisi;
    }

}
