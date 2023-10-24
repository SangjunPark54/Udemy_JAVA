package udemy.section20;

public class _03_GameRunner {
    public static void main(String[] args) {
        _03_GamingConsole game = new _03_ChessGame();
//        _03_GamingConsole game = new _03_MarioGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
