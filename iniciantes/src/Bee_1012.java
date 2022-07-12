import java.util.Scanner;

public class Bee_1012 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double PI = 3.14159;

        double areaTrianguloRetangulo = A * C / 2;
        double areaCirculo = PI * (C * C);
        double areaTrapezio = ( A + B ) * C / 2;//
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

    }
}
