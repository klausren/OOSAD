package experiment01;

public class Test {

	public static void main(String[] args) {
		Aircraft aircraft = new Helicopter();
		aircraft.takeoff();
		aircraft.fly();
		
		aircraft = new AirPlane();
		aircraft.takeoff();
		aircraft.fly();
		
		aircraft = new Fighter();
		aircraft.takeoff();
		aircraft.fly();
		
		aircraft = new Harrier();
		aircraft.takeoff();
		aircraft.fly();

	}

}
