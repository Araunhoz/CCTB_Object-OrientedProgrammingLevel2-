import java.util.ArrayList;
import java.util.List;

public class VehiclesSimulator {
	
    public static void main(String[] args) {
    	
    	//Create a List of kind Movable with name vehicles
    	
        List<Movable> vehicles = new ArrayList<>();
        
        //Instance an object car and airplane of type Movable
        
        Movable car = new Car();
        Movable airplane = new Airplane();
        
        //Add to vehicles car and airplane
        
        vehicles.add(car);
        vehicles.add(airplane);
        
        // Use for to print 
        
        for (Movable vehicle : vehicles) {
            System.out.println(vehicle.move());
        }
    }
}
