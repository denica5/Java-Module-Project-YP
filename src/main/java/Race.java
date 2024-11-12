import java.util.Scanner;

public class Race {
     Scanner scanner = new Scanner(System.in);
     String startRace() {

        String winnerName = "";
        int winnerDistance = -1;
        for (int carNumber = 1; carNumber < 4; carNumber++) {
            System.out.printf("— Введите название машины №%d:%n", carNumber);
            String name = scanner.next();
            System.out.println("\n");
            int speed = checkCorrectSpeed(carNumber);

            Car car = new Car(name, speed);
            if (winnerDistance < car.calculateDistance()) {
                winnerDistance = car.calculateDistance();
                winnerName = car.name;
            }

        }
        return winnerName;
    }

    int checkCorrectSpeed(int carNumber) {
         int speed;
        while (true) {
            System.out.printf("— Введите скорость машины №%d:%n", carNumber);
            speed = scanner.nextInt();
            System.out.println("\n");
            if (speed > 0 && speed < 250) {
                break;
            }
            System.out.println("— Неправильная скорость");
            System.out.println("\n");

        }
        return speed;
    }


}
