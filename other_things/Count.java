package other_things;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int n[] = {0,1,2,3,4,5,6,7,8,9,8};
        Arrays.sort(n);
        boolean isDuplicate = false;
        for (int i = 0; i <= n.length-2; i++){
            if(n[i]==n[i+1]){
                System.out.println("true");
                isDuplicate = true;
                break;
            }
        }
        if(isDuplicate == false){
            System.out.println("false");
        }
    }
}
