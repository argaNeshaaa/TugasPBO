package sbn;

    public class SBN{
        private String nama;
        private double bunga;
        private int jangkaWaktu;
        private String tanggalJatuhTempo;
        private long  kuotaNasional;

        public SBN(String nama, double bunga, int jangkaWaktu, String tanggalJatuhTempo, long kuotaNasional) {
            this.nama = nama;
            this.bunga = bunga;
            this.jangkaWaktu = jangkaWaktu;
            this.tanggalJatuhTempo = tanggalJatuhTempo;
            this.kuotaNasional = kuotaNasional;
        }

        public String getNama() {
            return nama;
        }
    
        public double getBunga() {
            return bunga;
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

        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public void setBunga(double bunga) {
            this.bunga = bunga;
        }
    
        public void setJangkaWaktu(int jangkaWaktu) {
            this.jangkaWaktu = jangkaWaktu;
        }
        public void setKuotaNasiona(long kuotaNasional) {
            this.kuotaNasional = kuotaNasional;
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

