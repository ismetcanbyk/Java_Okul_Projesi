package CopToplama;

public class CopTaksi extends CopToplama {

    public CopTaksi() {
    }

    public CopTaksi(String name){

    }

    @Override
    public void copArabasiBilgi() {
        System.out.println("\n\n");
        System.out.println("     _");
        System.out.println(" ___/_|_____");
        System.out.println("[_,_______,_]");
        System.out.println("  \"      \"");
        System.out.println("Çöp Taksi Geldi");
        System.out.println("\n\n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void copBosalt(int[] a, int x) {
        a[x] = 0;
    }

}