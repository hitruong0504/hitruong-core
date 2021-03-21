package Lab4;

public class Fraction {
    private int numerator;
    private int denominator;


    // constructor
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    // methods
    public Fraction add(Fraction f) {
        Fraction r = new Fraction();
        r.numerator = (this.numerator * f.denominator) + (this.denominator * f.numerator);
        r.denominator = (this.denominator * f.denominator);

        return r; // r is result
    }

    public Fraction sub(Fraction f) {
        Fraction r = new Fraction();
        r.numerator = (this.numerator * f.denominator) - (this.denominator * f.numerator);
        r.denominator = (this.denominator * f.denominator);

        return r;
    }

    public Fraction mul(Fraction f) {
        Fraction r = new Fraction();
        r.numerator = (this.numerator * f.numerator);
        r.denominator = (this.denominator * f.denominator);
        return r;
    }

    public Fraction div(Fraction f) {
        Fraction r = new Fraction();
        r.numerator = this.numerator * f.denominator;
        r.denominator = this.denominator * f.numerator;

        return r;
    }

    public String toString() {

        return "Fraction[num= " + this.numerator + ", den= " + this.denominator + "]";
    }
    
    // tim uoc chung lon nhat
    private int ucln(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return ucln(b, a % b);
        }
    }

    public void reducer() {
        int x = this.ucln(this.numerator, this.denominator);
        this.numerator /= x;
        this.denominator /= x;
    }
}
