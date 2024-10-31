package com.mycompany.array3;
import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[50];

        System.out.println("Digite 50 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("\nNúmeros em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        scanner.close();
    }
}