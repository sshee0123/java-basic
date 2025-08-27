package poly.ex4;


public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animalArr = {new Dog(), new Cat(), new Caw()};

        // 변하지 않는 부분
        for (AbstractAnimal animal: animalArr) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("test sound start");
        animal.sound();
        System.out.println("test sound end");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("test move start");
        animal.move();
        System.out.println("test move end");
    }
}
