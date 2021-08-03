import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        String Nome_1 = " ";
        String Nome_2 = " ";
        int idade_1;
        int idade_2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Digite seu nome!! ");
        Nome_1 = entrada.nextLine();
        System.out.println("2 - Digite seu nome!! ");
        Nome_2 = entrada.nextLine();
        System.out.println("1 - Digite sua idade!! ");
        idade_1 = entrada.nextInt();
        System.out.println("2 - Digite sua idade!! ");
        idade_2 = entrada.nextInt();

        if(idade_1 > idade_2){
            System.out.println(Nome_1 + " É a mais velha!");
        }else{
            System.out.println(Nome_2 + " É a mais velha!");
        }
    }
}
