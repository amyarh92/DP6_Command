/**
 * Created by coupang on 2015. 9. 30..
 */
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light){
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
