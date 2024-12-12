class First {
    public void display(){    
        System.out.println("World"); 
    }
}
 
class Second extends First {
    public void show(){ 
        System.out.println("Hello"); 
    }
}

public class inhOOP {
    public static void main(String[] args){
        Second a = new Second();
        a.show();
        a.display();
        
    }
}
