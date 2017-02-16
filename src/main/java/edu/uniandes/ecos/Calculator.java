package edu.uniandes.ecos;

import java.util.List;

public class Calculator {

	public double calculateMean(List<String> data){
		double result = 0;
		for(String number : data){
			//System.out.println(number);
			if(number != null)result += Double.parseDouble(number);
		}
		
		result = result/data.size();
		return result;
	}
	
	public double calculateDeviation(List<String> data, double mean ){
		double result = 0;
		for(String number : data){
			if(number != null)result +=  Math.pow(Double.parseDouble(number) - mean,2);
		}
		result = Math.sqrt(result/(data.size() -1));
		return result;
	}
	
}
