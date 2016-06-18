import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by hungtran on 6/12/16.
 */
public class OverScreen implements Screen {
    Image over;
    public OverScreen(){
        try {
            over =   ImageIO.read(new File("Resources/Image 1239.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void pressN() {
        System.out.println("Het cmnr");
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.over,0,0,null);
    }


}
