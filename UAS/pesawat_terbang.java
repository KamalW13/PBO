class Penumpang {
    String namaPenumpang;
    String nomorKursi;

    Penumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    String getNamaPenumpang() {
        return this.namaPenumpang;
    }

    String getNomorKursi() {
        return this.nomorKursi;
    }
}

class Pesawat {
    String namaPesawat, nomorPenerbangan;
    int kapasitasPenumpang;
    String[] daftarNamaPenumpang;
    String[] daftarKodePenumpang;
    int jumlahPenumpang = 0;

    public Pesawat(String namaPesawat, int kapasitasPenumpang, String nomorPenerbangan) {
        this.namaPesawat = namaPesawat;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.nomorPenerbangan = nomorPenerbangan;
        this.daftarNamaPenumpang = new String[kapasitasPenumpang];
        this.daftarKodePenumpang = new String[kapasitasPenumpang];
    }

    String penetapanNomorKursiPenumpang() {
        String namaPesawat = this.namaPesawat;
        char hurufDepanNamaPesawat = namaPesawat.charAt(0);
        String kodePenumpang = String.format("%03d", this.jumlahPenumpang);

        String hasil = hurufDepanNamaPesawat + kodePenumpang;
        return hasil;
    }

    void tambahPenumpang(Penumpang penumpang) {
        penumpang.setNomorKursi(penetapanNomorKursiPenumpang());
        this.daftarNamaPenumpang[this.jumlahPenumpang] = penumpang.getNamaPenumpang();
        this.daftarKodePenumpang[this.jumlahPenumpang] = penumpang.getNomorKursi();
        this.jumlahPenumpang += 1;
        Penerbangan penerbangan = new Penerbangan("Tujuan", this);
        penerbangan.updateJumlahPenumpang(this.jumlahPenumpang);
    }

    void dataPenumpang() {
        System.out.println("======= Data Penumpang =======");
        for (int i = 0; i < jumlahPenumpang; i++) {
            System.out.println("("+this.daftarKodePenumpang[i] + ") "+ this.daftarNamaPenumpang[i]);
        }
    }
}

class GarudaAir extends Pesawat {
    public GarudaAir(String namaPesawat, int kapasitasPenumpang, String nomorPenerbangan) {
        super(namaPesawat, kapasitasPenumpang, nomorPenerbangan);
    }
}

class Penerbangan {
    String tujuan, nomorPenerbangan, namaPesawat;
    int jumlahPenumpang;

    Penerbangan(String tujuan, Pesawat pesawat) {
        this.tujuan = tujuan;
        this.nomorPenerbangan = pesawat.nomorPenerbangan;
        this.namaPesawat = pesawat.namaPesawat;
        this.jumlahPenumpang = pesawat.jumlahPenumpang;
    }

    void info() {
        System.out.println("======= INFO =======\nPesawat:\t\t" + this.namaPesawat + "\nTujuan:\t\t\t" + this.tujuan
                + "\nNo. Penerbangan:\t" + this.nomorPenerbangan + "\nJumlah Penumpang:\t" + this.jumlahPenumpang);
    }
    
    void updateJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
}

class PesawatTerbang {
    public static void main(String[] args) {
        Penumpang penumpang1 = new Penumpang("Kamal Wahid"); // Membuat Obj Penumpang
        Penumpang penumpang2 = new Penumpang("Rafii Ramadhan");
        Penumpang penumpang3 = new Penumpang("Nia Widyanti"); // ==================

        GarudaAir pesawatGaruda = new GarudaAir("Garuda Air", 30, "G4R"); // Membuat Obj Pesawat
        pesawatGaruda.tambahPenumpang(penumpang1); // Menambahkan Penumpang kedalam Pesawat
        pesawatGaruda.tambahPenumpang(penumpang2);
        pesawatGaruda.tambahPenumpang(penumpang3); // ===================================

        Penerbangan penerbanganG4R = new Penerbangan("Jakarta", pesawatGaruda); // Menambahkan data Penerbangan dari Pesawat yang dimasukan

        System.out.println("");
        pesawatGaruda.dataPenumpang(); // Memperlihatkan data Penumpang yang dimiliki oleh pesawatGaruda
        System.out.println("");
        penerbanganG4R.info(); // Info Penerbangan
    }
}