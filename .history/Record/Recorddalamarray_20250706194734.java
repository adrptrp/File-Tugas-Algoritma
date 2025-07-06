package Record;

public class Recorddalamarray {
    public static void main(String[] args) {
        // Deklarasi array objek pegawai
        Pegawai[] pegawai = new Pegawai[10];
        
        // Inisialisasi array
        for (int i = 0; i < pegawai.length; i++) {
            pegawai[i] = new Pegawai();
        }
        
        // Mengisi data untuk setiap pegawai dalam array
        for (int i = 0; i < pegawai.length; i++) {
            pegawai[i].kd_peg = String.format("%03d", i + 1);
            pegawai[i].nama = "Pegawai " + (i + 1);
            pegawai[i].alamat = "Alamat " + (i + 1);
            pegawai[i].gaji = 1500000 + (i * 100000);
        }
        
        // Output data untuk setiap pegawai
        for (int i = 0; i < pegawai.length; i++) {
            System.out.println("Data Pegawai " + (i + 1) + ":");
            System.out.println("Kode Pegawai :" + pegawai[i].kd_peg);
            System.out.println("Nama :" + pegawai[i].nama);
            System.out.println("Alamat :" + pegawai[i].alamat);
            System.out.println("Gaji :" + pegawai[i].gaji);
            System.out.println();
        }
        
        // Menunggu input pengguna sebelum menutup program
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
