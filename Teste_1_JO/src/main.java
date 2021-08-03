import javax.swing.*;
public class main {
    public static void main(String[] args) {
        String saida = "";
        String entrada = JOptionPane.showInputDialog("Digite um número:");
        int i = Integer.parseInt(entrada);
        if(i % 2 == 0){
            saida += "Número é PAR";
        }
        else{
            saida += "Número é IMPAR";
        }
        JOptionPane.showMessageDialog(null,"Valor: "+saida,"Testa numero",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}