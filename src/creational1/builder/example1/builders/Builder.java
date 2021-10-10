package creational1.builder.example1.builders;

import creational1.builder.example1.cars.CarType;
import creational1.builder.example1.components.Engine;
import creational1.builder.example1.components.GPSNavigator;
import creational1.builder.example1.components.Transmission;
import creational1.builder.example1.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	void setCarType(CarType type);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTransmission(Transmission transmission);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavigator(GPSNavigator gpsNavigator);

}
