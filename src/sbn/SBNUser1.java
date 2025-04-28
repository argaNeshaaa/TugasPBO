package SBN;

public class SBNUser1 {
    private String nama;
        private double bunga;
        private int jangkaWaktu;
        private String tanggalJatuhTempo;
        private long  kuotaNasional;
        private int nominalInvestasi;
        private String idUser;

        public SBNUser1(String nama, double bunga, int jangkaWaktu, String tanggalJatuhTempo, long kuotaNasional, int nominalInvestasi, String idUser) {
            this.nama = nama;
            this.bunga = bunga;
            this.jangkaWaktu = jangkaWaktu;
            this.tanggalJatuhTempo = tanggalJatuhTempo;
            this.kuotaNasional = kuotaNasional;
            this.nominalInvestasi = nominalInvestasi;
            this.idUser = idUser;
        }

        public String getNama() {
            return nama;
        }
    
        public double getBunga() {
            return bunga;
        }
        public int getNominalInvestasi() {
            return nominalInvestasi;
        }

        public double getKuponSBN(){
            return (bunga / 100) / 12 * 0.9 * nominalInvestasi;
        }
        public int getJangkaWaktu() {
            return jangkaWaktu;
        }

        public String getTanggalJatuhTempo() {
            return tanggalJatuhTempo;
        }

        public long getKuotaNasional(){
            return kuotaNasional;
        }
        
        public String getIdUser(){
            return idUser;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public void setBunga(double bunga) {
            this.bunga = bunga;
        }
    
        public void setJangkaWaktu(int jangkaWaktu) {
            this.jangkaWaktu = jangkaWaktu;
        }
        
        public void setNominalInvestasi(int nominalInvestasi) {
            this.nominalInvestasi = nominalInvestasi;
        }

        @Override
        public String toString() {
            return "Nama SBN: " + nama +
                   ", Bunga: " + bunga + "%" +
                   ", Jangka Waktu: " + jangkaWaktu + " tahun" +
                   ", Jatuh Tempo: " + tanggalJatuhTempo +
                   ", Kuota Nasional: " + kuotaNasional;
        }
}
