
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int Soma = A + B;

        System.out.println("Soma = " + Soma);

        input.close();

    }
}
