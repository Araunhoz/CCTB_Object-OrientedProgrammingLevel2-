public class TemperatureConverter {
	
	public static void main(String[] args) {
		double celsius = 30.0;
		double fahrenheit = convertToFahrenheit(celsius);
		System.out.printf("%.1f°C is %.1f°F%n", celsius, fahrenheit);
	}

	private static double convertToFahrenheit(double celsius) {
		return (9.0 / 5.0) * celsius + 32.0;
	}
}
