package experiment01;

public class Helicopter extends Aircraft {

	public Helicopter() {
		super.flightCharacteristics = new SubSonicFly();
		super.takeoffCharacteristics = new VerticalTakeOff();
	}
}
