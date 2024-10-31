package com.mycompany.array7;
import java.util.Arrays;
import java.util.Scanner;

class Time {
    String nome;
    int pontos;
    int vitorias;

    public Time(String nome, int pontos, int vitorias) {
        this.nome = nome;
        this.pontos = pontos;
        this.vitorias = vitorias;
    }
}

public class Array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de times: ");
        int numTimes = scanner.nextInt();
        scanner.nextLine();

        Time[] tabela = new Time[numTimes];

        for (int i = 0; i < numTimes; i++) {
            System.out.println("Digite os dados do time " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Pontos: ");
            int pontos = scanner.nextInt();
            System.out.print("Vitórias: ");
            int vitorias = scanner.nextInt();
            scanner.nextLine();

            tabela[i] = new Time(nome, pontos, vitorias);
        }

        Arrays.sort(tabela, (t1, t2) -> {
            if (t2.pontos != t1.pontos) {
                return t2.pontos - t1.pontos;
            } else {
                return t2.vitorias - t1.vitorias;
            }
        });

        System.out.println("\nTabela de classificação:");
        for (int i = 0; i < numTimes; i++) {
            System.out.println((i + 1) + "º lugar: " + tabela[i].nome + " - Pontos: " + tabela[i].pontos + " - Vitórias: " + tabela[i].vitorias);
        }

        System.out.print("\nDigite o nome do time para consultar a posição: ");
        String timeConsultado = scanner.nextLine();

        int posicao = encontrarPosicao(tabela, timeConsultado);
        if (posicao != -1) {
            System.out.println("O " + timeConsultado + " está na posição " + (posicao + 1));
        } else {
            System.out.println("Time não encontrado.");
        }
        scanner.close();
    }

    private static int encontrarPosicao(Time[] tabela, String nome) {
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i].nome.equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
}