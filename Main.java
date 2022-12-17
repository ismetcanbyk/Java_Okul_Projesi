import CopKutusu.Adres;
import CopKutusu.Sensor;

public class Main {
    public static void main(String[] args) {
        Adres a = new Adres();
        Sensor s1 = new Sensor(a);
        
        s1.copAt(a);
        
        
    }
}
