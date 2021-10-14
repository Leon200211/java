package task_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_11_3 extends JFrame {

    private JTextField UserText;
    public Task_11_3()
    {
        super("Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(dropDownColour());
        menuBar.add(dropDownFont());
        setJMenuBar(menuBar);
        UserText = new JTextField(30);
        setLayout(new GridLayout(3,1));
        JPanel[] panel = new JPanel[3];
        for (int i = 0; i < panel.length; i++)
        {
            panel[i] = new JPanel();
            add(panel[i]);
        }

        UserText.setHorizontalAlignment(SwingConstants.CENTER);
        UserText.setBackground(Color.WHITE);
        panel[1].setLayout(new BorderLayout());
        panel[1].setBackground(Color.ORANGE);
        panel[1].add(UserText, BorderLayout.CENTER);
        setSize(500,500);
        setVisible(true);
    }
    public JMenu dropDownColour()
    {
        JMenu FontColour = new JMenu("Colour");

        JMenuItem red = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");
        JMenuItem cyan = new JMenuItem("Cyan");
        JMenuItem black = new JMenuItem("Black");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setForeground(Color.red);
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setForeground(Color.GREEN);
            }
        });
        cyan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setForeground(Color.cyan);
            }
        });
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setForeground(Color.BLACK);
            }
        });
        FontColour.add(red);
        FontColour.add(green);
        FontColour.add(cyan);
        FontColour.add(black);
        FontColour.setSize(20,20);
        return FontColour;
    }
    public JMenu dropDownFont()
    {
        JMenu FontType = new JMenu("Font");

        JMenuItem TimesNewRoman = new JMenuItem("Times New Roman");
        JMenuItem Calibri = new JMenuItem("Calibri");
        JMenuItem CourerNew = new JMenuItem("Courer New");
        TimesNewRoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setFont(new Font("Times New Roman", Font.BOLD, 35));
            }
        });
        Calibri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setFont(new Font("Calibri",Font.BOLD,35));
            }
        });
        CourerNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setFont(new Font("Courier new", Font.BOLD, 35));
            }
        });
        FontType.add(TimesNewRoman);
        FontType.add(Calibri);
        FontType.add(CourerNew);
        return FontType;
    }
    public ImageIcon resizeIcon(String path)
    {
        ImageIcon TNR = new ImageIcon (path);
        Image img = TNR.getImage();
        img = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        TNR = new ImageIcon(img);
        return TNR;
    }
    public static void main(String[]args)
    {
        new Task_11_3();
    }
}