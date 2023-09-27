package Murilo_Matos_Aragao;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, n = 1;
        num = scan.nextInt();
        scan.close();
        if (num < 0) {
            System.out.println("Não foi possivel calcular");
        } else if (num == 1 || num == 0) {
            System.out.println("o fatorial é : 1");
        } else {
            for (int i = 1; i <= num; i++) {
                n = n * i;
            }
            System.out.println("fatorial de n é: " + n);
        }
    }
}
