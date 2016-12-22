import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by Admin on 6/16/2016.
 */
public class ExplosiveBarrier extends Barrier implements IObsever {
    // vật cản có thể nổ được
    // extend từ lớp Barrier và implement interface để lắng nghe bom nổ
    boolean isLive=true;
    public ExplosiveBarrier(int positionX, int positionY, String pathImage) {
        super(positionX, positionY, pathImage);
    }

    @Override
    // tao hiệu ứng boom nổ và sinh ra khói sau đó cho isLive =false để không vẽ barrier lên màn hình nữa
    public void explosive(int positionX, int positionY) throws IOException, InterruptedException {
        this.image = ImageIO.read(new File("Resources/Khoi.png"));
        isLive=false;
    }
}
