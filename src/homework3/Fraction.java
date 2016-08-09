package homework3;

//2. ???????? ????? ????? (Fraction), ???????? ????????? ? ??????????? ? ??????????? ????????? ????????:

//- ???????? ?????? (????? Fraction add(Fraction frac))
//- ????????? (????? Fraction sub(Fraction frac))
//- ????????? (????? Fraction mul(Fraction frac))
//- ??????? (????? Fraction div(Fraction frac))
//- ?????????? ? ??????(????? String toString())
//- ????? (????? void print())

public class Fraction {

	int numerator;
	int denominator;

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction add(Fraction frac) {
		if (frac.denominator != this.denominator) {
			// a/b + c/d = (a*d + b*c)/(b*d)
			return new Fraction((this.numerator * frac.denominator + this.denominator * frac.numerator),
					(this.denominator * frac.denominator));
		} else {
			return new Fraction(this.numerator + frac.numerator, this.denominator);

		}

	}

	public Fraction sub(Fraction frac) {
		if (frac.denominator == this.denominator) {
			return new Fraction(this.numerator - frac.numerator, this.denominator);
		} else {
			return new Fraction((this.numerator * frac.denominator - this.denominator * frac.numerator),
					(this.denominator * frac.denominator));
		}
	}

	public Fraction mul(Fraction frac) {
		return new Fraction(this.numerator * frac.numerator, this.denominator * frac.denominator);
	}
	
	public Fraction div(Fraction frac){
		return new Fraction(this.numerator * frac.denominator, this.denominator * frac.numerator);
		
	}
	
	public String toString(){
		return this.numerator + " / " + this.denominator;
	}
	
	public void print(){
		System.out.println(this.toString());
	}

}
