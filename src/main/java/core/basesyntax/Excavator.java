package core.basesyntax;

public class Excavator extends Machine {
    @Override
    void doWork() {
        System.out.println("Excavator started working");
    }

    @Override
    void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
