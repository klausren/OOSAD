package experiment01;

public class Harrier extends Aircraft {

	public Harrier() {
		super.flightCharacteristics = new SuperSonicFly();
		super.takeoffCharacteristics = new VerticalTakeOff();
	}

}
