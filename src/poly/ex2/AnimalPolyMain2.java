package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animalArr = {dog, cat, caw};

        // 변하지 않는 부분
        for (Animal animal: animalArr) {
            System.out.println("test start");
            animal.sound();
            System.out.println("test end");
        }


    }

}
