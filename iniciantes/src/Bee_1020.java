import java.util.Scanner;

public class Bee_1020 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idadeDias = input.nextInt();
        int anos = idadeDias / 365;
        int meses = (idadeDias % 365) / 30;
        int dias = (idadeDias % 365) % 30;

        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n" ,meses );
        System.out.printf("%d dia(s)\n", dias);
    }
}
