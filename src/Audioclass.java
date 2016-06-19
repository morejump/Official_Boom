import javax.media.Format;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.format.AudioFormat;
import javax.media.pim.PlugInManager;
import java.io.File;

/**
 * Created by Admin on 6/18/2016.
 */
public class Audioclass {
//    public void playSound() {
//        try {
//            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/Admin/Desktop/sound-dan_2/sound dan/sound1.mp3").getAbsoluteFile());
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioInputStream);
//            clip.start();
//            Thread.sleep(clip.getMicrosecondLength() / 1000);
//        } catch(Exception ex) {
//            System.out.println("Error with playing sound.");
//            ex.printStackTrace();
//        }
//    }
public void playSound(String pathFile){
    Format input1 = new AudioFormat(AudioFormat.MPEGLAYER3);
    Format input2 = new AudioFormat(AudioFormat.MPEG);
    Format output = new AudioFormat(AudioFormat.LINEAR);
    PlugInManager.addPlugIn(
            "com.sun.media.codec.audio.mp3.JavaDecoder",
            new Format[]{input1, input2},
            new Format[]{output},
            PlugInManager.CODEC
    );
    try{
        javax.media.Player player = Manager.createPlayer(new MediaLocator(new File(pathFile).toURI().toURL()));
        player.start();
    }
    catch(Exception ex){
        ex.printStackTrace();
    }
}
}
