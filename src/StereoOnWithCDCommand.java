/**
 * Created by coupang on 2015. 9. 30..
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
}
