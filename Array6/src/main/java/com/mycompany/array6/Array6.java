package com.mycompany.array6;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] todosNumeros = new int[100];
        int[] numerosImpares = new int[100];
        int countImpares = 0;

        System.out.println("Digite 100 números:");

        for (int i = 0; i < todosNumeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            todosNumeros[i] = scanner.nextInt();

            if (todosNumeros[i] % 2 != 0) {
                numerosImpares[countImpares] = todosNumeros[i];
                countImpares++;
            }
        }
        System.out.println("\nNúmeros ímpares digitados:");
        for (int i = 0; i < countImpares; i++) {
            System.out.println(numerosImpares[i]);
        }
        scanner.close();
    }
}