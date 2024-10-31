package com.mycompany.array1;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        scanner.close();
    }
}