package poly.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("야용");
    }

    @Override
    public void move() {
        System.out.println("cat move");
    }
}
