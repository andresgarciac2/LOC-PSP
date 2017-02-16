package edu.uniandes.ecos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {

	List<String> inputData = new ArrayList<String>();
	Calculator calc = new Calculator();
	
	public void fileReader(String path){
		InputStream input = getClass().getResourceAsStream(path);
		try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(input));
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		    	inputData.add(line);
		        line = br.readLine();
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double[] getResults(){
		double[] results = new double[2];
		results[0] = calc.calculateMean(inputData);
		results[1] = calc.calculateDeviation(inputData,results[0]);
		return results;
	}
	
}
