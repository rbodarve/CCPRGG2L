class Person {
    public void intro() {
        System.out.println("I am a person");
    }
}

class Male extends Person {
    public void intro() {
        System.out.println("I am a male");
    }
}

class Female extends Person {
    public void intro() {
        System.out.println("I am a female");
    }
}

public class polyOOP {
    public static void main(String[] args) {
        Person Pinoy = new Person();  
        Person Erap = new Male();  
        Person Gloria = new Female();  
        Pinoy.intro();
        Erap.intro();
        Gloria.intro();
  }
}
