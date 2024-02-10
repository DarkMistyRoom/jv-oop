package core.basesyntax;

public class MainApp {
    public static void main() {
        Machine[] arr = new Machine[3];
        arr[0] = new Bulldozer();
        arr[1] = new Excavator();
        arr[2] = new Truck();

        for (Machine machine: arr) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
