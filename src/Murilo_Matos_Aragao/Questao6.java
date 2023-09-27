package Murilo_Matos_Aragao;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1, nota2;
        System.out.print("Digite a sua primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        nota2 = scan.nextDouble();
        scan.close();

        Double media = ( nota1 + nota2 )/2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 4) {
            System.out.println("Reprovado");
        }else {
            System.out.println("Final");
        }

        System.out.println("e a sua media foi : " + media);
    }
}
