package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa sudah dapat mendaftar ujian skripsi.";
            } else if (bimbinganP1 < 8 && bimbinganP2 >= 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali.";
            } else if (bimbinganP1 >= 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali.";
            } else {
                pesan = "Gagal! Log bimbingan P1 dan P2 belum mencapai batas minimal.";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen.";
        }

        System.out.println(pesan);
        sc.close();
    }
}