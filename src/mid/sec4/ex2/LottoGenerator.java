package mid.sec4.ex2;

import java.util.Random;

public class LottoGenerator {

    public int[] generator(){
        int[] arr = new int[6];
        Random random = new Random();

        for (int i = 0; i<arr.length; i++){
            arr[i] = random.nextInt(1, 45);

            for (int j = 0; j<i; j++){
                if (arr[i] == arr[j]){
                    i--;
                }
            }
        }
        return arr;
    }

    public boolean checkNum(){
        return false;
    }
}
