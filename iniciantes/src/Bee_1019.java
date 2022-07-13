import java.time.Duration;
import java.util.Scanner;

public class Bee_1019 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        Duration total = Duration.ofSeconds(N);

        System.out.printf("%d:%d:%d\n",N/3600,total.toMinutesPart(),total.toSecondsPart());
    }
}
