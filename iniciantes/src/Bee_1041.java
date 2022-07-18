import java.util.Scanner;

public class Bee_1041 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double eixoX = input.nextDouble();
        double eixoY = input.nextDouble();

        if (eixoX == 0 || eixoY == 0) {
            if (eixoY != 0) {
                System.out.println("Eixo Y");
            } else if (eixoX != 0) {
                System.out.println("Eixo X");
            } else {
                System.out.println("Origem");
            }
        }else if(eixoX > 0){
            if(eixoY > 0){
                System.out.println("Q1");
            }else{
                System.out.println("Q4");
            }
        }else if (eixoX < 0) {
            if(eixoY > 0){
                System.out.println("Q2");
            }else{
                System.out.println("Q3");
            }
        }
    }
}
