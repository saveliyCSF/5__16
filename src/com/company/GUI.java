package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private JTextField textFieldFirstTree;
    private JTextField textFieldSecondTree;
    private JButton buttonExecute;
    private JLabel treeCompareLabel;
    private JPanel panelMain;

    GUI(){
        setTitle("Двоичные деревья");
        setSize(500, 350);
        setContentPane(panelMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        buttonExecute.addActionListener(e -> {
            try {
                BinaryTree<Integer> treeFirst = new BinaryTree<>(s -> Integer.parseInt(s));
                BinaryTree<Integer> treeSecond = new BinaryTree<>(s -> Integer.parseInt(s));
                treeFirst.fromBracketNotation(textFieldFirstTree.getText());
                treeSecond.fromBracketNotation(textFieldSecondTree.getText());
                if(new Solution().solution(treeFirst, treeSecond))
                    treeCompareLabel.setText("Деревья идентичны.");
                else
                    treeCompareLabel.setText("Деревья не идентичны.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        });
    }
}
