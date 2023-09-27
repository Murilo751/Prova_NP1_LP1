package Murilo_Matos_Aragao;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario ;
        double prestacaoValue;
        System.out.println("Digite o seu salário");
        salario = scan.nextDouble();
        System.out.println("Digite o valor da prestação");
        prestacaoValue = scan.nextDouble();
        scan.close();

        double comparativo = salario * ((double) 20 / 100);

        if (prestacaoValue > comparativo) {
            System.out.println("Empréstimo não concedido");
        }else {
            System.out.println("Empréstimo concedido");
        }

    }
}
