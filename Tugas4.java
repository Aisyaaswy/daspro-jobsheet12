import java.util.Scanner;
public class Tugas4 {
    static int fibonacciRekursif(int n) {
        if (n == 1) {
            return 1;
        } if (n == 2) {
            return 1;
        }
        return fibonacciRekursif(n - 1) + fibonacciRekursif(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan yang ingin di periksa : ");
        int bulan = sc.nextInt();

        System.out.print("Total pasangan pada bulan ke-" + bulan + " adalah " + fibonacciRekursif(bulan) + " pasang ") ;
    }
}