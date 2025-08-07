package static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("k3");
        Car car2 = new Car("g90");
        Car car3 = new Car("model y");

        Car.showTotalCars(); // 구매한 차량 수 출력하는 static 메서드
    }
}
