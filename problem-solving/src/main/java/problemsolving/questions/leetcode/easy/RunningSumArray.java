package problemsolving.questions.leetcode.easy;

import java.util.Arrays;

class RunningSumArray {

    public static void main(String [] args) {
        int [] arr = new int []  {
                2, 3, 7, 9, 1
        };
        int [] res = getRunningSumArray(arr);
        System.out.println(Arrays.toString(res));
    }

    /**
     *
     * @param arr
     * @return
     */
    static int [] getRunningSumArray(int [] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
            arr[i] = sum;
        }
        return arr;
    }

}
