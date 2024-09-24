// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique
// element appears at most twice. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead
// have the result be placed in the first part of the array nums. More formally,
// if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
// It does not matter what you leave beyond the first k elements.


import java.util.Arrays;

public class Main {
    public static int[] removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        int[] unq = Arrays.copyOfRange(nums, 0,i);
        return unq;
    }

    public static void main(String[] args) {

        int[] arr = { 1,1,2,2,2,3,3,4,4,4,5,6,6,6,6,7,7};
        //print the array of function
        int[] ans = removeDuplicates(arr);
        System.out.println(Arrays.toString(ans));
    }
}