import java.util.Scanner;

public class Bee_1005 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        double correcaoPesoNota = 10.0 / 11.0 ;

        double A = input.nextDouble();
        double B = input.nextDouble();
        double MEDIA = (A * 0.35 + B * 0.75) * correcaoPesoNota ;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }
}
