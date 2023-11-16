package Murilo_Matos_Aragão_LP2;

import java.util.Scanner;

public class Questao4 {
    public static double IMC(double peso, double altura){
        double IMC = (peso / altura) * 2;
        return IMC;
    }
    public static void men(double IMC, double altura){
        if (IMC == (72.7 * altura) - 58){
            System.out.println("Você está no peso ideal");
        } else if (IMC > (72.7 * altura) - 58){
            System.out.println("Você está acima do peso ideal");
        }else {
            System.out.println("Você está abaixo do peso ideal");
        }
    }

    public static void woman(double IMC, double altura){
        if (IMC == (62.1 * altura) - 44.7){
            System.out.println("Você está no peso ideal");
        } else if (IMC > (62.1 * altura) - 44.7){
            System.out.println("Você está acima do peso ideal");
        }else {
            System.out.println("Você está abaixo do peso ideal");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso = 0;
        double altura = 0;

        System.out.println("Digite sua altura em m");
        altura = scan.nextDouble();
        System.out.println("Digite seu peso em kg");
        peso = scan.nextDouble();
        System.out.println("Digite seu gênero genetico(homem ou h para o genero masculino)(mulher ou m para o genero feminino)");
        String genero = scan.nextLine();

        double calcIMC = IMC(peso, altura);

        if (genero.toLowerCase().equals("homem") || genero.toLowerCase().equals("h")){
            men(calcIMC, altura);
        } else if (genero.toLowerCase().equals("mulher") || genero.toLowerCase().equals("m")) {
            woman(calcIMC, altura);
        }


    }
}
