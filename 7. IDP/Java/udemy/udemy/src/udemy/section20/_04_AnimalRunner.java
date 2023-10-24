package udemy.section20;

abstract class Animal{
    public abstract void bark();
}
class Dog extends Animal {
    @Override
    public void bark() {
        System.out.println("Bow Bow");
    }
}
class Cat extends Animal {

    @Override
    public void bark() {
        System.out.println("Meow Meow");
    }
}

public class _04_AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };
            for(Animal object : animals) {
                object.bark();
            }
    }
}
