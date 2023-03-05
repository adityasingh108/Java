package staticAndFinal;


class HondaCity{
    static double price = 500;
    int a = 5;
    int b = 6;
    // static metod only access  the static property of the classes
    static double OnRoadPrice(String city){
        if(city == "delhi"){
            return price + price*0.1;

        }
        else{
            return price + price *0.5;
        }
    }
}

public class staticKeyWordPratice {
    public static void main(String[] args) {
        // static member are access with or without the object 
        /*HondaCity car1 = new HondaCity();
        System.out.println(car1.price); */
        
        System.out.println(HondaCity.price);
    }
}
