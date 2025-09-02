import br.com.mariojp.solid.ocp.*;

public class Main {
	public static void main(String[] args) {
		DiscountCalculator part = new Partner();
		DiscountCalculator pre = new Premium();
		DiscountCalculator reg = new Regular();
		System.out.println("REGULAR 100 -> " + reg.apply(100, CustomerType.REGULAR));
		System.out.println("PREMIUM 100 -> " + pre.apply(100, CustomerType.PREMIUM));
		// PARTNER deveria ter 12%
		System.out.println("PARTNER 100 -> " + part.apply(100, CustomerType.PARTNER));
	}
}
