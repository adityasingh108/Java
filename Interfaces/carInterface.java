package Interfaces;

// create a class phone and its featue should be camera , music player
class phone{
    public void call(){
        System.out.println("calling");
    }

    public void msg(){
        System.out.println("Sending message");

    }
}

//Camera interface
interface camra{
    public void record();
    public void clickPhoto();
}

// musicPlayer Interface

interface musicPlayer{
    public void play();
    public void pauseMusic();
}

// now create a smatphone that inherits the phone class and features is musicPlayer and camera 

class smartPhone extends phone implements camra , musicPlayer{
    public void record(){
        System.out.println("camera of the smartPhone is recording");
    }
    public void clickPhoto(){
        System.out.println("camera of the smartPhone is clickPhoto");
    }

    public void play(){
        System.out.println("camera of the smartPhone is playing the music");
    }

    public void pauseMusic(){
        System.out.println("camera of the smartPhone is pause the music");
    }
    
}


public class carInterface {
    public static void main(String[] args) {
        // create a obect of the smartphone 
        smartPhone samsung = new smartPhone(); // dyamic dispatcing or run time polymorphism  

        samsung.call();
        samsung.msg();
        samsung.record();
        samsung.clickPhoto();
        samsung.play();
        samsung.pauseMusic();
    }
}
