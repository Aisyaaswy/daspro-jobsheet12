import java.util.Scanner;
public class Tugas2 {
    static int penjumlahanRekursif(int a) {
        if (a == 1) { // base case 
            System.out.print("1");
            return (1);
        }
        int deretSementara = penjumlahanRekursif(a - 1);
        System.out.print(" + " + a); //untuk mencetak angka saat ini
        return deretSementara + a; //untuk mengembalikan hasil penjummlahan
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan suatu bilangan n : ");
        int n = sc.nextInt();
        System.out.print(" = " + penjumlahanRekursif(n)); // memanggil fungsi rekursif dan mencetak hasil

        sc.close();
    }
}