public class principal {
    public static void main(String[] args) {
        int vetor[] = {9, 15, 7, 18, 23, 1, 75, 14, 54, 17, 21};
        int indice = buscaSequencial(vetor, 21);
        System.out.println(indice);
    }

    private static int buscaSequencial(int[] vetor, int elemento){
        for(int i = 0; i < vetor.length; i++){
            if(elemento == vetor[i]){
                return i;
            }
        }
        return -1;
    }
}
