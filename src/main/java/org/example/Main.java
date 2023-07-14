package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kenarın uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci kenarın uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();

        scanner.close();

        double hipotenus = Math.sqrt(kenar1 * kenar1 + kenar2 * kenar2);

        System.out.println("Hipotenüs: " + hipotenus);
    }
    }
