package com.vaibhav.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};

        int [] result = rotateByK(arr, 3);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rotateByK(int[] arr, int k) {
        int[] result = new int[arr.length];

        int j = 0;
        for(int i = k+1; i < arr.length; i++){
            result[j++] = arr[i];
        }

        int m = 0;
        for(int i = j; i < arr.length; i++){
            result[i] = arr[m++];
        }

        return result;
    }
    
}
