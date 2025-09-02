package br.com.mariojp.solid.ocp;

public class Premium extends DiscountCalculator{
	
	public double apply(double amount, CustomerType type){
        switch (type){
            case PREMIUM: return amount * 0.90;
            default: return amount;
        }
    }

}
