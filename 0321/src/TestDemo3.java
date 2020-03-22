class Calculator {
    private double num1;
    private double num2;
    public double add(double n, double m) {
        double sum = n + m;
       return sum;
    }
    public double subtract(double n,double m) {
        double sum = n - m;
        return sum;
    }
    public double multiply(double n,double m) {
        double sum = n * m;
        return sum;
    }
    public double divide(double n,double m) {
        double sum = n / m;
        return sum;
    }
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {

        this.num2 = num2;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Calculator num = new Calculator();
        num.setNum1(1.2);
        num.setNum2(2.4);
        double num1 = num.getNum1();
        double num2 = num.getNum2();
        System.out.println(num.add(num1, num2));
        System.out.println(num.subtract(num1, num2));
        System.out.println(num.multiply(num1, num2));
        System.out.println(num.divide(num1, num2));
    }
}
