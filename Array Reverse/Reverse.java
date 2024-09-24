/*
 * Problem Statement:
 *
 * Write a method that takes an array of integers and returns a new array where
 * the elements of the input array are in reverse order.
 * The method should not modify the original array.
 *
 * Method:
 * - public static int[] reverse(int[] array): This method takes an integer array as input
 *   and returns a new integer array where the elements are in reverse order.
 *
 * Example:
 * Input: {1, 23, 4, 5, 6}
 * Output: {6, 5, 4, 23, 1}
 *
 * Approach:
 * - A new array 'reversedArray' is created with the same length as the input array.
 * - We iterate through the input array and assign elements to the 'reversedArray' in reverse order.
 * - The reversed array is then returned.
 */

import java.util.*;
public class Reverse {

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - i - 1] = array[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 23, 4, 5, 6 };

        // Printing the reversed array
        System.out.println(Arrays.toString(reverse(arr)));
    }
}