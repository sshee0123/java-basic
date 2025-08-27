package poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animalArr = {new Dog(), new Cat(), new Caw()};

        // 변하지 않는 부분
        for (AbstractAnimal animal: animalArr) {
            soundAnimal(animal);
        }
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }
}
