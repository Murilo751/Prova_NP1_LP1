package Murilo_Matos_Aragao;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, sumQuad = 0 , quadSum = 0, diference;
        System.out.println("Digite um numero inteiro");
        N = scan.nextInt();
        scan.close();

        for (int i = 1; i <= N; i++) {
            sumQuad += i * i;
        }

        for (int j = 0; j <= N; j++) {
            quadSum += j;
        }
        quadSum = quadSum * quadSum;

        diference = quadSum - sumQuad;

        System.out.println("A diferença entre a soma dos quadrados e o quadrado da soma é: " + diference);
        System.out.println("A soma dos quadrados é: " + sumQuad);
        System.out.println("A quadrado da soma é: " + quadSum);
    }
}
