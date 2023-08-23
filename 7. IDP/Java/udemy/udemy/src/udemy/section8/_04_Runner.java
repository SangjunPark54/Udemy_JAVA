package udemy.section8;

public class _04_Runner {
    public static void main(String[] args) {
        _04_Exercies ArtofComputerProgramming = new _04_Exercies(10000);
        _04_Exercies EffectiveJava = new _04_Exercies(10000);
        _04_Exercies CleanCode = new _04_Exercies(10000);

        System.out.println(ArtofComputerProgramming.getBook());
        System.out.println(EffectiveJava.getBook());
        System.out.println(CleanCode.getBook());

//        ArtofComputerProgramming.setNoOfCopies(100);
//        EffectiveJava.setNoOfCopies(1000);
//        CleanCode.setNoOfCopies(0);

        ArtofComputerProgramming.setTitle("test");
        EffectiveJava.decreaseNoOfCopies(333);
        CleanCode.increasebook(11);

        System.out.println(ArtofComputerProgramming.getTitle());
        System.out.println(EffectiveJava.getBook());
        System.out.println(CleanCode.getBook());


    }
}
