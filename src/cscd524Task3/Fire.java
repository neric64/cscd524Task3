package cscd524Task3;

public class Fire {
	private double cleave, decay;
	
	public Fire(double cleave, double decay) {
		this.cleave = cleave;
		this.decay = decay;
	}
	
	public double getCleave() {
		return this.cleave;
	}
	
	public double getDecay() {
		return this.decay;
	}
	
	@Override
	public String toString() {
		return "I'm a fire";
	}
}
