import java.util.Scanner;

public class Bee_1008 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numFuncionario = input.nextInt();
        int quatHoraTrabalhadas = input.nextInt();
        double valorHora = input.nextDouble();

        double SALARY = quatHoraTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
    }
}
