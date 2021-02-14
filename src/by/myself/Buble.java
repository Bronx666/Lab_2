package by.myself;

import java.util.Arrays;
import java.util.Random;

public class Buble {

    public  void arr () {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length - 1; i++) {

            array[i] = random.nextInt(100 + 1);

        }

        System.out.println(Arrays.toString(array));

        boolean ind = false;
        int buf;
        while(!ind) {
            ind = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    ind = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
