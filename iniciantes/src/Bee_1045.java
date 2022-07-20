import java.util.Scanner;

public class Bee_1045 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();

        double A, B, C;

        if(first > second && first > third){
            A = first;
            B = second;
            C = third;
        }else if(second > first && second > third){
            A = second;
            B = first;
            C = third;
        }else{
            A = third;
            B = first;
            C = second;
        }

        if(A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
