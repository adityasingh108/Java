package inheritance;

class superClass{
    public void display(){
        System.out.println("This is the super class");
    }
}

class subClass extends superClass{

    // @Override
    public void display() {
        System.out.println("This is the sub class");
    }
}

class overRIde {
    public static void main(String[] args) {
        superClass s1 = new superClass();
         s1.display();

        subClass s2 = new subClass();
        s2.display();

        // dynamic method dispatch
        superClass s3 = new subClass();
        s3.display();
         
    }
}