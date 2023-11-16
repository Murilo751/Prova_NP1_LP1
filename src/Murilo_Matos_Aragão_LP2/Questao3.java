package Murilo_Matos_Aragão_LP2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;

        System.out.println("Digite sua primeira nota");
        nota1 = scan.nextDouble();
        System.out.println("Digite sua segunda nota");
        nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 4) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Final");
        }

    }
}
