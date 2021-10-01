package task8.laba_5_2;

import javax.swing.*;


class Fr extends JFrame{
    public String path;
    public Fr(String path){
        this.path = path;

        setTitle("Cullinan");
        setBounds(100, 100, 1000, 600);
        setContentPane(new BgPanel(this.path));

    }
}
