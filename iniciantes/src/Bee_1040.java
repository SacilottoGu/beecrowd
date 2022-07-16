import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee_1040 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = input.nextDouble();
        double N2 = input.nextDouble();
        double N3 = input.nextDouble();
        double N4 = input.nextDouble();

        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;

        System.out.println("Media: " + df.format(media));

        if(media > 6) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            double notaExame = input.nextDouble();
            double notaFinal = (media + notaExame) / 2;

            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + df.format(notaExame));

            if(notaFinal > 4){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + df.format(notaFinal));

        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
