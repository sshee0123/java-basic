package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        // 변하지 않는 부분
        for (Animal animal: animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }

}
