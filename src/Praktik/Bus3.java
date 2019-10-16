package Praktik;

public class Bus3 {

    public double penumpang;
    public double maxpenumpang;
    public double penumpangbaru;
    public int counter;

    public Bus3(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Berat Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getAvarage() {
        System.out.println("Rata-rata berat penumpang = " + (penumpang / maxpenumpang));
    }

    public void getpenumpang(int password) {
        if (password == 24) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }

    public void addcounter(int counter) {
        this.counter = counter;
        penumpangbaru = 0;
    }

    public void penumpangbaru(double penumpangbaru) {
        double temp;
        temp = this.penumpangbaru + penumpangbaru;
        this.penumpangbaru = temp;
    }

    public void cetak() {
        System.out.println("Berat penumpang = " + penumpang);
        System.out.println("Berat max penumpang = " + maxpenumpang);
    }
    
    public void cetak2() {
        System.out.println("Jumlah penumpang baru = " + counter);
        System.out.println("Berat penumpang baru = " + penumpangbaru);
    }
}
