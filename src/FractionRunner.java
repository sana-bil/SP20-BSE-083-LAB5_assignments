import java.util.Scanner;
public class FractionRunner {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(50,100);
        Fraction f3 = f1.ratio(f2);
        f3.display();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number of fraction");
        int n1= s.nextInt();
        System.out.println("Enter second number of fraction");
        int n2 = s.nextInt();

        Fraction f4 = new Fraction(n1,n2);
        System.out.println("Are two Fractions identical? "+ f1.equals(f4,f2));



    }
}
