import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        System.out.println("Digite um numero positivo: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        long inicioRecursivo = System.currentTimeMillis();
        System.out.println(fibonnaciRecursivo(numero));
        long finalRecursivo = System.currentTimeMillis();
        System.out.println("Tempo em Milisegundos do Fibonnaci Recursivo = " + (finalRecursivo - inicioRecursivo));

    }

    public static int fibonnaciRecursivo(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return fibonnaciRecursivo(numero - 1) + fibonnaciRecursivo(numero - 2);
        }
    }

    private static int fibonacciIterativo(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            int penultimo = 0, ultimo = 1, atual = 0;
            for (int i = 2; i <= numero; i++) {
                atual = penultimo + ultimo;
                penultimo = ultimo;
                ultimo = atual;
            }
            return atual;
        }
    }
}

