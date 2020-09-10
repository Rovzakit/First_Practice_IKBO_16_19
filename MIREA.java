package com.example.mirea;

import java.util.Random;

public class MIREA {
    public static void main(String[] args){
        ////////////////////////task 3////////////////////////
        /*
        int[] arr = new int[10];
        int sum = 0;
        Random rnd = new Random();
        for(int i = 0; i < 10; i++) arr[i] = rnd.nextInt(10);
        for(int i = 0; i < 10; i++) sum += arr[i];
        System.out.println(sum);
        sum = 0;
        int j = -1;
        while(++j < 10) sum += arr[j];
        System.out.println(sum);
        sum = 0;
        j = 0;
        do{
            sum += arr[j];
        }
        while (++j < 10);
        System.out.println(sum);

         */
        ////////////////////////task 4////////////////////////
        /*
        for (String str : args) {
            System.out.println(str);
        }

         */
        ////////////////////////task 5////////////////////////
        /*
        for(int i = 1; i <= 10; i++) System.out.println(((int)((1.0/i)*100))/100.0);

         */
        ////////////////////////task 6////////////////////////
        /*
        Random rnd = new Random();
        int a;
        int[] arr = new int [10];
        for(int i = 0; i < 10; i++){
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 10; j++){
                if(arr[j] < arr[i]){
                    a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for(int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        ////
        System.out.println();
        for(int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 10; j++){
                if(arr[j] < arr[i]){
                    a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for(int i = 0; i < 10; i++) System.out.print(arr[i] + " ");

         */
        ////////////////////////task 7////////////////////////
        /*
        System.out.println(Fact(4));

         */
    }

    public static int Fact(int N){
        return N > 1 ? N * Fact(N - 1) : 1;
    }
}
