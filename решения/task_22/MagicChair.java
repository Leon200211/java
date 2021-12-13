package task_22;

public class MagicChair extends ChairFactory {
    int x, y;

    boolean visible;

    @Override
    public MagicChair createChair() {
        return new MagicChair();
    }

}
