import java.util.Scanner;

public class Bee_1002 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n = 3.14159;
        double raio = input.nextDouble();
        double area = n * (raio*raio);

        System.out.printf("A=%.4f\n",area);
    }
}
