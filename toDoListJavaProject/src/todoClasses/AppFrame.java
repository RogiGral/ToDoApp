package todoClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private TitleBar titleBar;
    private List list;
    private ButtonPanel btnPanel;

    private JButton addTask;
    private JButton clear;

    AppFrame()
    {
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleBar = new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();

        this.add(titleBar, BorderLayout.NORTH);
        this.add(btnPanel,BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        this.setLocationByPlatform(true);
        this.setVisible(true);

        addTask = btnPanel.getNewTask();
        clear = btnPanel.getClear();

        addlisteners();

    }

    private void addlisteners() {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();
            }
        });
        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.removeCompletedTasks();
                repaint();
            }
        });
    }
}
