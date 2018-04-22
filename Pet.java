public class Car {
	private String brakeCondition;
	
	protected void brake(int pedalPressure) {
		boolean useRegularBreaks;
		useRegularBreaks = checkForAntilockBreaks(pedalPressure);

	}
	private boolean checkForAntilockBreaks(int pressure) {
		if (pressure > 1000) {
			return true;
			
			
		}
		else {
			return false;
		}
	}
	void useRegularBreaks() {
		System.out.println("Regular breaks used");
	}
	private void useAntilockBreaks() {
		System.out.println("Antilock breaks used");
	}

}
