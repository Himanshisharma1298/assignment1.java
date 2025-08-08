package java2025;
// create a class Calculator with a method addNumbers() that adds two numbers and prints the result
public class Calculator {
        public void addNumbers() {
            int x = 35;
            int y = 45;
            int sum = x + y;
            System.out.println("sum = " + sum);
        }
        public static void main(String[] args){
            Calculator g = new Calculator();
            g.addNumbers();
        }
}
