package be.intecbrussl;

import java.util.Random;

public class Oefeningen1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }

        int min1 = array[0];
        int min2 = 100000;
        for (int i =0; i<array.length; i++){
            if(array[i] < min1){
                min2 = min1;
                min1 = array[i];
            }else  if (array[i] < min2 && array[i]>min1){
                min2 = array[i];
            }
        }
        System.out.println("min1 is" +" "+  min1);
        System.out.println("min2 is" + " "+ min2 );


        }

    }
