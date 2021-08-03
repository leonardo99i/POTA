import javax.swing.*;
public class principal {
    public static void main(String[] args) {
        int primeiraIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira idade!"));
        int segundaIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda idade!"));

        if(primeiraIdade > segundaIdade){
            JOptionPane.showMessageDialog(null, primeiraIdade);
        }else if (segundaIdade > primeiraIdade){
            JOptionPane.showMessageDialog(null, segundaIdade);
        }else{
            JOptionPane.showMessageDialog(null, "Idades Iguais!!");
        }
    }
}