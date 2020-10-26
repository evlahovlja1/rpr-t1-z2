package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();

        System.out.println("Brojevi u opsegu [1," + n + "] koji su djeljivi sa sumom cifara " + n + " su:");

        int nSumaCifara = sumaCifara(n);

        for (int i = 1; i <= n; ++i) {
            if (i % nSumaCifara == 0) System.out.println(i);
        }
    }

    public static int sumaCifara(int n) {
        int suma = 0;

        while (n != 0) {
            suma = suma + n%10;
            n = n / 10;
        }

        return suma;
    }
}
