package udemy.section20;

public class _02_AbstractClass {

    public static class Animal {
        public void bark() {
            System.out.println("Test");
        }
    }
    public static abstract class AbstractAnimal {
        abstract public void bark();
    }
    // 무엇을 할지 가지고 있지 않고, 정의만 함.
    // 추상 클래스를 연장해 구상 클래스를 생성
    public static class Dog extends AbstractAnimal {
        public void bark() {
            System.out.println("Bow Bow");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.bark();
        Dog dog = new Dog();
        dog.bark();
    }
}
