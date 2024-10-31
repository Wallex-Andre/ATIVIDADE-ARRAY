package com.mycompany.array4;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[50];

        System.out.println("Digite 50 números: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());
         
        System.out.println("\nNúmeros em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        scanner.close();
    }
}