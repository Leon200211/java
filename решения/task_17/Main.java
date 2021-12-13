package task_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planetNum;



        while(true){
            System.out.println("For exut press 0");
            System.out.print("Enter planet number: ");

            planetNum = sc.nextInt();
            if(planetNum==0){
                break;
            }
            planetNum--;
            if (planetNum < 8) {
                System.out.print("Force of gravity: ");
                System.out.print(Planet.values()[planetNum].getP());
                System.out.println(" m/s²");
            } else {
                System.out.println("Wrong number");
            }
        }
    }
}