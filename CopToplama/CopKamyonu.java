package CopToplama;

public class CopKamyonu extends CopToplama {

    public CopKamyonu() {
    }

    @Override
    public void copArabasiBilgi() {
        System.out.println("\n\n");
        System.out.println("   __   __________");
        System.out.println(" _//]| |          |");
        System.out.println("|____|-|__________|");
        System.out.println("  O      O     O");
        System.out.println("Çöp Kamyonu geldi.");
        System.out.println("Bütün çöpler toplanıyor...");
        System.out.println("\n\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void copBosalt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }
}
