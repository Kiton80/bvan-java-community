package com.bvan.jc.chat1.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class JavaSorting {

    public static void main(String[] args) {
        int[] array = {10, 5, 20, -30};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        List<Integer> list = Arrays.asList(10, 5, 20, -30);
        Collections.sort(list);
        System.out.println(list);
    }
}
