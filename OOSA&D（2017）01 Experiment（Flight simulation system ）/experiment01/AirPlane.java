package experiment01;

public class AirPlane extends Aircraft {

	public AirPlane() {
		super.flightCharacteristics = new SubSonicFly();
		super.takeoffCharacteristics = new VerticalTakeOff();
	}

}
