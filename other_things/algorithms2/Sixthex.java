package other_things.algorithms2;


public class Sixthex {
    public static void main(String[] args) {
        boolean isRight = false;
        int[][] array = {
                {1, 1},
                {2, 2},
                {3, 4},
                {4, 5},
                {5, 6},
                {7, 7}
        };

        for  (int i = 0; i < array.length-2; i++) {

            int xi = array[i+2][0];
            int yi = array[i+2][1];
            if((array[i+1][1]-array[i][1])*(xi-array[i][0])==(yi-array[i][1])*(array[i+1][0]-array[i][0])){
                isRight = true;
                continue;
            }else{
                isRight = false;
                break;
            }

        }
        if(isRight){
            System.out.println("Right");
        }else{
            System.out.println("Wrong");
        }

    }
}
