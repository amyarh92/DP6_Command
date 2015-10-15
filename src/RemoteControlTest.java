/**
 * Created by coupang on 2015. 9. 30..
 */
public class RemoteControlTest {
	public static void main(String[] args){
		SimpleRemoteControl remoteControl1 = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand openCommand = new GarageDoorOpenCommand(garageDoor);

		remoteControl1.setCommand(openCommand);
		remoteControl1.buttonWasPressed();
		remoteControl1.setCommand(lightOnCommand);
		remoteControl1.buttonWasPressed();

	}
}
