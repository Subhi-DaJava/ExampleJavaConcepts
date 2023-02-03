package static_instance_methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    
    private Car car = new Car();

    @Test
    void accelerate() {
        car.speed = 5;
        car.accelerate();
        assertEquals(car.speed, 10);
    }

    @Test
    void brake() {
        car.speed = 6;
        car.brake();
        assertEquals(car.speed, 1);
    }

    @Test
    void shouldReturnZeroWhenSpeedLessThanZero() {
        car.speed = 2;
        car.brake();
        assertEquals(car.speed, 0);
    }
}