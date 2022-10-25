public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель на автомобиле");
    }
    public void transportService() {
        updateTyre();
        checkEngine();
    }
}