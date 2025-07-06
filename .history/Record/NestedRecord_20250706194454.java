package Record;

public class NestedRecord {
    public static void main(String[] args) {
        // Deklarasi objek datapegawai
        DataPegawai pegawai = new DataPegawai();
        
        // Mengisi data pegawai
        pegawai.nama = "Andi Sujarwo";
        pegawai.tglMasuk = new Masuk();
        pegawai.tglMasuk.hari = 1;
        pegawai.tglMasuk.bulan = 6;
        pegawai.tglMasuk.tahun = 2020;
        pegawai.almt = new Alamat();
        pegawai.almt.jalan = "Jl. Kyi Telingsing No 56";
        pegawai.almt.kota = "Kudus";
        pegawai.gaji = new GajiPeg();
        pegawai.gaji.pokok = 1000000.0;
        pegawai.gaji.tunjangan = 300000.0;
        pegawai.gaji.lembur = 200000.0;
        
        // Output data pegawai
        System.out.println("Nama: " + pegawai.nama);
        System.out.println("Tanggal Masuk: " + pegawai.tglMasuk.hari + "/" + pegawai.tglMasuk.bulan + "/" + pegawai.tglMasuk.tahun);
        System.out.println("Alamat: " + pegawai.almt.jalan + ", " + pegawai.almt.kota);
        System.out.println("Gaji Pokok: " + pegawai.gaji.pokok);
        System.out.println("Tunjangan: " + pegawai.gaji.tunjangan);
        System.out.println("Lembur: " + pegawai.gaji.lembur);
        System.out.println("Total Gaji: " + (pegawai.gaji.pokok + pegawai.gaji.tunjangan + pegawai.gaji.lembur));
        
        // Menunggu input pengguna sebelum menutup program
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Kelas GajiPeg sebagai record untuk komponen gaji
class GajiPeg {
    double pokok;
    double tunjangan;
    double lembur;
}

// Kelas Masuk sebagai record untuk tanggal masuk
class Masuk {
    int hari;
    int bulan;
    int tahun;
}

// Kelas Alamat sebagai record untuk alamat
class Alamat {
    String jalan;
    String kota;
}

// Kelas DataPegawai sebagai record utama dengan field bertipe record
class DataPegawai {
    String nama;
    Masuk tglMasuk;
    Alamat almt;
    GajiPeg gaji;
}
