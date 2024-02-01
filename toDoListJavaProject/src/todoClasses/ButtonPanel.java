package todoClasses;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel{

    private JButton addTask;
    private JButton clearTasks;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,60));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));

        clearTasks = new JButton("Clear Completed Tasks");
        clearTasks.setBorder(emptyBorder);
        clearTasks.setFont(new Font("Sans-serif",Font.PLAIN,20));

        this.add(addTask);
        this.add(Box.createHorizontalStrut(20));
        this.add(clearTasks);
    }

    public JButton getNewTask(){
        return addTask;
    }

    public JButton getClear(){
        return clearTasks;
    }

}
