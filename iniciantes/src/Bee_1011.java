import java.util.Scanner;

public class Bee_1011 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double PI = 3.14159;
        double R = input.nextDouble();
        double volume = (4/3.0) * PI * Math.pow(R,3);

        System.out.printf("VOLUME = %.3f\n",volume);

    }
}
