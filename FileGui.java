import java.awt.GridLayout;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.util.ArrayList;

import java.awt.event.*;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FileGui implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public FileGui() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("hello");
        button1 = new JButton("find the average");
        button2 = new JButton("write");
        button3 = new JButton("sort");
        button4 = new JButton("open unsorted file");
        button5 = new JButton("open sorted file");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(label);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("File Gui");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new FileGui();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            int x = reader.FindAverage("File.txt");
            label.setText(Integer.toString(x));
        }

        else if (e.getSource() == button2) {
            writer.writeRand("File.txt");
        }

        else if (e.getSource() == button3) {
            String in = "File.txt";
            String out = "sorted.txt";
            ArrayList<Integer> nums1 = reader.createList(in);
            ArrayList<Integer> nums = Sorter.sort(nums1);
            writer.writeIntL(nums, out);
        }

        else if (e.getSource() == button4) {
            try {
                ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "File.txt");
                pb.start();
            } catch (IOException t) {
            }
        } else if (e.getSource() == button5) {
            try {
                ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "Sorted.txt");
                pb.start();
            } catch (IOException t) {

            }
        }
    }
}
