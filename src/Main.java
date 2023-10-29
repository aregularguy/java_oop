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
    }
}
