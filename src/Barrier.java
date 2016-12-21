import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Admin on 6/15/2016.
 */
public class Barrier { // Lớp này là lớp cha cho 2 lớp ExploviseBarrier và lớp NonExplosive Barrier
    public int positionX;
    public int positionY;
    public String pathImage; // getting path of image
    public BufferedImage image;

    public Barrier(int positionX, int positionY, String pathImage) { // constructor
        this.positionX = positionX;
        this.positionY = positionY;
        this.pathImage= pathImage;
        try {
            this.image = ImageIO.read(new File("Resources/"+pathImage+".png"));// edit later :)) --> path of image
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g) {
        g.drawImage(this.image, this.positionX, this.positionY, null);
    }
}
