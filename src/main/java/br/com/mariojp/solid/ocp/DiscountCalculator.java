package br.com.mariojp.solid.ocp;

public abstract class DiscountCalculator {
    public abstract double apply(double amount, CustomerType type);
}
