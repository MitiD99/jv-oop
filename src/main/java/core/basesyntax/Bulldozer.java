package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    void doWork() {
        System.out.println("Bulldozer started working");
    }

    @Override
    void stopWork() {
        System.out.println("Bulldozer stopped working");
    }
}
