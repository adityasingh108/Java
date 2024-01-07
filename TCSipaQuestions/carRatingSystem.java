package TCSipaQuestions;

import java.util.Scanner;


public class carRatingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        // Create an array of objects of the AutonomousCar
        AutonomousCar[] autonomousCars = new AutonomousCar[testCase];

        // Input for AutonomousCar objects
        for (int i = 0; i < testCase; i++) {
            int carId = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String brand = sc.nextLine();
            int noOfTestsConducted = sc.nextInt();
            int noOfTestsPassed = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String environment = sc.nextLine();

            autonomousCars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }

        // Input for environment and brand
        String inputEnvironment = sc.nextLine();
        String inputBrand = sc.nextLine();

        // Calling the static methods
        int totalTestsPassed = findTestPassedByEnv(autonomousCars, inputEnvironment);
        if (totalTestsPassed > 0) {
            System.out.println(totalTestsPassed);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar updatedCar = updateCarGrade(autonomousCars, inputBrand);
        if (updatedCar != null) {
            System.out.println(updatedCar.brand + "::" + updatedCar.grade);
        } else {
            System.out.println("No Car is available with the specified brand");
        }

        sc.close();
    }

    // Static method to find the sum of noOfTestsPassed for a given environment
    public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
        int sum = 0;
        for (AutonomousCar car : cars) {
            if (car.environment.equalsIgnoreCase(environment)) {
                sum += car.noOfTestsPassed;
            }
        }
        return sum;
    }

    // Static method to update the grade based on the rating calculation
    public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String brand) {
        for (AutonomousCar car : cars) {
            if (car.brand.equalsIgnoreCase(brand)) {
                int rating = (car.noOfTestsPassed * 100) / car.noOfTestsConducted;
                car.setGrade((rating >= 80) ? "A1" : "B2");
                return car;
            }
        }
        return null;
    }
}



class AutonomousCar {
    public int carId;
    public String brand;
    public int noOfTestsConducted;
    public int noOfTestsPassed;
    public String environment;
    public String grade;  // Added grade attribute

    // Constructor
    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
        this.grade = "";  // Initialize grade as empty
    }

    // Getter and Setter for grade
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

