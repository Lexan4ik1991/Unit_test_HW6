package Hwork2Test;

import hwork2.Car;
import hwork2.Motorcycle;
import hwork2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;


public class VehicleTest {
    Car car = null;
    Motorcycle motorcycle = null;

    @BeforeEach
    public void createObjects() {
        car = new Car("Mitsubishi", "Lancer", 2008);
        motorcycle = new Motorcycle("Kawasaki", "KSR85", 2000);
    }

    @Test
    public void allTests() {
        assertInstanceOf(Vehicle.class, car);
        assertEquals(4, car.getNumWheels());
        assertEquals(2, motorcycle.getNumWheels());

        car.testDrive();
        assertEquals(60,car.getSpeed());

        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());

        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());

        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());

    }

}
