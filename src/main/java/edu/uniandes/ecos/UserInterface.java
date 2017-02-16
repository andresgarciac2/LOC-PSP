package edu.uniandes.ecos;

public class UserInterface {

	/**
	 * 
	 * main: aca se imprimen los datos en consola
	 * @param args
	 */
	public static void main(String[] args) {
		Reader reader = new Reader();
		reader.fileReader("data.txt");
		System.out.println("Media: "+reader.getResults()[0]);
		System.out.println("Desviacion estandar: " + reader.getResults()[1]);
		// TODO Auto-generated method stub
	}

}
