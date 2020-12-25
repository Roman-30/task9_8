package ru.vsu.cs.task_9.gui.view;

import ru.vsu.cs.task_9.gui.listener.SaveButtonListener;
import ru.vsu.cs.task_9.gui.listener.SortButtonListener;

import javax.swing.*;

public class MainWindowElements extends JFrame{
    private JPanel mainPanel;
    private JTextField inputData;
    private JTextField outputData;
    private JButton sortButton;
    private JButton saveButton;

    public MainWindowElements() {
        setTitle("Task_9");
        setVisible(true);
        setBounds(400,250,800,175);
        setContentPane(mainPanel);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        sortButton.addActionListener(new SortButtonListener(inputData, outputData));
        saveButton.addActionListener(new SaveButtonListener(outputData));
    }
}
