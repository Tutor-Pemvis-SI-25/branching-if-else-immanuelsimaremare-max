// 12S25058 - IMMANUEL SIMAREMARE

import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, t, k;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("Bilangan Pertama adalah Genap");
        } else {
            System.out.println("Bilangan Pertama adalah Ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("bilangan kedua genap");
        } else {
            System.out.println("bilangan kedua ganjil");
        }
        if (a > b) {
            System.out.println(" KEDUA BILANGAN SAMA BESAR");
        } else {
            if (a < b) {
                System.out.println(" BIL PERTAMA LEBIH BESAR");
            } else {
                System.out.println("BIL PERTAMA LEBIH KECIL");
            }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                t = a + b;
                System.out.println("HASIL PENJUMLAHAN: " + t);
            } else {
                System.out.println("BERBEDA JENIS");
            }
        } else {
            if (b % 2 != 0) {
                k = a * b;
                System.out.println("HASIL PERKALIAN: " + k);
            } else {
                System.out.println("BERBEDA JENIS");
            }
        }
    }
}
