public class principal {
    public static void main(String[] args) {
        int entrada = alg5(4,6);
        System.out.println(entrada);
    }

    public static int alg5(int n, int k){
        if(n == 0){
            return 0;
        }else{
            return alg5(n-1,k) + k;
        }
    }
}
