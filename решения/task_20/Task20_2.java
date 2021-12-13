package task_20;

import java.util.Calendar;
import java.util.Date;

public class Task20_2 {
    String lastname;
    Calendar taskReceiptDate;
    Date TaskDate;

    public Task20_2(String lastname, Calendar taskReceiptDate)
    {
        this.lastname = lastname;
        this.taskReceiptDate = taskReceiptDate;
    }

    public void handOver()
    {
        this.TaskDate = new Date();
    }

    public String toString() {
        return "Task{" +
                "lastname='" + lastname + '\'' +
                ", taskReceiptDate=" + taskReceiptDate +
                ", TaskDate=" + TaskDate +
                '}';
    }
}