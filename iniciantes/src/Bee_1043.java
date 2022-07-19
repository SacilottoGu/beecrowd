import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee_1043 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        if ( A < B + C && B < A + C && C < A + B){
            double perimetro = A + B + C;
            System.out.println("Perimetro = " + df.format(perimetro));
        }else{
            double area = ((A + B) * C) / 2;
            System.out.println("Area = " + df.format(area));
        }
    }
}
