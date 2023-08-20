package org.prog.cars;

public class BigTruck extends Truck implements ICar {
    @Override
    public void moveForward(String distance) {
        super.moveForward(distance);
    }

    @Override
    public void reverseMovement() {
        super.reverseMovement();
    }
}
