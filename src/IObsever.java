import java.io.IOException;

/**
 * Created by Admin on 6/15/2016.
 */
public interface IObsever {
    // chỉ có duy nhất phương thức nổ nếu thằng nào implement interface này thì bắt buộc phải implement phương thức explosive
    void explosive(int positionX, int positionY) throws IOException, InterruptedException;
}
