//*************************************************************************
// SphereVolumeSurfaceCalculator.java    UNIT 3
//
// Ibrahim Sinan T00636119
// COMP 1131 / Assignment 2 / Chapter 3: "Using Classes and Objects"
//
// This application prompts the user to enter the radius of a sphere
// and calculates the volume & surface of the sphere and prints the output
// to four decimal place.
//*************************************************************************


import java.util.Scanner;
import java.text.DecimalFormat;

public class SphereVolumeSurfaceCalculator {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.####");
		
		
		final double sphereConstant = 4.0;
		double radius, volume, surface;
		
		//Prompts user to enter a radius 
		System.out.print("Enter the radius of a sphere: ");
		radius = user_input.nextDouble();
		
		//Calculate Volume and prints result
		volume = (sphereConstant * Math.PI * Math.pow(radius, 3))/3;
		System.out.println("Volume of Sphere : " + fmt.format(volume));
		
		//Calculates Surface and prints result
		surface = sphereConstant * Math.PI * (Math.pow(radius, 2));
		System.out.println("Surface of Sphere: " + fmt.format(surface));
		
	}

}
