package sda;

import java.util.Scanner;

public class Prime {

    private int liczba;

    public void isPrime() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz numer: ");
        int numer = scan.nextInt();
        scan.close();
        boolean pierwsza = true;
        for (int i = 2; i <= numer / 2; i++) {
            liczba = numer % i;
            if (liczba == 0){
                pierwsza = false;
                break;
            }
        }
        if (pierwsza) {
            System.out.println(" Liczba jest pierwsza");
        } else {
            System.out.println(" Liczba nie jest pierwsza");
        }
    }
}
