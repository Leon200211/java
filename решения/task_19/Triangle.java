package task_19;

public class Triangle {
    int angle1;
    int angle2;
    int angle3;

    public Triangle(int angle1, int angle2, int angle3) throws LeonError {
        if (((angle1 + angle2 + angle3) != 180) || (angle1 != 90 && angle2 != 90 && angle3 != 90) ||
                (angle1 < 1 || angle2 < 1 || angle3 < 1))
            throw new LeonError("Wrong angle.");
        else
            System.out.println("Success.");
    }
}
