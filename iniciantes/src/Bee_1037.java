import java.util.Scanner;

public class Bee_1037 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorEntrada = input.nextDouble();

        if(valorEntrada >= 0 && valorEntrada <= 25){
            System.out.println("Intervalo [0,25]");
        } else if (valorEntrada >25 && valorEntrada <= 50) {
            System.out.println("Intervalo (25,50]");
        }else if (valorEntrada >50 && valorEntrada <= 75) {
            System.out.println("Intervalo (50,75]");
        }else if (valorEntrada >75 && valorEntrada <= 100) {
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
