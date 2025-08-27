package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child1 = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = "+ child1.value);
        child1.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent1 = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = "+ parent1.value);
        parent1.method();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 x
        poly.method(); // 메서드 오버라이딩!!
    }
}
