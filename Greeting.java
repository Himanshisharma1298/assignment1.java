package java2025;

public class Greeting {
    public void say(String name) {
        System.out.println("Hello, " + name + "! Welcome to java programming.");
    }
    public static void main(String[] args){
        Greeting g = new Greeting();
        g.say("Himanshi");
    }
}
