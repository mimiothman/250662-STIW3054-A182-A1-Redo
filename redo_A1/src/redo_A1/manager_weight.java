package redo_A1;

public class manager_weight extends Main implements actor_usecase  {
	
private project_size weight;
	
	public void setStrategy(project_size strategy){
		this.weight = strategy;
	}

	@Override
	public int operation(int num1, int num2) {
		return this.weight.operation(num1, num2);
	}
}
