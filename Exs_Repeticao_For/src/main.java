import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n, soma = 0;

        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();

        for(int i = 1; i <= n; i++){
            soma = soma + i;
        }
        System.out.println("A soma é igual a " + soma);
    }
}
