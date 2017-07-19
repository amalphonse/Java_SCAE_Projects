
class Vehicle{
	int passenger_limit;
	int fuel_capacity;
	int miles_per_gallon;
	
	int range(){
		//System.out.println("Miles can drive "+ fuel_capacity * miles_per_gallon);
	return fuel_capacity * miles_per_gallon;
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		
		int range_minivan, range_sportscar;
		
		
		minivan.passenger_limit =7;
		minivan.fuel_capacity = 16;
		minivan.miles_per_gallon = 21;
		
		sportscar.passenger_limit = 2;
		sportscar.fuel_capacity = 14;
		sportscar.miles_per_gallon = 12;
		
		//compute the range assuming a full tank of gas.
		/* range =  minivan.fuel_capacity * minivan.miles_per_gallon;
		System.out.println("Minivan can carry " + minivan.passenger_limit +
				" passengers for a distance of " + range +" miles, when tank is filled to full capacity.");
		 */
		
		range_minivan = minivan.range();
		range_sportscar = sportscar.range();
		
		//System.out.println("Minivan can carry " + minivan.passenger_limit
		//		+ ". ");
		//minivan.range();
		
		//System.out.println("Sportscar can carry " + sportscar.passenger_limit+ ". ");
		//sportscar.range();
		
		System.out.println("Minivan can carry " + minivan.passenger_limit +
				" passengers for a distance of " + range_minivan +" miles, when tank is filled to full capacity.");
	
	
		System.out.println("Minivan can carry " + sportscar.passenger_limit +
				" passengers for a distance of " + range_sportscar +" miles, when tank is filled to full capacity.");
		}

}
