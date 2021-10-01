package task8.laba_5_2;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


class BgPanel extends JPanel{
    Image im = null;
    String path;
    public BgPanel(String path){
        this.path = path;
    }

    public void paintComponent(Graphics g){

        try {
            im = ImageIO.read(new File(this.path));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0, null);
    }
}
