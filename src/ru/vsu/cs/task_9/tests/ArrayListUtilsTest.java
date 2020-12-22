package ru.vsu.cs.task_9.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.task_9.logic.SorterNumber;
import ru.vsu.cs.task_9.util.ArrayListUtils;

import java.util.List;

public class ArrayListUtilsTest {

    @Test
    public void sortTheSheet1() {
        List<Integer> list = SorterNumber.sortTheSheet(ArrayListUtils.setArrayList(new int[]{1, 2, -1, 2, -2, 3, -3, 4, -4, 5, -5, 6, -6, 7, -7, 8, -8, 9, -9, 10, -10}));
        List<Integer> workResult = ArrayListUtils.setArrayList(new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Assert.assertEquals(workResult, list);
    }

    @Test
    public void sortTheSheet2() {
        List<Integer> list = SorterNumber.sortTheSheet(ArrayListUtils.setArrayList(new int[]{1, 2, -2, -4, -3, 2, 3, 4}));
        List<Integer> workResult = ArrayListUtils.setArrayList(new int[]{-2, -4, -3, 1, 2, 2, 3, 4});
        Assert.assertEquals(workResult, list);
    }

    @Test
    public void sortTheSheet3() {
        List<Integer> list = SorterNumber.sortTheSheet(ArrayListUtils.setArrayList(new int[]{1, 2, -2, -3, 2, 3, 4, -6, 3, 7, 1, 3, 0, 9}));
        List<Integer> workResult = ArrayListUtils.setArrayList(new int[]{-2, -3, -6, 1, 2, 2, 3, 4, 3, 7, 1, 3, 0, 9});
        Assert.assertEquals(workResult, list);
    }

    @Test
    public void sortTheSheet4() {
        List<Integer> list = SorterNumber.sortTheSheet(ArrayListUtils.setArrayList(new int[]{1, 2, 3, 4, 5, 6, -1, -2, -3, -4, -5, -6}));
        List<Integer> workResult = ArrayListUtils.setArrayList(new int[]{-1, -2, -3, -4, -5, -6, 1, 2, 3, 4, 5, 6});
        Assert.assertEquals(workResult, list);
    }
}