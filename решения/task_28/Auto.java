package task_28;

public class Auto {
    Engine engine;
    Chassis chassis;
    Coachbuilder coachbuilder;

    class Engine {
        public void start() {
            System.out.println("Ехать");
        }

        public void stop() {
            System.out.println("Стоп");
        }
    }

    class Chassis {
        public void turn(int side) {
            if (side == 0)
                System.out.println("Повернул колеса налево");
            else if (side == 2)
                System.out.println("Повернул колеса направо");
        }
    }

    class Coachbuilder {
        int capacity;
        public Coachbuilder(int capacity) {
            this.capacity = capacity;
        }
    }

    public Auto(int capability) {
        this.engine = new Engine();
        this.chassis = new Chassis();
        this.coachbuilder = new Coachbuilder(capability);
    }


    public void openWindow() {
        Test_class window = new Test_class() {
            @Override
            public void close() {
                System.out.println("Окно закрыто");
            }

            @Override
            public void open() {
                System.out.println("Окно открыто");
            }

        };

        window.open();
        //window.close();
    }

    public void go() {
        this.engine.start();
    }

    public void turn(String side) {
        if (side == "Лево")
            this.chassis.turn(0);
        else if (side == "Право")
            this.chassis.turn(2);
    }

    public void stop() {
        this.engine.stop();
    }
}