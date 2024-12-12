class CarEngine {
    public void startEngine(){
        System.out.println("The car engine has Started.");
    }
} 

class Car2 {
    private String colour;
    public void carDetails(){
        System.out.println("Car Colour= "+colour);
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
} 

class Honda extends Car2{
    public void HondaStart(){
        CarEngine Honda_Engine = new CarEngine(); //composition
        Honda_Engine.startEngine();
    }
} 

public class comOOP {
    public static void main(String[] args) {  
        Honda HondaJazz = new Honda();
        HondaJazz.setColour("Black");
        HondaJazz.carDetails();
        HondaJazz.HondaStart();
    }
}
