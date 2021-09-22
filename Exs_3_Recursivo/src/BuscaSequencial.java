public class BuscaSequencial {
    public static void main(String[] args) {
        int[] vetor = {9, 15, 7, 18, 23, 1, 75, 14, 54, 17, 21};
        int indice = buscaSequencial(vetor, 2, 0);
        System.out.println(indice);
    }

    private static int buscaSequencial(int[] vetor, int elemento, int i) {
        if (i > vetor.length - 1) {
            return -1;
        }else if(elemento != vetor[i]){
            return buscaSequencial(vetor, elemento, i + 1);
        }else{
            return i;
        }
    }
}
