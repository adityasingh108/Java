package TCSipaQuestions;

import java.util.Scanner;


public class mobileClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();sc.nextLine();


        // create a obj of mobile classs with the size of the tesrCase
        mobileStore[]   mobileStoresObject = new mobileStore[testCase];
        
        while (testCase -- > 0) {
            int id =sc.nextInt(); sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();

            mobileStoresObject[testCase] = new mobileStore(id, os, brand, price);
            // create a object with the data of the mobile store 
        }
        // get the input brandName 

        String brandName = sc.nextLine();

        // get the os 

        String inputOperatingSystem = sc.nextLine();

        double resultPrice = findPriceForGivenBrand(mobileStoresObject, brandName);
        if(resultPrice != 0){System.out.println(resultPrice);}
        else{System.out.println("Mobile not Found");}
            
        

        int resultId = getPhoneIdBasedOnOs(mobileStoresObject, inputOperatingSystem);
        if(resultId == 0){System.out.println(0);}
        else{System.out.println(resultId);}


        sc.close();
    }


    public static int  getPhoneIdBasedOnOs(mobileStore[] data , String inputOperatingSystem){
        int ans = 0 ;

        for(int i =0 ; i<data.length ; i++){
            if(data[i].os.equalsIgnoreCase(inputOperatingSystem)){
                return data[i].id;
            }
        }
        return ans;

    }

    public static double findPriceForGivenBrand(mobileStore[] data , String brandName ){
        
        for(int i =0 ; i<data.length; i++){
            if(data[i].brand.equalsIgnoreCase(brandName) && data[i].price >= 5000){
                return  data[i].price;
            }
        }
        return 0;
    }
}




class mobileStore{
    public int id ;
    public String os;
    public String brand;
    public double price;


    public mobileStore(int id , String os , String brand, double price){
        this.id = id;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
}
