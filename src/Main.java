

import java.io.IOException;

/**
 * Created by admin on 6/11/2016.
 */
public class Main { // chương trình sẽ bắt đầu từ class này nhé :))
    public static void main(String[] args) throws IOException {
        GameWindow gameWindow = new GameWindow();// Tạo class GameWindow tạo một luồng mới với c
        Thread thread = new Thread(gameWindow);
        thread.start();

    }
}
