package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(0), LIQUID(22.55), GAS(100);
	
	private double celsiusTemp;
	private StatesOfMatter(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}

	double convertToFahrenheit(double temp) {
		return (temp * 9/5) + 32;
	}
	double getCalsiusTemp() {
		return celsiusTemp;
	}
}
