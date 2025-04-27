package saham;

public class Saham {
    private String nama;
    private double harga;
    private int lotTersedia;

    public Saham(String nama, double harga, int lotTersedia) {
        this.nama = nama;
        this.harga = harga;
        this.lotTersedia = lotTersedia;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getLotTersedia() {
        return lotTersedia;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setLotTersedia(int lotTersedia) {
        this.lotTersedia = lotTersedia;
    }

    @Override
    public String toString() {
        return nama + "- Harga: Rp" + harga + "- Lembar Tersedia: " + lotTersedia;
    }
}
