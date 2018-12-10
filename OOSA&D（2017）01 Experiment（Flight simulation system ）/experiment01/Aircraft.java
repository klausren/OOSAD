package experiment01;

public class Aircraft {
	protected FlightCharacteristics flightCharacteristics;
	protected TakeoffCharacteristics takeoffCharacteristics;
	public void fly(){
		flightCharacteristics.fly();
	}
	public void takeoff(){
		takeoffCharacteristics.takeoff();
	}
}