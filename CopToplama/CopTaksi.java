package CopToplama;

public class CopTaksi extends CopToplama {

    public CopTaksi() {
    }

    @Override
    public void copArabasiBilgi() {
        System.out.println("\n\n");
        System.out.println("     _");
        System.out.println(" ___/_|_____");
        System.out.println("[_,_______,_]");
        System.out.println("  \"       \"");
        System.out.println("Çöp Taksi Geldi");
        System.out.println("Çöp toplanıyor...");
        System.out.println("\n\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void copBosalt(int[] a, int x) {
        a[x] = 0;
    }
}