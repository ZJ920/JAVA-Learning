package christmasTree;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JApplet;
 
@SuppressWarnings("deprecation")
public class PlayMusic {
	public static AudioClip loadSound(String filename) {
		URL url = null;
		try {
			url = new URL("file:" + filename);
		} 
		catch (MalformedURLException e) {;}
		return JApplet.newAudioClip(url);
	}
	public void play() {
		AudioClip christmas = loadSound("christmasTree/src/image/music.WAV");
		christmas.play();
	}
}