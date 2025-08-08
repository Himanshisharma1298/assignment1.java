package java2025;

public class Circle {
    public void calculatorarea(){
        double radius = 7;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("area=" +  area);
    }
    public static void main(String[] args){
        Circle g = new Circle();
        g.calculatorarea();
    }
}
