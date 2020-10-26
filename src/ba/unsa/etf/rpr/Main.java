package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {

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
