import java.util.Scanner;

public class Bee_1017 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tempoViagem = input.nextInt();
        int velocidadeViagem = input.nextInt();

        double litrosNecessarios = tempoViagem / 12.0 * velocidadeViagem;

        System.out.printf("%.3f\n", litrosNecessarios);

    }
}
