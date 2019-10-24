public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void printFraction() {
        System.out.println(getNumerator() + "/" + getDenominator());
    }

    public Fraction multiplication(Fraction other) {
        Fraction a = new Fraction(this.numerator * other.getNumerator(), this.denominator * other.getDenominator());
        return a;
    }
}
