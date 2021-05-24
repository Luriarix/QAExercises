package exercises;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TemperatureConverterTest {
	static TemperatureConverter temp = new TemperatureConverter();

	@BeforeClass
	public static void setup() {
		System.out.println(temp.convertFahrenheitToCelsius(100));
		System.out.println(temp.convertCelsiusToFahrenheit(100));
		System.out.println(temp.convertKelvinToCelsius(100));
		System.out.println(temp.convertCelsiusToKelvin(100));
		System.out.println(temp.convertKelvinToFahrenheit(100));
		System.out.println(temp.convertFahrenheitToKelvin(100));
	}
	
	@Test
	public void convertFahrenheitToCelsiusTest() {
		assertEquals(37.7, temp.convertFahrenheitToCelsius(100), 0.1);
	} 
	
	@Test
	public void convertCelsiusToFahrenheitTest() {
		assertEquals(212, temp.convertCelsiusToFahrenheit(100), 0.1);
	} 
	
	@Test
	public void convertKelvinToCelsiusTest() {
		assertEquals(-173, temp.convertKelvinToCelsius(100), 0.1);
	} 
	
	@Test
	public void convertCelsiusToKelvinTest() {
		assertEquals(373, temp.convertCelsiusToKelvin(100), 0.1);
	} 
	
	@Test
	public void convertKelvinToFahrenheitTest() {
		assertEquals(-279.4, temp.convertKelvinToFahrenheit(100), 0.1);
	} 
	
	@Test
	public void convertFahrenheitToKelvinTest() {
		assertEquals(310.7, temp.convertFahrenheitToKelvin(100), 0.1);
	} 

}
