package Latihan;

public class UjiBus {

    public static void main(String[] args) {
        // membuat objek busBesar dari kelas bus
        Bus busBesar = new Bus(5);
        busBesar.getpenumpang(17);
        System.out.println();
        busBesar.getpenumpang(24);
        busBesar.cetak();
        System.out.println();

        // Penambahan Penumpang
        busBesar.addPenumpang(2);
        busBesar.cetak();
        System.out.println();
        // Penambahan Penumpang
        busBesar.addPenumpang(1);
        busBesar.cetak();
        System.out.println();
        // Penambahan Penumpang
        busBesar.addPenumpang(2);
        busBesar.cetak();
        System.out.println();
        // Penambahan Penumpang
        busBesar.addPenumpang(2);
        busBesar.cetak();

    }
}
