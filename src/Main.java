public class Main {
    public static void main(String[] args) {

        Fraction a = new Fraction(1,1);
        a.printFraction();

        Fraction b = new Fraction(2,2);
        Fraction c = new Fraction(3,3);
        Fraction d = b.multiplication(c);
        d.printFraction();

    }

}
