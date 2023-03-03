package AbstractClass;

abstract class hospital{
    abstract void doctor();
    abstract void nurse();
    abstract void patient();
    abstract void appointment();
}

class myHospital extends hospital{
    void doctor(){
        System.out.println("Doctor is available");
    }
    void nurse(){
        System.out.println("Nurse is available");
    }
    void patient(){
        System.out.println("Patient is available");
    }
    void appointment(){
        System.out.println("Appointment is available");
    }
}




class exampleAbstract{
    public static void main(String[] args) {
        hospital h1 = new myHospital(); // dynamic method dispatch 
        h1.doctor();
        h1.nurse();
        h1.patient();
        h1.appointment();

    }
}