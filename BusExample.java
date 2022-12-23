public class BusExample {
    public static void main(String[] args) {
        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);

        for (int i=0; i<50; i++) {
            bus1.Run();
        }
    }
}
