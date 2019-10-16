package Praktik;

public class UjiBus3 {

    public static void main(String[] args) {
        Bus3 bus = new Bus3(60.0);
        bus.getpenumpang(24);
        bus.addpenumpang(42.76);
        bus.cetak();
        bus.getAvarage();
        bus.addcounter(4);
        bus.penumpangbaru(12.32);
        bus.cetak2();
    }
}
