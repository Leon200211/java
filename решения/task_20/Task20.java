package task_20;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task20 {
    void subtask1()
    {
        System.out.println("Enter date according the format: yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String dateString = scanner.next();

        LDate dateBuilder = new LDate();
        Date date = dateBuilder.build(dateString);
        System.out.println(date);

        LCalendar calendarBuilder = new LCalendar();
        Calendar calendar = calendarBuilder.build(dateString);
        System.out.println(calendar);
    }

    void subtask2()
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String lastName;
        String receiptDateStr;

        System.out.println("Enter student lastname");
        lastName = scanner.next();
        System.out.println("Enter task receipt date: yyyy-MM-dd HH:mm");
        receiptDateStr = scanner.next();

        LCalendar calendarBuilder = new LCalendar();
        Calendar receiptDate = calendarBuilder.build(receiptDateStr);
        Task20_2 task = new Task20_2(lastName, receiptDate);

        task.handOver();

        System.out.println(task);
    }

    public static void main(String[] args) {
        Task20 task = new Task20();

        task.subtask1();
        task.subtask2();
    }
}