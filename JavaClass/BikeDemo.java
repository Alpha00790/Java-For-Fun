class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public int getSpeed() {
        System.out.println(speed);
        return speed;
    }

    public int getGear() {
        System.out.println(gear);
        return gear;
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
public class BikeDemo {
    public static void main(String[] args) {
        Bicycle mtb = new Bicycle();
        MountainBike canyon = new MountainBike();
        canyon.setCadence(120);
        canyon.setGear(6);
        canyon.speedUp(100);
        canyon.applyBrake(10);
        canyon.speedUp(50);
        canyon.getSpeed();
        mtb.speedUp(50);
        mtb.applyBrake(10);
        mtb.getSpeed();
        mtb.getGear();
        canyon.getGear();
    }
}
