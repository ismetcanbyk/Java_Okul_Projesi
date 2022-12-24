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
        System.out.println("Bütün çöpler toplandı.");
        System.out.println("\n\n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void copBosalt(int[] a,int x) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }
}
