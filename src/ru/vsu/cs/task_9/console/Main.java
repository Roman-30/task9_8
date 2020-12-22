package ru.vsu.cs.task_9.console;

import ru.vsu.cs.task_9.logic.SorterNumber;
import ru.vsu.cs.task_9.util.ArrayListUtils;
import ru.vsu.cs.task_9.util.ArrayUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] arr = readFile();
        List<Integer> numbers = ArrayListUtils.setArrayList(arr);

        System.out.println("Source array: \n" + numbers);
        SorterNumber.sortTheSheet(numbers);
        System.out.println("Sorted array \n" + numbers);
        writeFile(numbers);
    }

    public static int[] readFile() throws IOException {
        FileReader fileReader = new FileReader(readSomething("Enter file name : "));
        Scanner scanner = new Scanner(fileReader);
        String num = scanner.nextLine();
        fileReader.close();
        return ArrayUtils.toIntArray(num);
    }

    public static void writeFile(List<Integer> list) throws IOException {
        FileWriter fileWriter = new FileWriter("answer.txt");
        fileWriter.write(String.valueOf(list));
        fileWriter.close();
    }

    public static String readSomething(String name) {
        Scanner scn = new Scanner(System.in);
        System.out.print(name);
        return scn.nextLine();
    }
}

