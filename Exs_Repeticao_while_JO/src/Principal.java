
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        System.out.println(numero + "");

        while(numero <= 100){
            numero = numero * 3;
            System.out.println(numero + "  ");
        }
    }
}
