import java.util.Scanner;

public class par {
    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        int numero = 0, lixo2;
        String lixo;
        char outro;

        do {
            do {

                System.out.print("Digite um Numero: ");
                if (resp.hasNextInt()) {
                    numero = resp.nextInt();
                    lixo = "b";
                } else {
                    System.out.println("DIGITE UM NUMERO VALIDO!");
                    System.out.println();
                    resp.next();
                    lixo = "a";
                }

            } while (lixo.equals("a"));

            if (numero % 2 == 0)
                System.out.println("Par");
            else
                System.out.println("Impar");

            do {

                System.out.println("Deseja verificar outro numero? (S/N)");
                outro = resp.next().charAt(0);

                if(outro != 'S' && outro != 's' && outro != 'N' && outro != 'n')
                {
                    System.out.println("COLOQUE S OU N");
                    lixo2 = 1;

                }
                else
                    lixo2 = 2;

            }while(lixo2 == 1);



        }while(outro == 'S' || outro == 's');
    }
}