import java.util.Scanner;

public class Bee_1010 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] codPeca = new int[2];
        int [] quantidadePeca = new int[2];
        double [] valorUnitario = new double[2];
        double valorFinal = 0;

        for (int i = 0; i < quantidadePeca.length; i++){
             codPeca[i] = input.nextInt();
             quantidadePeca[i] = input.nextInt();
             valorUnitario[i] = input.nextDouble();
             valorFinal += valorUnitario[i] * quantidadePeca[i];
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorFinal);
    }
}
