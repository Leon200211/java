package task8.laba_5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //javac Main.java ImageFrame.java ImageComponent.java "C:\work\work_java\vyz_laba\src\laba_5\laba_5_2\Cullinan.jpg"
        // javac Main.java ImageFrame.java ImageComponent.java java temp_name "C:\work\work_java\vyz_laba\src\laba_5\laba_5_2\Cullinan.jpg"
        //java -jar Main ImageFrame ImageComponent C:\work\work_java\vyz_laba\src\laba_5\laba_5_2\Cullinan.jpg
        //java Fr.java Main.java BgPanel.java

        //CVS;SCCS;RCS;rcs;.*;*.jpx;*.jpx.local;*.apf;*.oif;Servlet.library;Thumbs.db;.svn;
        //*.md; *.txt; *.rst; *.adoc; *.jpg

        Scanner tr = new Scanner(System.in);
        Fr f = new Fr(tr.next());
        f.setVisible(true);
        System.out.println(1);
    }

}
