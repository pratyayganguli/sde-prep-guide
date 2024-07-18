package com.interview.lld.SOLID.questions;


/**
 *
 * Liskov Substitution Principle
 */


class VehicleLiskovSolution {

    interface MotorBike {
        void brake();
        void accelerate();
        void startEngine();
    }

    interface NonMotorBike {
        void brake();
        void accelerate();
    }

    class ElectricBike implements MotorBike {

        @Override
        public void brake() {
            // braking in electric bike
        }

        @Override
        public void accelerate() {
            // accelerating in electric bike
        }

        @Override
        public void startEngine() {
            // starting the electric bike
        }
    }

    class DirtBike implements MotorBike {

        @Override
        public void brake() {

        }

        @Override
        public void accelerate() {

        }

        @Override
        public void startEngine() {

        }
    }

    class Cycle implements NonMotorBike {

        @Override
        public void brake() {
            // braking in the bicycle
        }

        @Override
        public void accelerate() {
            // paddling in
        }
    }

    MotorBike electricBike = new ElectricBike();
    MotorBike dirtBike = new DirtBike();
    NonMotorBike cycle = new Cycle();
}

interface Bike {
    void brake();
    void accelerate();
    void startEngine();
}

class Cycle implements Bike {
    @Override
    public void brake() {
        // cycle stopped
    }

    @Override
    public void accelerate() {
        // paddling in
    }

    @Override
    public void startEngine() {
        // todo: we cannot start the engine of the cycle, need to simplify the code.
    }
}

class ElectricBike implements Bike {
    @Override
    public void brake() {
        // bike stopped
    }

    @Override
    public void accelerate() {
        // accelerated
    }

    @Override
    public void startEngine() {
        // ignition on!
    }
}
