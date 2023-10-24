package udemy.section20;

public class _02_RecipeWithMicrowave extends _02_AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("microwave On");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
        System.out.println("put in the microwave");
    }

    @Override
    void cleanUp() {
        System.out.println("cleanup");
        System.out.println("Off microwave");
    }
}
