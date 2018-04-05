
package praktek03.pkgnew;

public class Smartphone {
    private String jenis;
    private String merk;
    private double harga;
    
void cetakInfo(){
    System.out.println("Jenis \t: "+jenis+"\n"+
            "Merk \t: "+merk+"\n"+
            "Harga \t: "+harga);
}

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }



}
