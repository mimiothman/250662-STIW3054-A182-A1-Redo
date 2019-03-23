package redo_A1_3;

import redo_A1.Main;

public class manager_man extends Main implements man_hours{
private total_mhours ER;
	
	public void setStrategy(total_mhours strategy){
		this.ER = strategy;
	}
	@Override
	public double operation(int num3) {
		return this.ER.operation(num3);
	}
}
