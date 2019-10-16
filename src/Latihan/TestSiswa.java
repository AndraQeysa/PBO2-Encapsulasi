package Latihan;

public class TestSiswa {
   public static void main(String[] args){
       EncapSiswa siswa = new EncapSiswa();
       siswa.setName("Hartono");
       siswa.setAge(17);
       siswa.setAddress("Jombang");
       
       System.out.println("Name : "+siswa.getName());
       System.out.println("Age  : "+siswa.getAge());
       System.out.println("Address : "+siswa.getAddress());
   }
}
