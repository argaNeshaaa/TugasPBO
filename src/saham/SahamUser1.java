package saham;

public class SahamUser1 {
    private String nama;
    private double harga;
    private int lotDibeli;
    private String idUser;

    public SahamUser1(String nama, double harga, int lotDibeli, String idUser) {
        this.nama = nama;
        this.harga = harga;
        this.lotDibeli = lotDibeli;
        this.idUser = idUser;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getLotDibeli() {
        return lotDibeli;
    }

    public String getIdUser() {
        return idUser;
    }


    public void setLotDibeli(int lotDibeli) {
        this.lotDibeli = lotDibeli;
    }

    @Override
    public String toString() {
        return nama + "- Harga: Rp" + harga + "- Lembar Dibeli: " + lotDibeli;
    }
}
