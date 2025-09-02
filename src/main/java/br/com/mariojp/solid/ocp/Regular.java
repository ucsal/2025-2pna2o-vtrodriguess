package br.com.mariojp.solid.ocp;

public class Regular extends DiscountCalculator {
	
	public double apply(double amount, CustomerType type) {
    switch (type){
        case REGULAR: return amount * 0.95;
        default: return amount;
    }
}

}
