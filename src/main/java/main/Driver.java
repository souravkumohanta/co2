package main;
import model.GreenModel;
import Service.calculate;
import java.util.concurrent.Callable;
import picocli.CommandLine;

@CommandLine.Command(name = "co2-calculator",
aliases = {"co2", "t-m"},
version = "1.0.0",
mixinStandardHelpOptions = true,
requiredOptionMarker = '*',
description = "This is a Sub Command to accept transporation method , distance travelled and unit :",
header = "enter transporation method and distance",
optionListHeading = "%nOptions are:%n",
footerHeading = "%n",
footer = "%n please enter parameters to go again")
public class Driver implements Callable<Integer>{

	GreenModel object1=new GreenModel();
	
	calculate obj=new calculate();
	
	public Integer call() throws Exception {
		
		/**
		 * @passed distance
		 * @passed vehicle
		 * @passed unit
		 * @passed weightUnit
		 * 
		 * calling the setters and getters to pass the value through the object .
		 */
		
		object1.setDistance(distance);
		object1.setVehicle(vehicle);
		object1.setUnit(unit);
		object1.setWeightUnit(unitWeight);
		
		/**
		 * 
		 * 
		 * calling the same object as a parameter to pass onto the method  .
		 * it saves memory because object is not created at each request.
		 *  Only single instance is reused again and again.
		 */
		System.out.println("Your trip caused "+obj.cal(object1));
		return 0;
		
	}
	
	 @CommandLine.Option(
	            names = {"-d", "--distance","-distance"},
	            required = true,
	            description = "distance travelled")
	    String distance;
	

	    @CommandLine.Option(
	            names = {"-tm","--transportation-method","-transportation-method"},
	            required = true,
	            description = "Enter the vehicle type"
	    )
	    String vehicle;
	    
	    @CommandLine.Option(
	            names = {"-output","--output","-o"},
	            required = false,
	            description = "Enter the unit of weight :"
	    )
	    String unitWeight;
	    
	    @CommandLine.Option(
	            names = {"-unit-of-distance","-ud","--unit-of-distance"},
	            required = false,
	            description = "Enter the unit of distance :"
	    )
	    String unit;
	    
	    
	    public static void main(String[] args) {
	    	
	    	  int exit = new CommandLine(new Driver())
	                  .setCaseInsensitiveEnumValuesAllowed(true)
	                  .execute(args);
	          System.exit(exit);

		}
	
	

}

