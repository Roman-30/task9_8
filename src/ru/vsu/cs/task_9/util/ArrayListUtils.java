package ru.vsu.cs.task_9.util;

import java.util.ArrayList;

public class ArrayListUtils {

    public static ArrayList<Integer> setArrayList(int[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j : arr) {
            numbers.add(j);
        }
        return numbers;
    }
}
