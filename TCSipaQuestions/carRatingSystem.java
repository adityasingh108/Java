package TCSipaQuestions;
 import java.util.*;

public class carRatingSystem {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int testCase = sc.nextInt(); sc.nextLine();

       // create  a array of object of the AutonomousCar
       AutonomousCar[] objofAutonomousCars = new AutonomousCar[testCase];

       while (testCase -- > 0 ) {

            int carId = sc.nextInt(); sc.nextLine();
            String brand = sc.nextLine();
            int testConducted = sc.nextInt(); sc.nextLine();
            int testpassed = sc.nextInt(); sc.nextLine();
            String enviroment = sc.nextLine();

            objofAutonomousCars[testCase] = new AutonomousCar(carId, brand, testConducted, testpassed , enviroment);
 
       }

       String inputEnviroment = sc.nextLine();
       String inputBrand = sc.nextLine();


       int  ans = findTestPassedByEnv(objofAutonomousCars, inputEnviroment);
       System.out.println(ans);



       String outPutans = updateCarGrade(objofAutonomousCars, inputBrand);
       System.out.println(inputBrand + "::" + outPutans);





       sc.close();
    }

    public static int findTestPassedByEnv(AutonomousCar[] obj , String inputEnviroment){
            int sum = 0 ; 
            for(int i =0 ; i<obj.length; i++){
                if(obj[i].enviroment.equalsIgnoreCase(inputEnviroment)){
                    sum += obj[i].testpassed;
                    // return obj[i];
                }
            }
            return sum;
    }

    public static String updateCarGrade(AutonomousCar[] obj , String inputBrand){

        for(int i = 0 ; i<obj.length; i++){
            if(obj[i].brand.equalsIgnoreCase(inputBrand)){
                int rating = (obj[i].testpassed * 100) / obj[i].testConducted;
                if(rating >= 80 ){
                    return "A1";
                }
            }

        }
        return "B1";
    }

    

}



class AutonomousCar{
    public int  carId ;
    public String brand;
    public int testConducted;
    public int testpassed;
    public String enviroment;

    AutonomousCar(int carId , String brand , int testConducted , int  testpassed , String enviroment){
        this.carId = carId;
        this.brand = brand;
        this.testConducted = testConducted;
        this.testpassed = testpassed;
        this.enviroment = enviroment;
    }
}
