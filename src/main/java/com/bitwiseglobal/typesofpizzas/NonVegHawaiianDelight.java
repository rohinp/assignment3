package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;

public class NonVegHawaiianDelight extends Pizza {

	@SuppressWarnings("unused")
	private NonVegHawaiianDelight() {
	}

	public NonVegHawaiianDelight(SizeOfPizza size) {
		this.addSizeofpizza(size);
		this.addCost();
		this.deafultToppings.add(Toppings.Chicken_Salami);
		this.deafultToppings.add(Toppings.Pineapple);
		this.deafultToppings.add(Toppings.Jalapeno);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = this.getClass().getSimpleName() + "\n";

		return message + super.toString();
	}

	private void addCost() {
		if (this.getSizeofpizza().equals(SizeOfPizza.Small)) {
			this.setCost(110);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Medium)) {
			this.setCost(220);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Large)) {
			this.setCost(440);
		} else {
			throw new RuntimeException("Please add valid pizza size");
		}

	}
}