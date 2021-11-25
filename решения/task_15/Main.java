package task_15;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter writer = new FileWriter("test.txt");
            writer.write(sc.nextLine());
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try{
            FileReader reader = new FileReader("test.txt");
            int s;
            while((s = reader.read()) != -1){
                System.out.print((char)s);
            }
            System.out.println();
            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try{
            FileWriter writer = new FileWriter("test.txt", true);
            writer.write(sc.nextLine());
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            FileReader reader = new FileReader("test.txt");
            int s;
            while((s = reader.read()) != -1){
                System.out.print((char)s);
            }
            System.out.println();
            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            FileWriter writer = new FileWriter("test.txt", false);
            writer.write(sc.nextLine());
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try{
            FileReader reader = new FileReader("test.txt");
            int s;
            while((s = reader.read()) != -1){
                System.out.print((char)s);
            }
            System.out.println();
            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
