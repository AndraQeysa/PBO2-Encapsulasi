package Latihan;

public class Bus {

    public int penumpang;
    public int maxpenumpang;

    // konstruktor kelas bus
    public Bus(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    // method mutatorpenumpang
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(int password) {
        if (password == 24) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }

    public void cetak() {
        System.out.println("Penumpang bus sekaran adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxpenumpang);
    }
}
