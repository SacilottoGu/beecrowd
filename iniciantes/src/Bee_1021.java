import java.util.Scanner;

public class Bee_1021 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double N = input.nextDouble();
        int N2 = (int) N;
        double N3 = (N - N2) * 100;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", N2 / 100);
        System.out.printf("%d nota(s) de R$ 50.00\n", (N2 % 100) / 50);
        System.out.printf("%d nota(s) de R$ 20.00\n", ((N2 % 100) % 50) / 20);
        System.out.printf("%d nota(s) de R$ 10.00\n", (((N2 % 100) % 50) % 20) / 10);
        System.out.printf("%d nota(s) de R$ 5.00\n", ((((N2 % 100) % 50) % 20) % 10) / 5);
        System.out.printf("%d nota(s) de R$ 2.00\n", (((((N2 % 100) % 50) % 20) % 10) % 5) / 2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", (((((((int)N % 100) % 50) % 20) % 10) % 5) % 2));
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", (((((N % 100) % 50) % 20) % 10) % 2) % 1);
        System.out.printf("%d moeda(s) de R$ 0.25\n", (int)N3 % 50 / 25);
        System.out.printf("%d moeda(s) de R$ 0.10\n",((int)N3 % 50 % 25) / 10);
        System.out.printf("%d moeda(s) de R$ 0.05\n",(((int)N3 % 50 % 25) % 10) / 5);
        System.out.printf("%d moeda(s) de R$ 0.01\n",(((int)N3 % 50 % 25) % 10) % 5);
    }
}
