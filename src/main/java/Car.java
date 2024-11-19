public class Car {
    String name;
    int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    int calculateDistance() {

        return speed * 24;
    }

}
