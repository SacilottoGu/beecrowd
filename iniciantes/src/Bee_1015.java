import java.util.Scanner;

public class Bee_1015 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double [] X = new double[2];
        double [] Y = new double[2];

        for(int i = 0; i < X.length ; i++){
            X[i] = input.nextDouble();
            Y[i] = input.nextDouble();
        }

        double distanciaXY = Math.sqrt(Math.pow(X[1] - X[0], 2) + Math.pow(Y[1] - Y[0], 2));

        System.out.printf("%.4f\n",distanciaXY);
    }
}
