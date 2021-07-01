package edu.solution.goncharova.data_structures;

import java.util.Arrays;

public class ItemsPossessed {

    private static final int TERMINATION_NUMBER = -1;
    static int array[] = {1,2,4,3,6,5,-1,1,6,3,7,8,-1};

    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (array[i] != TERMINATION_NUMBER) {
            i++;
            count++;
        }
        int[] arrayA = new int[count];
        // System.out.println(count);
        int[] arrayC = new int[count + 1];

        i++;
        count = 0;
        while (array[i] != TERMINATION_NUMBER) {
            i++;
            count++;
        }
        int[] arrayB = new int[count];
        // System.out.println(count);

        i = 0;
        while (array[i] != TERMINATION_NUMBER) {
            arrayA[i] = array[i];
            i++;
        }
      //  System.out.println(Arrays.toString(arrayA));
        i++;
        count = 0;
        while (array[i] != TERMINATION_NUMBER) {
            arrayB[count] = array[i];
            i++;
            count++;
        }
       // System.out.println(Arrays.toString(arrayB));

        for (i = 0; i < arrayA.length; i++) {
            for (int k = 0; k < arrayB.length; k++) {
                if (arrayA[i] == arrayB[k]) {
                    arrayC[i] = 1;
                break;
                } else {
                    arrayC[i] = 0;
                }
            }
        }
            arrayC[i]=TERMINATION_NUMBER;
            System.out.println(Arrays.toString(arrayC));
    }
}
