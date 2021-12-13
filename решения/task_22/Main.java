package task_22;

public class Main {
    public static void main(String[] args) {
        VictorianChair victorianChairFactory = new VictorianChair();
        MagicChair magicChairFactory = new MagicChair();
        MultifunctionalChair multifunctionalChairFactory = new MultifunctionalChair();

        Client client = new Client();
        ChairFactory victorianChair = victorianChairFactory.createChair();
        ChairFactory magicChair = magicChairFactory.createChair();
        ChairFactory multifunctionalChair = multifunctionalChairFactory.createChair();

        client.sit(victorianChair);
        client.sit(magicChair);
        client.standUp();
        client.sit(magicChair);
        client.standUp();
        client.sit(multifunctionalChair);
        client.standUp();
        client.standUp();
    }
}
