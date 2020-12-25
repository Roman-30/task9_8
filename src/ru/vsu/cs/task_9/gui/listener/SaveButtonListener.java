package ru.vsu.cs.task_9.gui.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SaveButtonListener implements ActionListener {

    JTextField outputData;

    public SaveButtonListener(JTextField outputData) {
        this.outputData = outputData;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            FileWriter fileWriter = new FileWriter("answer.txt");
            fileWriter.write(outputData.getText());
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
