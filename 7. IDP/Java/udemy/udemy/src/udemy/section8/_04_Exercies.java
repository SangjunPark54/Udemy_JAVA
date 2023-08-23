package udemy.section8;

public class _04_Exercies {
    _04_Exercies(int noOfCopies){
        this.noOfCopies = noOfCopies;
    }
    private int noOfCopies;
    private String title;

    public void setTitle(String title) {
        this.title = title;
        // book title 설정
    }
    public String getTitle() {
        return this.title;
        // title 조회
    }
    public int getBook() {
        return this.noOfCopies;
        // book 수량 조회
    }
    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies >= 0)
            this.noOfCopies = noOfCopies;
        else throw new IllegalArgumentException("Negative Values is not permitted");
        // book 수량 설정
    }
    public void increasebook(int howMuch) {
        setNoOfCopies(noOfCopies + howMuch);
        // book 수량 증가
    }

    public void decreaseNoOfCopies(int howMuch) {
        setNoOfCopies(noOfCopies - howMuch);
        // book 수량 감소
    }

    public void book() {
        System.out.println();
    }

}
