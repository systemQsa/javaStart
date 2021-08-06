package com;

import java.util.Arrays;

public class Algo {
    private static int max;
    private static int min;

    public  static void allEvenNumbers(int [] array){
        for(int i=0;i< array.length;i++){
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }
    }

    public static void allOddNumbers(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
    }

    public static void aliquot(int[] array){
        for (int number:array) {
            if(number%3==0 || number%9==0) System.out.println(number);
        }
    }

    public static void allNotRepeatThreeDigit(int[] array){

        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
            int digit = array[i];
            int count = (array[i]==0) ? 1 : 0;
            while(array[i]!=0){
                count++;
                array[i]/=10;
            }
            if (count==3){
                //System.out.println(digit);
                int[] temp = new int[3];
                for (int j=0;j<3;j++){
                    temp[j] = digit%10;
                    digit/=10;
                }
                int flag = 0;
                for (int j=0;j<2;j++){
                    for (int q=j+1;q<3;q++){
                        if (temp[j] == temp[q]){
                            System.out.println("have same digits");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 1){
                        break;
                    }
                }
                if (flag == 0){
                    System.out.println("no repeat numbers");
                }
            }else {
                System.out.println("not 3 Numbers");
            }
        }
    }

    public static boolean isPrimeOrNot(int number){
        if(number<2) return false;
        if(number%2==0) return number==2;
        if(number%3==0) return number==3;
        for(int i=5;i*i<=number;i++){
            if(number%i==0 || number%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void ascendingOrder(int[] array){

        for(int i=array.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                int temp;
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void descendingOrder(int[] array){
        for(int i=array.length-1;i>0;i--){
            int temp;
            for(int j=0;j<i;j++){
                if(array[j] < array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static int isPalindrome(int number) {
        int temp = 0;
        while(number!=0){
            temp = temp*10 + number%10;
            number/=10;
        }
        return temp;
    }

    public static void shortestNumber(int[] array){

        int min;
        String[] mas = new String[array.length];
        for (int i=0;i<array.length;i++){
            mas[i] = Integer.toString(array[i]);
        }

        min = mas[0].length();
        for (String number: mas) {
            if(min >number.length()){
                min = number.length();
            }
        }
        // System.out.print(min);
        for (String number: mas) {
            if(min == number.length()){
                System.out.println("Shortest number: " + number);
            }
        }

    }

    public static void longestNumber(int[] array){
        int max;
        String[] mas = new String[array.length];
        for (int i=0;i<array.length;i++){
            mas[i] = Integer.toString(array[i]);
        }

        max = mas[0].length();
        for (String number: mas) {
            if(max < number.length()){
                max = number.length();
            }
        }
        // System.out.print(min);
        for (String number: mas) {
            if(max == number.length()){
                System.out.println("Longest number: " + number);
            }
        }
    }

    public static void findMaxValue(int[] array){
        max = array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Max value : " + max);

    }

    public static void findMinValue(int[] array){
        min = array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Min value : " + min);
    }

    public static void sortAscendingByLength(int[] array) {
        String temp;
        String[] mas = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            mas[i] = Integer.toString(array[i]);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            for (int j=i+1;j< mas.length;j++){
                if(mas[i].length() > mas[j].length()){
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        for (String item:mas) {
            System.out.println(item);
        }
    }

    public static void sortDescendingByLength(int[] array){
        String temp;
        String[] mas = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            mas[i] = Integer.toString(array[i]);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            for (int j=i+1;j< mas.length;j++){
                if(mas[i].length() < mas[j].length()){
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        for (String item:mas) {
            System.out.println(item);
        }
    }

    public static void palindrome(int[] array){
        for (int number:array) {
            int temp = isPalindrome(number);
            if(number == temp){
                System.out.println(number);
            }
        }
    }

    public static void isPrime(int[] array){
        for (int number:array) {
            boolean temp = isPrimeOrNot(number);
            if (temp){
                System.out.println(number);
            }
        }
    }

}

