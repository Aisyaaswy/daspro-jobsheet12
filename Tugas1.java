
import java.util.Scanner;

public class Tugas1 {
    //FUNGSI REKURSIF
    static void decendingRekursif (int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " " );
        decendingRekursif(n - 1);
    }
    //FUNGSI ITERATIF
    static void decendingIteratif (int n) { 
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan suatu bilangan n : ");
        int n = sc.nextInt();
        System.out.print("Hasil dari fungsi rekursif : ");
        decendingRekursif(n); // untuk memanggil fungsi rekursif
        System.out.print("\nHasil dari fungsi iteratif : ");
        decendingIteratif(n); // mamnggil fungsi iteratif

        sc.close();
    }
}
