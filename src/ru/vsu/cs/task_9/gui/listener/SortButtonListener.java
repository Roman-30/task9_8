package ru.vsu.cs.task_9.gui.listener;

import ru.vsu.cs.task_9.util.ListUtils;
import ru.vsu.cs.task_9.util.ArrayUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SortButtonListener implements ActionListener {
    JTextField textField1;
    JTextField textField2;

    public SortButtonListener(JTextField textField1, JTextField textField2) {
        this.textField1 = textField1;
        this.textField2 = textField2;
    }

    public void actionPerformed(ActionEvent e) {
        int[] arr = ArrayUtils.toIntArray(textField1.getText());
        List<Integer> list = ListUtils.setArrayList(arr);
        textField2.setText(String.valueOf(ListUtils.sortTheSheet(list)));
    }
}
