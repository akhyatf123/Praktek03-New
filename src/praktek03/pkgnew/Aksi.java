package praktek03.pkgnew;

public class Aksi {
    public static void main(String[] args) {
         Smartphone e = new Smartphone();
         
        e.setJenis("Android");
        e.setMerk("Meizu M5S");
        e.setHarga(9000);
         
         e.cetakInfo();
         
         System.out.println("Jenisnya \t: ");
         System.out.println(e.getJenis());
         System.out.println("Merknya \t: ");
         System.out.println(e.getMerk());
         System.out.println("Harganya \t: ");
         System.out.println(e.getHarga());
    }
    
}
