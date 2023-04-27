package testService;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Service.calculate;
import model.GreenModel;
/**
 * 
 * @author sourav mohanta
 *Writing unit test cases for the logic of the code
 *to test the calculate and the data methods .
 */
public class TestCalculate {
	
	calculate calci=new calculate();
	GreenModel obj=new GreenModel();
	/**
	 * 
	 * @author sourav mohanta
	 *Writing unit test cases for the logic of the code
	 *to test the calculate with all possible scenarios covered as per Test Driven Development.
	 */
	@Test
	public void testCalkg()
	{
		obj.setDistance("10");
		obj.setVehicle("bus");
		obj.setUnit("km");
		obj.setWeightUnit("kg");
		String ss= calci.cal(obj);
		assertEquals("0.27kg of CO2-equivalent.", ss);
	}
	@Test
	public void testCalg()
	{
		obj.setDistance("10");
		obj.setVehicle("bus");
		obj.setUnit("m");
		obj.setWeightUnit("g");
		String ss= calci.cal(obj);
		assertEquals("0.27g of CO2-equivalent.", ss);
	}
	@Test
	public void testCalm()
	{
		obj.setDistance("10");
		obj.setVehicle("bus");
		obj.setWeightUnit("g");
		String ss= calci.cal(obj);
		assertEquals("270.0g of CO2-equivalent.", ss);
	}
	/**
	 * Test cases for both scenarios
	 */
	@Test
	public void mapTestpass()
	{
		String vehicle="bus";
	
		assertEquals(calci.referMap(vehicle),27);
	}
	@Test
	public void mapTestfail()
	{
		String vehicle="tracktor";
	
		assertEquals(calci.referMap(vehicle),0);
	}
}
