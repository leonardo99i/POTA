import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int impares[] = new int[10];
        int valor = 1;
        for(int i = 0; i < impares.length; i++){
            impares[i] = valor;
            valor +=2;
        }
        for(int impar: impares){
            System.out.println(impar);
        }
    }
}
