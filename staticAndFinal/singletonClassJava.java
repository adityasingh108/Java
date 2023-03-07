package staticAndFinal;

// create a singleton class with which have only one control over the class
// and we can't create more than one object of the class

class CoffeMachine {
    private float water;
    private float milk;
    private float coffee;
    private float sugar;
    private float tea;
    private float chocolate;
    private float price;

    static private CoffeMachine myCofee = null;

    private CoffeMachine() {
        water = 0;
        milk = 0;
        coffee = 0;
        sugar = 0;
        tea = 0;
        chocolate = 0;
        price = 0;

    }

    public void setWater(float water) {
        this.water = water;
    }

    public void setMilk(float milk) {
        this.milk = milk;
    }

    public void setCoffee(float coffee) {
        this.coffee = coffee;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public void setTea(float tea) {
        this.tea = tea;
    }

    public void setChocolate(float chocolate) {
        this.chocolate = chocolate;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWater() {
        return water;
    }

    public float getMilk() {
        return milk;
    }

    public float getCoffee() {
        return coffee;
    }

    public float getSugar() {
        return sugar;
    }

    public float getTea() {
        return tea;
    }

    public float getChocolate() {
        return chocolate;
    }

    public float getPrice() {
        return price;
    }

    static CoffeMachine getInstance() {
        if (myCofee == null) {
            myCofee = new CoffeMachine();
        }
        return myCofee;
    }

}

public class singletonClassJava {
    public static void main(String[] args) {
        CoffeMachine myCofee = CoffeMachine.getInstance();
        myCofee.setCoffee(10);
        myCofee.setMilk(10);
        myCofee.setSugar(10);
        myCofee.setWater(10);
        myCofee.setTea(10);
        myCofee.setChocolate(10);
        myCofee.setPrice(10);

        System.out.println("Water: " + myCofee.getWater());
        System.out.println("Milk: " + myCofee.getMilk());
        System.out.println("Coffee: " + myCofee.getCoffee());
        System.out.println("Sugar: " + myCofee.getSugar());
        System.out.println("Tea: " + myCofee.getTea());
        System.out.println("Chocolate: " + myCofee.getChocolate());
        System.out.println("Price: " + myCofee.getPrice());

        CoffeMachine myCofee2 = CoffeMachine.getInstance();
        myCofee2.setCoffee(20);
        System.out.println("Water: " + myCofee2.getWater());
        System.out.println("Milk: " + myCofee2.getMilk());

    }
}
