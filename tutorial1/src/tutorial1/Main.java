/**
 * 
 */
package tutorial1;
import java.util.Scanner;
/**
 * @author ryor310575
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Non Primitive data type}
		 * */
		//String helloWorld="Hellow World!";
		/*
		 * Primitive data type
		 */
		//int helloWorld=5;
		//double helloWorld=5.5;
		//boolean helloWorld=true;
		//char helloWorld='F';
		/*
		 * Mathematical 
		 * Operators
		 */
		float helloWorld=56/5; //the iteger part of the división
		helloWorld=56 % 5;
		//System.out.print(helloWorld);
		/*
		 * Scanners to 
		 * Imput data
		 */
		Scanner sc = new Scanner(System.in); // Creo el Objeto para escanear
		String scanned = sc.next(); // Retorna cadenas
		int intScanned=sc.nextInt(); //retorna enteros
		
		System.out.print(intScanned);
		
	}

}
