import static java.lang.Math.abs;

class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("denominator can't be equal 0");
        }
        else if (numerator == 0) {
            this.numerator = 0;
            this.denominator = 0;
        }
        else if (numerator == denominator) {
            this.numerator = 1;
            this.denominator = 1;
        }
        else if (numerator < 0 && denominator < 0) {
            this.numerator = -1 * numerator;
            this.denominator = -1 * denominator;
        }
        else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        int x = FindGCD(abs(this.numerator), abs(this.denominator));
        this.numerator /= x;
        this.denominator /= x;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void printFraction() {
        System.out.println(getNumerator() + "/" + getDenominator());
    }

    public int FindGCD(int a, int b) {
        while (b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public void reduction(int a, int b) {
        int x = FindGCD(a,b);
        this.numerator /= x;
        this.denominator /= x;
    }

    public Fraction multiplication(Fraction other) {
        return new Fraction(this.numerator * other.getNumerator(), this.denominator * other.getDenominator());
    }
}
