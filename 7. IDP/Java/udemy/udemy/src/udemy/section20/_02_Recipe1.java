package udemy.section20;

public class _02_Recipe1 extends _02_AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("cleanup");
    }
}
