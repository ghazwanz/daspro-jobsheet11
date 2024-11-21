package Pertemuan13;
import java.util.Scanner;
public class Kafe11 {
    static int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
    static String[] namaMenu = { "Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng" };

    public static double hitungTotalHarga(int[] pilihanMenu, int[] banyakItem, String kodePromo) {
        double hargaTotal = 0;
        for (int i = 0; i < banyakItem.length; i++) {
            hargaTotal += hargaItems[pilihanMenu[i]- 1] * banyakItem[i];
        }
        double diskon = 0;
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode berhasil diaktivasi, anda mendapat diskon 50%");
            diskon = 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode berhasil diaktivasi, anda mendapat diskon 30%");
            diskon = 0.3;
        } else
            System.out.println("Kode tidak valid");
        hargaTotal = hargaTotal - (hargaTotal * diskon);
        return hargaTotal;
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("%s. %s - Rp %s\n", i + 1, namaMenu[i], hargaItems[i]);
        }
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        System.out.print("\nMasukkan jumlah jenis menu yang ingin Anda pesan: ");
        int jenisMenu = sc.nextInt();
        int pilihanMenu[] = new int[jenisMenu];
        int banyakMenu[] = new int[jenisMenu];
        for (int i = 0; i < jenisMenu; i++) {
            System.out.print("\nMasukkan nomor menu ke-" + (i+1) + " yang ingin Anda pesan: ");
            pilihanMenu[i] = sc.nextInt();
            System.out.print("\nMasukkan jumlah item ke-"+(i+1)+" yang ingin dipesan: ");
            banyakMenu[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.print("\nMasukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();
        double totalHarga = hitungTotalHarga(pilihanMenu, banyakMenu, kodePromo);
        System.out.println("======================= Rincian Biaya =======================");
        for (int i = 0; i < banyakMenu.length; i++) {
            System.out.println("Nama menu: "+namaMenu[pilihanMenu[i]-1]+"\tHarga: "+hargaItems[pilihanMenu[i]-1]+"\tjumlah: "+banyakMenu[i]);
        }
        System.out.println("Total harga untuk keseluruhan pesanan Anda: Rp. " + totalHarga);
        System.out.println("=============================================================");
    }
}