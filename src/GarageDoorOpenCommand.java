/**
 * Created by coupang on 2015. 9. 30..
 */


public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
