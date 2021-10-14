package task_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Task_11_2 extends JFrame {
    public Task_11_2() {
        super("Mouse");

        JLabel north = new JLabel("         ");
        JLabel south = new JLabel("         ");
        JLabel east = new JLabel("          ");
        JLabel west = new JLabel("          ");
        JLabel center = new JLabel("            ");

        setSize(500, 500);

        JPanel[] panels = new JPanel[5];
        setLayout(new BorderLayout());


        panels[0] = new JPanel();
        panels[0].setBackground(Color.BLUE);
        panels[0].add(north);
        add(panels[0], BorderLayout.NORTH);

        panels[1] = new JPanel();
        add(panels[1], BorderLayout.CENTER);

        panels[2] = new JPanel();
        panels[2].add(south);
        panels[2].setBackground(Color.red);
        add(panels[2], BorderLayout.SOUTH);

        panels[3] = new JPanel();
        panels[3].add(west);
        panels[3].setBackground(Color.GREEN);
        add(panels[3], BorderLayout.WEST);

        panels[4] = new JPanel();
        panels[4].add(east);
        panels[4].setBackground(Color.CYAN);
        add(panels[4], BorderLayout.EAST);



        JPanel[] p = new JPanel[5];
        JPanel[] p1 = new JPanel[5];
        JPanel[] p2 = new JPanel[5];
        panels[1].setLayout(new GridLayout(5, 1));
        panels[3].setLayout(new GridLayout(5, 1));
        panels[4].setLayout(new GridLayout(5, 1));

        for (int i = 0; i < p.length; i++)
        {
            p[i] = new JPanel();
            p1[i] = new JPanel();
            p2[i] = new JPanel();
            p[i].setBackground(Color.WHITE);
            p1[i].setBackground(Color.GREEN);
            p2[i].setBackground(Color.CYAN);
            panels[1].add(p[i]);
            panels[3].add(p1[i]);
            panels[4].add(p2[i]);
        }
        p[2].add(center);
        p1[2].add(west);
        p2[2].add(east);
        panels[0].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                //JOptionPane.showMessageDialog(null,"Добро пожаловать на СЕВЕР");
                north.setText("Добро пожаловать на СЕВЕР");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                north.setText("         ");
            }
        });
        panels[1].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //JOptionPane.showMessageDialog(null,"Добро пожаловать в ЦЕНТР");
                center.setText("Добро пожаловать в ЦЕНТР");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                center.setText("            ");
            }
        });
        panels[2].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //JOptionPane.showMessageDialog(null,"Добро пожаловать на ЮГ");
                south.setText("Добро пожаловать на ЮГ");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                south.setText("         ");
            }
        });
        panels[3].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //JOptionPane.showMessageDialog(null,"Добро пожаловать на ЗАПАД");
                west.setText("Добро пожаловать на ЗАПАД");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                west.setText("          ");
            }
        });
        panels[4].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                //JOptionPane.showMessageDialog(null,"Добро пожаловать на ВОСТОК");
                east.setText("Добро пожаловать на ВОСТОК");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                east.setText("          ");
            }
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        Task_11_2 example = new Task_11_2();
    }
}