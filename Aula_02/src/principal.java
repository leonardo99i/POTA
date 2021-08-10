import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        System.out.println("Digite um número positivo: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        System.out.println("O somatorio é: " + somatorio(numero));
        System.out.println("O somatorio é: " + somaRecursiva(numero));
    }

    private static int somatorio(int numero) {
        int soma = 0;
        for(int i = 1; i <= numero; i++){
            soma += i;
        }
        return soma;
    }

    public static int somaRecursiva(int numero){
        if(numero > 1){
            return numero + somaRecursiva(numero - 1);
        }else{
            return numero;
        }
    }
}
