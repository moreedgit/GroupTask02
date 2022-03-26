package GroupTask02;

public class Car {
    double carPrice;
    String color;
    double discount;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calsale() {
        return carPrice;
    }
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calsale() {
        if (weight > 4000) {
            discount = 0.1;
        } else {
            discount = 0.2;
        }
        return carPrice - carPrice * discount;
    }
}

class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calsale() {
        if (length > 20) {
            discount = 0.05;
        } else {
            discount = 0.1;
        }
        return carPrice - carPrice * discount;
    }
}

class CarTester {
    public static void main(String[] args) {
        Car truck = new Truck(50000, "White", 4500);
        System.out.println(truck.calsale());
        Car sedan = new Sedan(45000, "Green", 18);
        System.out.println(sedan.calsale());
    }
}
