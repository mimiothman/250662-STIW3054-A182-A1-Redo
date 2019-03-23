package redo_A1_2;

import redo_A1.Main;

public class manager_technical extends Main implements tech_factor{
private total_tfactor weight_tech;
	
	public void setStrategy(total_tfactor strategy){
		this.weight_tech = strategy;
	}
	@Override
	public double operation(int num1) {
		return this.weight_tech.operation(num1);
	}
}
