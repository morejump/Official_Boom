import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by admin on 6/11/2016.
 */
public class GameWindow extends Frame implements Runnable {

//    Image background;
   BufferedImage bufferedImage;


    public GameWindow() {// constructor
        this.setSize(750, 650);
        this.setTitle("H2T Team D8CNPM");
        this.setVisible(true);
        MenuScreen menuScreen = new MenuScreen();
        menuScreen.setFrame(this);
        GameManager.getInstance().getStackScreen().push(menuScreen);
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Khi ấn vào nút X thì thoát chương trình nhé
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });// closing window
//        pirate = new Pirate(400, 500, "haitac");
//        player = new Player(500, 400, "player");
//        explosiveBarriers = new ArrayList<ExplosiveBarrier>();
//        nonExplovsiveBarriers = new ArrayList<NonExplovsiveBarrier>();
//
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 25, "HoNuoc"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 84, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 200, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 300, "CayDua"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 500, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(38, 500, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(38, 559, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 257, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(200, 25, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(238, 25, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(278, 25, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 25, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 82, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(520, 25, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 25, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(340, 388, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(660, 570, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 512, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 300, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 357, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 432, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 512, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 150, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 512, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 400, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 300, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 350, "HoNuoc"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(600, 600, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(600, 640, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(600, 680, "House01"));
//
//        explosiveBarriers.add(new ExplosiveBarrier(38, 84, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(0, 400, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(0, 444, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(40, 444, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(0, 650, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(0, 580, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(276, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 139, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 189, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(440, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(480, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(598, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(300, 300, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(340, 300, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(340, 344, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 600, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 556, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 536, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 306, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 400, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(300, 556, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(300, 500, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 600, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 644, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 688, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(440, 644, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 489, "Gach"));
        this.addMouseListener(new MouseListener() {
            @Override

            public void mouseClicked(MouseEvent e) {

                Rectangle rectangle = new Rectangle(150, 500, 167, 54);
                Point p = new Point(e.getX(), e.getY());
                Rectangle rectangle1 = new Rectangle(400, 500, 167, 54);

                if (rectangle.contains(p)) {
                    // chuyen sang man hinh huong dan
                    menuScreen.pressM();
                }
                if (rectangle1.contains(p)) {
                    // chuyen sang man hinh choi
                    menuScreen.pressN();
                }

            }


            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        this.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            // maybe i'll delete these code in the future :))
//            if (e.getKeyCode() == KeyEvent.VK_B){
//                GameManager.getInstance().getStackScreen().pop();
//            } else if (e.getKeyCode() == KeyEvent.VK_N) {
//                GameManager.getInstance().getStackScreen().peek().pressN();
//            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    });


    }


    public void gameUpdate() throws InterruptedException {


        GameManager.getInstance().getStackScreen().peek().update();

    }

    @Override
    public void update(Graphics g) {

        if (bufferedImage == null) {
            bufferedImage = new BufferedImage(750, 650, 1);
        }
        Graphics bufferedGraphics = bufferedImage.getGraphics();
        GameManager.getInstance().getStackScreen().peek().draw(bufferedGraphics);


        g.drawImage(bufferedImage,0,0,null);
    }

    @Override
    public void run() {
        while (true) {
            try {

                Thread.sleep(17);
                gameUpdate();
                repaint();// this method will invoke update method above which is overided
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

