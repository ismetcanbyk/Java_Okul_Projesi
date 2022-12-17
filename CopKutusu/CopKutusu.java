package CopKutusu;

public abstract class CopKutusu {
    private int id;
    private int copKutusuSayisi;
    Adres a = new Adres();

    public CopKutusu() {

    }

    public void copKutusuOlustur() {
        if (a.getInsanSayisi() <= 5) {
            copKutusuSayisi = 1;
        } else {
            copKutusuSayisi = a.getInsanSayisi() / 5 + 1;
        }
    }

    public abstract void copKutulari();

    public abstract void copAt();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCopKutusuSayisi() {
        return copKutusuSayisi;
    }

    public void setCopKutusuSayisi(int copKutusuSayisi) {
        this.copKutusuSayisi = copKutusuSayisi;
    }

}
