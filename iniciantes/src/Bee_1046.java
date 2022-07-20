import java.util.Scanner;

public class Bee_1046 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int diaInicial = horaInicial ;
        int diaFianl = horaFinal;
        int tempoJogo;

        if(diaInicial < diaFianl){
            tempoJogo = diaFianl - diaInicial;
        }else{
            tempoJogo = (24 - diaInicial) + diaFianl;
        }

        System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
    }
}
