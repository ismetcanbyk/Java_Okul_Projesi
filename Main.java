import CopKutusu.Adres;
import CopKutusu.Sensor;

public class Main {
    public static void main(String[] args) {
        Adres a = new Adres();
        Adres x = new Adres(10);
        Sensor s1 = new Sensor(a);

        s1.copAt(a);
        Sensor.Bilgi info = new Sensor().new Bilgi();
        info.bilgiYazdir(a);
    }
}
