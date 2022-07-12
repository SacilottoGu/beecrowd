import java.util.Scanner;

public class Bee_1009 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double comissao = 0.15;

        String nomeFuncionario = input.next();
        double salarioFixo = input.nextDouble();
        double vendasMensais = input.nextDouble();

        double TOTAL = salarioFixo + vendasMensais * comissao;

        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);

    }
}
