import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperatura[] = new double[7];
        char resposta;
        do{
            double media = 0;
            for(int i = 0; i < temperatura.length; i++){
                System.out.println("Digite a temperatura da posição " +i);
                temperatura[i] = entrada.nextDouble();
                media += temperatura[i];
            }
            media /= temperatura.length;
            System.out.println("A média das temperaturas é: " + media);
            System.out.println("Deseja calcular a média de outros valores? (s/n)");
            resposta = entrada.next().charAt(0);

        }while(resposta == 's');
    }
}
