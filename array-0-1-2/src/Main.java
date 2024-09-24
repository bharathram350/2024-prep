//Given array which consists of only 0,1,2 sort the array without using sorting algo.


import java.util.Arrays;

public class Main {
    public static void sort(int[] arr) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zero++;
            }
            else if(arr[i] == 1) {
                one++;
            }
            else {
                two++;
            }
        }
        int i = 0;
        while(zero!=0){
            arr[i++] = 0;
            zero--;
        }
        while(one!=0){
            arr[i++] = 1;
            one--;
        }
        while(two!=0){
            arr[i++] = 2;
            two--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,0,2,2,0,1,1,2,0,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}