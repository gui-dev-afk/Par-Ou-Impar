import java.util.Scanner;

public class par {
    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        int numero;

        System.out.print("Digite um Numero: ");
        numero = resp.nextInt();

        if (numero % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");
    }
}