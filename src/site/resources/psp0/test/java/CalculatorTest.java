package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.java.Calculator;

public class CalculatorTest {

	Calculator calc = new Calculator();
	   @Test
	   public void columnOneTest() {	 
	      assertTrue(calc.calculateMean(getDataColumnOne()) == 550.6); 
	      assertTrue(calc.calculateDeviation(getDataColumnOne(),
	    		  calc.calculateMean(getDataColumnOne())) == 572.026844746915); 
	   }
	   
	   @Test
	   public void columnTwoTest() {
	      assertTrue(calc.calculateMean(getDataColumnTwo()) == 60.32000000000001); 
	      assertTrue(calc.calculateDeviation(getDataColumnTwo(),
	    		  calc.calculateMean(getDataColumnTwo())) == 62.25583060601187); 
	   }
	   
	   public List<String> getDataColumnOne(){
		   List<String> data = new ArrayList<String>();
		   data.add("160");
		   data.add("591");
		   data.add("114");
		   data.add("229");
		   data.add("230");
		   data.add("270");
		   data.add("128");
		   data.add("1657");
		   data.add("624");
		   data.add("1503");
		   return data;
	   }
	   public List<String> getDataColumnTwo(){
		   List<String> data = new ArrayList<String>();
		   data.add("15.0");
		   data.add("69.9");
		   data.add("6.5");
		   data.add("22.4");
		   data.add("28.4");
		   data.add("65.9");
		   data.add("19.4");
		   data.add("198.7");
		   data.add("38.8");
		   data.add("138.2");
		   return data;
	   }
	
}
