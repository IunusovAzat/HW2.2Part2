public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo",4);
        Truck truck = new Truck("Man",12);
        Bicycle bicycle = new Bicycle("Kama", 3);

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(truck);

    }
}