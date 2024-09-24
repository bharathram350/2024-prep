import java.util.Scanner;

public class Main {

    public static int maximum(int[] array){
        int maxi = Integer.MIN_VALUE;
        for(int i =0 ; i<array.length; i++){
            if(array[i]>maxi){
                maxi = array[i];
            }
        }

        return maxi;
    }

    public static int minimum(int[] array){
        int mini = Integer.MAX_VALUE;
        for(int i =0 ; i<array.length; i++){
            if(array[i]<mini){
                mini = array[i];
            }
        }

        return mini;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,12,11,2,3,43,-4,-3,67,32};
        System.out.println(" Maximum of the array : " + maximum(arr));
        System.out.println(" Minimum of the array : "+ minimum(arr));
    }
}