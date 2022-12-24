package CopKutusu;

public abstract class CopKutusu {

    private int copKutusuSayisi;

    public CopKutusu() {

    }

    

    public void copKutusuOlustur(Adres a) {
        if (a.getInsanSayisi() <= 5) {
            copKutusuSayisi = 1;
        } else if (a.getInsanSayisi() > 50) {
            copKutusuSayisi = a.getInsanSayisi() / 10 + 1;
        } else {
            copKutusuSayisi = a.getInsanSayisi() / 5 + 1;
        }

    }

    public abstract void copKutulari();

    public abstract void copAt(Adres a);

    public int getCopKutusuSayisi() {
        return copKutusuSayisi;
    }

    public void setCopKutusuSayisi(int copKutusuSayisi) {
        this.copKutusuSayisi = copKutusuSayisi;
    }

}
