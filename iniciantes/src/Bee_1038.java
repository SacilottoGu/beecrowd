import java.util.Scanner;

public class Bee_1038 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] precos = {4.0,4.5,5.0,2.0,1.5};

        int codigoEntrada = input.nextInt();
        int quantidadeProduto = input.nextInt();

        double total = precos[codigoEntrada-1] * quantidadeProduto;

        System.out.printf("Total: R$ %.2f", total);

    }
}
