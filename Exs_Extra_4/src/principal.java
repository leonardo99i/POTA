import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        int qntLampadas = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de lâmpadas?"));
        boolean lampadas[] = new boolean[qntLampadas];

        for(int i = 0; i < lampadas.length; i++){
            lampadas[i] = false;
        }

        for(int i = 1; i <= qntLampadas; i++){
            for(int j = 0; j < lampadas.length; j++){
                if((j + 1) % i == 0){
                    lampadas[j] = !lampadas[j];
                }
            }
        }

        String saida = "[";
        for(int i = 0; i < lampadas.length; i++){
            if(i == lampadas.length - 1){
                if(lampadas[i]){
                    saida += "On, ";
                }else{
                    saida += "Off, ";
                }
            }else{
                if(lampadas[i]){
                    saida += "On, ";
                }else{
                    saida += "Off, ";
                }
            }
        }
        saida += "]";
        JOptionPane.showInputDialog(null, saida);
    }
}