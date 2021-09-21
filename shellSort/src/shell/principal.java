package shell;

public class principal {
    public static void main(String[] args) {
        Integer[] nums = {62, 31, 13, 61, 15, 44, 38, 92, 41, 61, 66, 31, 49, 91, 51, 26, 84, 79, 78, 67, 44, 52, 19};

        shellSort(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i] + " ");
        }
    }

    public static void shellSort(Integer[] nums){
        int i, j, temp;
        boolean troca;
        int intervalo = nums.length/2;

        while(intervalo > 0){
            i = intervalo;
            while(i < nums.length){
                temp = nums[i];
                troca = false;
                j = i - intervalo;
                while(j >= 0 && nums[j] > temp){
                    nums[j+intervalo] = nums[j];
                    troca = true;
                    j -= intervalo;
                }
                if(troca){
                    nums[j+intervalo] = temp;
                }
                i++;
            }
            intervalo /=2;
        }
    }
}