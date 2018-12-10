package experiment01;

public class Fighter extends Aircraft {

	public Fighter() {
		super.flightCharacteristics = new SuperSonicFly();
		super.takeoffCharacteristics = new LongDistanceTakeOff();
	}

}
