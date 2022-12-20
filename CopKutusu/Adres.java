package CopKutusu;

public class Adres {
    private int insanSayisi;
   

    public Adres() {

    }

    public void insanSayisi() {
        insanSayisi = (int) (Math.random() * 20 + 4);
    }

    

    public int getInsanSayisi() {
        return insanSayisi;
    }

    public void setInsanSayisi(int insanSayisi) {
        this.insanSayisi = insanSayisi;
    }

}
