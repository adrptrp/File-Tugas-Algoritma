package Record;

public class DeklarasiPenulisan {
    public static void main(String[] args) {
        // Deklarasi objek pegawai
        Pegawai pegawai = new Pegawai();
        
        // Assign nilai ke objek pegawai
        pegawai.kd_peg = "001";
        pegawai.nama = "Andi Sujarwo";
        pegawai.alamat = "Jl. Kyi Telingsing No 56 Kudus";
        pegawai.gaji = 1500000;
        
        // Output data pegawai
        System.out.println("Kode Pegawai :" + pegawai.kd_peg);
        System.out.println("Nama :" + pegawai.nama);
        System.out.println("Alamat :" + pegawai.alamat);
        System.out.println("Gaji :" + pegawai.gaji);
        
        // Menunggu input pengguna sebelum menutup program
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Kelas Pegawai sebagai record
class Pegawai {
    String kd_peg;
    String nama;
    String alamat;
    int gaji;
}
