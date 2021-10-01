package task8.laba_5_1;

import javax.swing.*;
import java.awt.*;

public class exe_1 extends JFrame
{

    public exe_1() {
        // !!!!
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void paint(Graphics g){

        for (int i = 0; i < 20; i++) {
            int rnd = (int) (Math.random() * 3);
            switch (rnd){
                case 0:
                    square obj_1 = new square();
                    Color myWhite_1 = new Color(obj_1.r, obj_1.g, obj_1.b);
                    g.setColor(myWhite_1);
                    g.fillRect(obj_1.x, obj_1.y, 50, 50); // FOR SQUARE
                    break;
                case 1:
                    Circle obj_2 = new Circle();
                    Color myWhite_2 = new Color(obj_2.r, obj_2.g, obj_2.b);
                    g.setColor(myWhite_2);
                    g.fillOval(obj_2.x, obj_2.y, 50, 50); // FOR SQUARE
                    break;
                case 2:
                    Triangle obj_3 = new Triangle();
                    Color myWhite_3 = new Color(obj_3.r, obj_3.g, obj_3.b);
                    g.setColor(myWhite_3);
                    g.fillRoundRect(obj_3.x, obj_3.y, 50, 50, 35, 35); // FOR SQUARE
                    break;
            }
        }

    }






}