package Murilo_Matos_Aragão_LP2;

public class Questao5 {
    public static void SegundoMetodo(){
        System.out.println("inicio da execucao do segundo metodo");
        double v[] = new double[5];
        try {
            for (int i = 0; i <= 10; i++) {
                v[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {
        } finally {
            System.out.println("fim da execucao do segundo metodo");
        }
    }
    public static void PrimeiroMetodo(){
        System.out.println("inicio da execucao do primeiro metodo");
        SegundoMetodo();
        System.out.println("fim da execucao do primeiro metodo");
    }
    public static void main(String[] args) {
        System.out.println("inicio da main");
        PrimeiroMetodo();
        System.out.println("fim da main");
    }
}
