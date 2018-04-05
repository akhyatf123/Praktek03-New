package praktek03.pkgnew;

public class Aksi {
    public static void main(String[] args) {
         Smartphone e = new Smartphone();
         
        e.setJenis("Android");
        e.setMerk("Meizu M5S");
        e.setHarga(9000);
        //gak bisa hahahaha e.setJenisIphone();
         
         e.cetakInfo();
         
         System.out.println("Jenisnya \t: ");
         System.out.println(e.getJenis());
         System.out.println("Merknya \t: ");
         System.out.println(e.getMerk());
         System.out.println("Harganya \t: ");
         System.out.println(e.getHarga());
         
         iPhone ah = new iPhone();
         ah.setJenis("IOS 5");
         ah.setMerk("IPHONE X");
         ah.setHarga(1000);
         ah.setJenisIphone("IPHONE X GOLDEN");
         ah.cetakInfo();
         
         System.out.println("Jenis \t: "+ah.getJenisIphone());
         ah.iniIphone();
         
         
    }
    
}
