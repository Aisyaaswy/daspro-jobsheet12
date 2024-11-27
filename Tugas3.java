import java.util.Scanner;
public class Tugas3 {
    static int faktor = 2;
    static Scanner sc = new Scanner(System.in);

    static void CekPrimaRekursif(int n, int faktor) {
        if (n < 2) {
            System.out.print("Bukan Bilangan Prima");
        } else if (faktor == n) {
            System.out.print("Merupakan Bilangan Prima");
        } else if (n % faktor == 0) {
            System.out.print("Bukan Merupakan Bilangan Prima");
        } else {
            CekPrimaRekursif(n, faktor+1);
        }
    }
    public static void main(String[] args) {

        System.out.print("Masukkan sebuah bilangan : ");
        int bilangan = sc.nextInt();
        CekPrimaRekursif(bilangan, faktor);
    }
}