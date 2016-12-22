/**
 * Created by Admin on 6/15/2016.
 */
public class NonExplovsiveBarrier extends Barrier {
    // Class này chỉ implement duy nhất constructor để vẽ barrier
    // Vì nó không thể nổ nên không cần sử dụng Observer ở đây nên không implenment interface IObserver :))
    public NonExplovsiveBarrier(int positionX, int positionY, String pathImage) {//constructor
        super(positionX, positionY, pathImage);
    }
}
