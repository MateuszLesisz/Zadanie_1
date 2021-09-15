package pl.infoshare;

public class Main {
    public static double a = 0.1;
    public static double b = 0.2;


    public static void main(String[] args) {
	// write your code here
        System.out.println(a + " + " + b + " = " + addition());
        System.out.println(a + " - " + b + " = " + substraction());
        System.out.println(a + " * " + b + " = " + multiplication());
        System.out.println(a + " / " + b + " = " + division());
    }
    public static double addition() {
        return a + b;
    }
    public static double substraction() {
        return a - b;
    }
    public static double multiplication() {
        return a * b;
    }
    public static double division() {
        return a / b;
    }

}
