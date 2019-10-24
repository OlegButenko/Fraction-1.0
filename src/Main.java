public class Main {
    public static void main(String[] args) {

        Fraction first_fraction = new Fraction(1,1);
        first_fraction.printFraction();

        Fraction second_fraction = new Fraction(2,2);
        Fraction third_fraction = new Fraction(3,3);
        Fraction fourth_fraction = second_fraction.multiplication(third_fraction);
        fourth_fraction.printFraction();

    }

}
