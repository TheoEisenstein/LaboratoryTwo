package lab2Package;

import java.util.Scanner;

public class lab2Class1 {

	public static void main(String[] args) {
		
	boolean run = true;
	while (run) {
		Scanner scnr = new Scanner(System.in);
		double length = 0;
		double width = 0;
		double height = 0;
		
		
		System.out.println("This program will calculate the perimeter and area of various classrooms at Grand Circus");
		System.out.println("(Always remember to measure twice and cut once!)");
		
		System.out.println("Enter Length: ");
		
			length = scnr.nextDouble();
		
		System.out.println("Enter Width: ");
		
			width = scnr.nextDouble();
		
		System.out.println("Enter Height: ");
		
			height = scnr.nextDouble();
			double areaVariable = length*width;
			double perimeterVariable = 2*length*width;
			double volumeVariable = length*width*height;
			String getUserChoice = null;
		System.out.println("Using the specifications you have given: ");
		System.out.println("Area: " + areaVariable);
		System.out.println("Perimeter: " + perimeterVariable);
		System.out.println("The volume of the room would be:" + volumeVariable);
		
		System.out.println("Would you like to continue measuring rooms? y/n");
		
		String getUserChoice1 = scnr.next() ;
		if (getUserChoice1.equals("n"))
			run = false;
		
		}
	}
	}
