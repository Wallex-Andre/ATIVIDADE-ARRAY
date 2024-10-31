package com.mycompany.array5;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] todosNumeros = new int[100];
        int[] numerosPares = new int[100];
        int countPares = 0;

        System.out.println("Digite 100 números:");

        for (int i = 0; i < todosNumeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            todosNumeros[i] = scanner.nextInt();

            if (todosNumeros[i] % 2 == 0) {
                numerosPares[countPares] = todosNumeros[i];
                countPares++;
            }
        }

        int[] numerosParesFinal = new int[countPares];
        System.arraycopy(numerosPares, 0, numerosParesFinal, 0, countPares);

        System.out.println("\nNúmeros pares digitados:");
        for (int numero : numerosParesFinal) {
            System.out.println(numero);
        }
        scanner.close();
    }
}