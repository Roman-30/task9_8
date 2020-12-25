package ru.vsu.cs.task_9.gui.listener;

import ru.vsu.cs.task_9.logic.SorterNumber;
import ru.vsu.cs.task_9.util.ArrayListUtils;
import ru.vsu.cs.task_9.util.ArrayUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SortButtonListener implements ActionListener {
    JTextField inputData;
    JTextField outputData;

    public SortButtonListener(JTextField inputData, JTextField outputData) {
        this.inputData = inputData;
        this.outputData = outputData;
    }

    public void actionPerformed(ActionEvent e) {
        int[] arr = ArrayUtils.toIntArray(inputData.getText());
        List<Integer> list = ArrayListUtils.setArrayList(arr);
        outputData.setText(String.valueOf(SorterNumber.sortTheSheet(list)));
    }
}
