import polymorphism.compileTime;
class base {
    public void breakk() {
        System.out.println("this is base class");
    }
}

class child extends base {
    public void breakk() {
        System.out.println("this is child class break");
    }
    public void sing()
    {System.out.println("this is child class sing");}
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        base bb = new base();
        bb.breakk();
        child cd = new child();
        cd.breakk();
        cd.sing();
        
        System.out.println("the multiply of 3 and 5 is " + compileTime.multiply(3,5));
        System.out.println("the multiply of 3 and 5 is " + compileTime.multiply(3.5,5.4));
    }
}
