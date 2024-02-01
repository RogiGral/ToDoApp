package todoClasses;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    TitleBar(){
        this.setPreferredSize(new Dimension(400,80));

        JLabel titleText = new JLabel("Todo list");
        titleText.setPreferredSize(new Dimension(200,80));
        titleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
}
