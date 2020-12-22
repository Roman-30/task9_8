package ru.vsu.cs.task_9.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static List<Integer> sortTheSheet(List<Integer> list) {
        int j = -1;
        int num;
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) < 0) {
                j++;
                num = list.get(i);
                list.remove(i);
                list.add(j, num);
                if (i != 0) i--;
            }
            i++;
        }
        return list;
    }

    public static ArrayList<Integer> setArrayList(int[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j : arr) {
            numbers.add(j);
        }
        return numbers;
    }
}
