import java.util.Scanner;

public class Bee_1042 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numUm = input.nextInt();
        int numDois = input.nextInt();
        int numTres = input.nextInt();

        if (numUm < numDois && numUm < numTres){
            System.out.println(numUm);
            if(numDois < numTres){
                System.out.println(numDois);
                System.out.println(numTres);
            }else{
                System.out.println(numTres);
                System.out.println(numDois);
            }
        } else if (numDois < numUm && numDois < numTres) {
            System.out.println(numDois);
            if(numTres < numUm){
                System.out.println(numTres);
                System.out.println(numUm);
            }else{
                System.out.println(numUm);
                System.out.println(numTres);
            }
        }else{
            System.out.println(numTres);
            if(numUm < numDois){
                System.out.println(numUm);
                System.out.println(numDois);
            }else{
                System.out.println(numDois);
                System.out.println(numUm);
            }
        }
        System.out.println("\n" + numUm);
        System.out.println(numDois);
        System.out.println(numTres);
    }
}
