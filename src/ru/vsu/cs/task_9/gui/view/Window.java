package ru.vsu.cs.task_9.gui.view;

import ru.vsu.cs.task_9.gui.listener.SaveButtonListener;
import ru.vsu.cs.task_9.gui.listener.SortButtonListener;

import javax.swing.*;

public class Window extends JFrame{
    private JPanel mainPanel;
    private JTextField inputData;
    private JTextField outputData;
    private JButton button1;
    private JButton button2;

    public Window() {
        setTitle("Task_9");
        setVisible(true);
        setBounds(400,250,800,175);
        setContentPane(mainPanel);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button1.addActionListener(new SortButtonListener(inputData, outputData));
        button2.addActionListener(new SaveButtonListener(outputData));
    }
}
