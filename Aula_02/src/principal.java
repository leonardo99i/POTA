import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        System.out.println("Digite um número positivo: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        System.out.println("O somatorio é: " + somatorio(numero));
    }

    private static int somatorio(int numero) {
        int soma = 0;
        for(int i = 1; i <= numero; i++){
            soma += i;
        }
        return soma;
    }
}
