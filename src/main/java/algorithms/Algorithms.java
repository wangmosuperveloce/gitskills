package algorithms;

import java.math.BigDecimal;

/**
 * Created by wangmo on 16/9/18.
 */
public class Algorithms {

    public static void quicksort(Comparable[] array, int start, int end){
        int pos = partition(array, start, end);
        if(start < pos-1) quicksort(array, start, pos-1);
        if(pos+1 < end) quicksort(array, pos+1, end);
    }

    private static int partition(Comparable [] array, int start, int end){
        if(start == end) return start;
        int i = start;     //
        int j = start + 1;
        Comparable pivot = array[start];
        while (j <= end) {
            if (array[j].compareTo(pivot) < 0) {
                // swap i+1 and j, inc i,j
                Comparable temp = array[i+1];
                array[i+1] = array[j];
                array[j] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }
        // swap start,i
        Comparable temp = array[i];
        array[i] = array[start];
        array[start] = temp;
        return i;
    }


    // Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

//    For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

    public int numSquares(int n) {

        return 0;
    }



    public static void main(String []args){
        String[] array = new String[]{"a","c","b","e","d"};
        quicksort(array, 0, 4);
        for(String s:array){
            System.out.println(s);
        }
        Integer[] arr2 = new Integer[]{57, 68, 59, 52, 72, 28, 96, 33, 24};
        quicksort(arr2, 0, arr2.length-1);
        for(Integer i:arr2){
            System.out.println(i);
        }

        BigDecimal decimal = new BigDecimal("0.13");
        decimal = decimal.divide(new BigDecimal("100"));
        System.out.println(decimal);
    }

}
