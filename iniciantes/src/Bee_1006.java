import java.util.Scanner;

public class Bee_1006 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double MEDIA = A * 0.2 + B * 0.3 + C * 0.5;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }
}
