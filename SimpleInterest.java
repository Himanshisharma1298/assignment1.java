package java2025;

public class SimpleInterest {
    public void calculatorInterest(){
        double principal = 1000;
        double time = 2;
        double rate = 5;
        double SimpleInterest = (principal * time * rate)/100;
        System.out.println("SI=" + SimpleInterest);
    }
    public static void main(String[] args){
        SimpleInterest g = new SimpleInterest();
        g.calculatorInterest();
    }
}
