package arraynozero2;

import java.util.Arrays;

/**
 *
 * @author nemanja
 */
public class ArrayNoZero2 {

    public static void main(String[] args) {
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int num = 0;
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[num++] = array[i];
            }
        }
        int[] arrp = new int[num];
        System.arraycopy(array, 0, arrp, 0, num);
        System.out.println(Arrays.toString(arrp));
    }

}
