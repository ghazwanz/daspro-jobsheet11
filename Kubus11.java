package Pertemuan13;
import java.util.Scanner;

public class Kubus11 {
    static int volKubus(int r){
        int hasil = r*r*r;
        return hasil;
    }
    static int lPermukaanKubus(int r){
        int hasil = 6*(r*r);
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rusuk;
        System.out.print("Masukkan panjang rusuk kubus: ");
        rusuk = sc.nextInt();
        int luas = lPermukaanKubus(rusuk);
        int volume = volKubus(rusuk);

        System.out.println("Luas Permukaan dari kubus dengan panjang rusuk "+rusuk+" = "+luas);
        System.out.println("Volume dari kubus dengan panjang rusuk "+rusuk+ " = "+volume);
    }
}