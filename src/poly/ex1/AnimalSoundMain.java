package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("test start");
        dog.sound();
        System.out.println("test end");

        System.out.println("test start");
        cat.sound();
        System.out.println("test end");

        soundCaw(caw);
    }

    private static void soundCaw(Caw caw) {
        System.out.println("test start");
        caw.sound();
        System.out.println("test end");
    }
}
