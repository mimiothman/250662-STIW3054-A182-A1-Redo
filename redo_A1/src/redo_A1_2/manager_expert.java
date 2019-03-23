package redo_A1_2;

import redo_A1.Main;

public class manager_expert extends Main implements expert_factor{
	
private total_efactor weight_expt;
	
	public void setStrategy(total_efactor strategy){
		this.weight_expt = strategy;
	}
	@Override
	public double operation(int num2) {
		return this.weight_expt.operation(num2);
	}
}
