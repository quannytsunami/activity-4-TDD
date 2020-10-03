package skunk.domain;

public class PredictableDie {
	
	private int[] theRolls;
	private int nextInt;
	private int lastRoll; 

	public PredictableDie(int[] is) {
		this.theRolls = is;
		this.nextInt = 0;
	}

	public void roll() {
		this.lastRoll = this.theRolls[this.nextInt];
		this.nextInt++;
		if (this.nextInt == this.theRolls.length)
		{
			this.nextInt = 0;
		}
		
	}

	public Object getLastRoll() {
		return this.lastRoll;
	}

}
