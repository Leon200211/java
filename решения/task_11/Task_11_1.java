package task_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_11_1 extends JFrame {
    private int randomNumber;
    int AttemptCounter = 0;
    public Task_11_1()
    {
        super("Guess");
        this.randomNumber = (int)(Math.random()*20);
        setSize(500,500);
        setLayout(new GridLayout(4,1));
        JPanel[] pnl = new JPanel[4];

        pnl[0] = new JPanel();
        pnl[0].setBackground(new Color(255,255,255));
        add(pnl[0]);
        pnl[1] = new JPanel();
        pnl[1].setBackground(new Color(255,255,255));
        add(pnl[1]);
        pnl[2] = new JPanel();
        pnl[2].setBackground(new Color(255,255,255));
        add(pnl[2]);
        pnl[3] = new JPanel();
        pnl[3].setBackground(new Color(255, 255, 255));
        add(pnl[3]);


        JLabel header = new JLabel("Число в пределе от 1 до 20");
        pnl[0].setLayout(new BorderLayout());
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setFont(new Font("Times new Roman", Font.BOLD,30));
        pnl[0].add(header,BorderLayout.CENTER);

        JTextField GuessNumber = new JTextField(3);
        pnl[2].setLayout(new GridLayout(3,1));
        JPanel[] p = new JPanel[3];
        for (int i = 0; i < p.length; i++)
        {
            p[i] = new JPanel();
            pnl[2].add(p[i]);
            p[i].setBackground(Color.WHITE);
        }
        p[1].setLayout(new FlowLayout());
        JLabel input = new JLabel("Введи число: ");
        input.setFont(new Font("Times new Roman", Font.BOLD,20));
        p[1].add(input);
        p[1].add(GuessNumber);

        JButton enter = new JButton("Enter");
        JLabel Output = new JLabel("");
        Output.setFont(new Font("Times new Roman", Font.BOLD,20));
        pnl[1].setLayout(new BorderLayout());
        Output.setHorizontalAlignment(SwingConstants.CENTER);
        pnl[1].add(Output);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    int UserNumber = Integer.parseInt(GuessNumber.getText());

                    if (UserNumber < randomNumber)
                    {
                        Output.setText("Число больше");
                    }
                    else if (UserNumber > randomNumber)
                    {
                        Output.setText("Введенное число слишком большое");
                    }
                    else{
                        Output.setText("Ты выиграл");
                        AttemptCounter = 0;
                    }
                    if (AttemptCounter >= 3)
                    {
                        Output.setText("Ты проиграл, число было: " + randomNumber);
                    }
                    AttemptCounter++;
                }
                catch (Exception ae)
                {
                    AttemptCounter = 0;
                }
            }
        });
        pnl[3].setLayout(new GridLayout(3,1));
        JPanel[] q = new JPanel[3];
        for (int i = 0; i < q.length; i++)
        {
            q[i] = new JPanel();
            pnl[3].add(q[i]);
            q[i].setBackground(Color.white);
        }
        q[1].add(enter);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        Task_11_1 example = new Task_11_1();
    }
}