package redo_A1_3;

import redo_A1.Main;

public class manager_report extends Main implements report{
private total_report rept;
	
	public void setStrategy(total_report strategy){
		this.rept = strategy;
	}
	@Override
	public double operation(int num4) {
		return this.rept.operation(num4);
	}
}
