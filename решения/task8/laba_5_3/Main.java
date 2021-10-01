package task8.laba_5_3;


import java.awt.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args)
    {
        Animation anim_window=new Animation("Simple Animation");
        anim_window.go();
        anim_window.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ev)
            {
                System.exit(0);
            }
        });
    }
}
