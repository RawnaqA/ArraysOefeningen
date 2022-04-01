package be.intecbrussl;

import java.util.Random;

public class Oefeningen2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[15];


            int n = 1;


            System.out.println("Original array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i]=random.nextInt(200);
                System.out.print(arr[i] + " ");
            }


            for (int i = 0; i < n; i++) {
                int j, last;

                last = arr[arr.length - 1];

                for (j = arr.length - 1; j > 0; j--) {

                    arr[j] = arr[j - 1];
                }

                arr[0] = last;
            }

            System.out.println();

            System.out.println("Array after right rotation: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }




            }
        }



