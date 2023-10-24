package udemy.section20;

public abstract class _02_AbstractRecipe {
    //3개의 클래스가 필요
    //prepare
    //recipe
    //cleanup

    public void excute() {
        getReady();
        doTheDish();
        cleanUp();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();
}
