public class Fraction {
    //attributes
    private int numer;
    private int denom;

    //constructors
    public Fraction() {
        this.numer = 0;
        this.denom = 1;
    }

    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public Fraction(Fraction f){
        this.numer = f.numer;
        this.denom = f.denom;
    }

    public String toString() {
        return this.numer + "/" + this.denom;
    }

    public boolean equals(Object f) {
        if (f instanceof Fraction) {
            Fraction item = (Fraction) f;

            if (item.numer == this.numer && item.denom == this.denom) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}