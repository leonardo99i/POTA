public class contagem {
    if(n==0){
        System.out.println("boas férias");
    }else{
        System.out.println(n);
        contagem(n-1);
    }

    public static void main(String[] args) {
        contagem(10);
    }
}



