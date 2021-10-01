package task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class Football extends JFrame
{

    private int scrol_Milan = 0;
    private int scrol_Madrid = 0;
    private String text_arr;
    private String text_winner;

    private JPanel[] pnl = new JPanel[4];

    private  JLabel lbl_1 = new JLabel("");

    public Football()
    {
        setLayout(new GridLayout(2,2));



        pnl[0] = new JPanel();
        pnl[0].setBackground(new Color(0, 0, 255));
        add(pnl[0]);
        pnl[0].setLayout(new BorderLayout());
        JButton button_1 = new JButton("AC Milan");
        pnl[0].add(button_1 ,BorderLayout.PAGE_START);

        pnl[1] = new JPanel();
        pnl[1].setBackground(new Color(255, 0, 0));
        add(pnl[1]);
        pnl[1].setLayout(new BorderLayout());
        JButton button_2 = new JButton("Real Madrid");
        pnl[1].add(button_2 ,BorderLayout.PAGE_START);


        text_arr = "  Result: " + scrol_Milan + " X " + scrol_Madrid +  "  Last Scorer: N/A  " +  "  Winner: DRAW";
        lbl_1.setText(text_arr);
        lbl_1.setBackground(new Color(224, 255, 255));
        add(lbl_1,pnl[3]);


        button_1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evtent) {
                scrol_Milan += 1;

                if(scrol_Madrid>scrol_Milan){
                    text_winner = "Real Madrid";
                }
                else if(scrol_Madrid<scrol_Milan){
                    text_winner = "AC Milan";
                }
                else{
                    text_winner = "DRAW";
                }


                text_arr = "  Result: " + scrol_Milan + " X " + scrol_Madrid +  "  Last Scorer: AC Milan  " +  "  Winner: "+text_winner;
                System.out.println(text_arr);
                lbl_1.setText(text_arr);
            }
        });
        button_2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evtent) {
                scrol_Madrid += 1;

                if(scrol_Madrid>scrol_Milan){
                    text_winner = "Real Madrid";
                }
                else if(scrol_Madrid<scrol_Milan){
                    text_winner = "AC Milan";
                }
                else{
                    text_winner = "DRAW";
                }

                text_arr = "  Result: " + scrol_Milan + " X " + scrol_Madrid +  "  Last Scorer: Real Madrid " +  "  Winner: "+text_winner;
                System.out.println(text_arr);
                lbl_1.setText(text_arr);
            }
        });


        setSize(800,500);
    }
}