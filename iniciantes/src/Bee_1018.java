import java.util.Scanner;

public class Bee_1018 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cedulas = input.nextInt();
        int resto;

        System.out.println(cedulas);

        if(cedulas > 99){
            resto = cedulas / 100;
            System.out.printf("%d nota(s) de R$ 100,00\n",resto);
            cedulas = cedulas - resto * 100;
        }else{
            System.out.printf("0 nota(s) de R$ 100,00\n");
        }

        if(cedulas > 49){
            resto = cedulas / 50;
            System.out.printf("%d nota(s) de R$ 50,00\n",resto);
            cedulas = cedulas - resto * 50;
        }else{
            System.out.printf("0 nota(s) de R$ 50,00\n");
        }

        if(cedulas > 19){
            resto = cedulas / 20;
            System.out.printf("%d nota(s) de R$ 20,00\n",resto);
            cedulas = cedulas - resto * 20;
        }else{
            System.out.printf("0 nota(s) de R$ 20,00\n");
        }

        if(cedulas > 9){
            resto = cedulas / 10;
            System.out.printf("%d nota(s) de R$ 10,00\n",resto);
            cedulas = cedulas - resto * 10;
        }else{
            System.out.printf("0 nota(s) de R$ 10,00\n");
        }

        if(cedulas > 4){
            resto = cedulas / 5;
            System.out.printf("%d nota(s) de R$ 5,00\n",resto);
            cedulas = cedulas - resto * 5;
        }else{
            System.out.printf("0 nota(s) de R$ 5,00\n");
        }

        if(cedulas > 1){
            resto = cedulas / 2;
            System.out.printf("%d nota(s) de R$ 2,00\n",resto);
            cedulas = cedulas - resto * 2;
        }else{
            System.out.printf("0 nota(s) de R$ 2,00\n");
        }

        if(cedulas > 0){
            resto = cedulas / 1;
            System.out.printf("%d nota(s) de R$ 1,00\n",resto);
        }else{
            System.out.printf("0 nota(s) de R$ 1,00\n");
        }
    }
}
