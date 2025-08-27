package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceAnimal[] animalArr = {new Dog(), new Cat(), new Caw()};

        // 변하지 않는 부분
        for (InterfaceAnimal animal: animalArr) {
            soundAnimal(animal);
            moveAnimal(animal);
        }

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("test sound start");
        animal.sound();
        System.out.println("test sound end");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("test move start");
        animal.move();
        System.out.println("test move end");
    }
}
