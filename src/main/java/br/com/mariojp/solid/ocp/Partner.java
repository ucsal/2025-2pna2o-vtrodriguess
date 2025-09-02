package br.com.mariojp.solid.ocp;

public class Partner extends DiscountCalculator {
	
	public double apply(double amount, CustomerType type){
        switch (type){
            case PARTNER: return amount * 0.88;
            default: return amount;
        }
    }

}
