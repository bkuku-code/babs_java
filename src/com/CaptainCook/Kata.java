package com.CaptainCook;

public class Kata {

    public static int findMaxSum(int[] array) {
        int sum = getSum(array);

        int largestSum = sum - array[0];
        int largestSoFar = 0;
        for (int i = 0; i < array.length; i++) {
            largestSoFar = sum - array[i];
            if(largestSoFar > largestSum) {
                largestSum = largestSoFar;
            }
        }

        return largestSum;
    }

    public static int findMinSum(int[] array) {
        int sum = getSum(array);

        int smallestSum = sum - array[0];
        int smallestSoFar = 0;
        for (int i = 0; i < array.length; i++) {
            smallestSoFar = sum - array[i];
            if(smallestSoFar < smallestSum) {
                smallestSum = smallestSoFar;
            }
        }

        return smallestSum;
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
