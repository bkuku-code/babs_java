package com.CaptainCook;

public class Multidimentional {
    public static void main(String[] args) {
        int[][] values = { { 2, 3, 5 }, { 0, 5, 9 }, { 1, 2, 1 } };

        System.out.println("Elements are :");
        for(int i=0; i< values.length; i++) {
            for(int j=0; j< values[i].length; j++) {
                System.out.print(values[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    }
