package task_22;

public class Client {
    boolean sitting = false;
    ChairFactory chair;

    public void sit(ChairFactory chair)
    {
        if (sitting)
            System.out.println("Сижу на другом стуле");
        else {
            System.out.println("Сео");
            this.chair = chair;
            sitting = true;
        }
    }

    public void standUp()
    {
        if (!sitting)
            System.out.println("Я уже стою");
        else {
            System.out.println("Встал");
            this.sitting = false;
        }
    }

    public ChairFactory getChair() {
        return chair;
    }
}