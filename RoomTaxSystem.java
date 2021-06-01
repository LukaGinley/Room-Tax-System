package Coursework;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class RoomTaxSystem {

	public static void main(String[] args) throws FileNotFoundException {

Scanner console = new Scanner(System.in);
Scanner inFile = new Scanner(new FileReader("Rooms.txt"));
			
	int SpecifiedTaxRate = 0;
	int TaxRate = 20;	

// Ask the user if they want to specify a custom tax rate.
System.out.println("--- Welcome Manager ---");
System.out.print("Would you like to specify a custom tax rate? (Yes/No): ");
			
// Loops the file taken from "Rooms.txt" and uses the data at different points in the program.
while (inFile.hasNext()) {
			
	String RoomTypeSingle = inFile.next();
	int BookingsSingle = inFile.nextInt();
	double RoomPriceSingle = inFile.nextDouble();
	double IncomeSingle = BookingsSingle * RoomPriceSingle;
			
	String RoomTypeDouble = inFile.next();
	int BookingsDouble = inFile.nextInt();
	double RoomPriceDouble = inFile.nextDouble();
	double IncomeDouble = BookingsDouble * RoomPriceDouble;
			
	String RoomTypeSuite = inFile.next();
	int BookingsSuite = inFile.nextInt();
	double RoomPriceSuite = inFile.nextDouble();
	double IncomeSuite = BookingsSuite * RoomPriceSuite;
			
// Prompt the user to enter a custom tax rate of their choosing if the answer is "yes".
if (console.next().equalsIgnoreCase("yes")) {
	System.out.println("Please enter your specified tax rate(%): ");
	SpecifiedTaxRate = console.nextInt();
			
// Determines the tax on each room type by using the users specified tax rate and runs it against these equation.
	double TaxOnRoomSingle = (IncomeSingle*SpecifiedTaxRate/100);
	double TaxOnRoomDouble = (IncomeDouble*SpecifiedTaxRate/100);
	double TaxOnRoomSuite = (IncomeSuite*SpecifiedTaxRate/100);

// Prints the text file to screen with the addition of adding the equation variable.
System.out.printf("Room Type: " + RoomTypeSingle);
System.out.printf(", Bookings: " + BookingsSingle);
System.out.printf(", Room Price: £" + RoomPriceSingle);
System.out.printf(", Income: £" + IncomeSingle);
System.out.printf(", Tax: £" + TaxOnRoomSingle);

System.out.printf("\nRoom Type: " + RoomTypeDouble);
System.out.printf(", Bookings: " + BookingsDouble);
System.out.printf(", Room Price: £" + RoomPriceDouble);
System.out.printf(", Income: £" + IncomeDouble);
System.out.printf(", Tax: £" + TaxOnRoomDouble);

System.out.printf("\nRoom Type: " + RoomTypeSuite);
System.out.printf(", Bookings: " + BookingsSuite);
System.out.printf(", Room Price: £" + RoomPriceSuite);
System.out.printf(", Income: £" + IncomeSuite);
System.out.printf(", Tax: £" + TaxOnRoomSuite);

// Calculates the total tax from the users specified tax rate and displays it to the console.
	double TotalTax = (TaxOnRoomSingle + TaxOnRoomDouble + TaxOnRoomSuite);
	System.out.println("\nTotal Tax: £" + TotalTax);

// If the user does not want a custom tax rate then the system will run the assumed tax rate and display it on the console.
} else { 
	System.out.println("Assuming Tax Rate(%): " + TaxRate);

// Determines the tax on each room type using the assumed tax rate and runs it against these equations.
	double TaxOnRoomSingle = (IncomeSingle*TaxRate/100);
	double TaxOnRoomDouble = (IncomeDouble*TaxRate/100);
	double TaxOnRoomSuite = (IncomeSuite*TaxRate/100);

// Prints the text file to screen with the addition of adding the equation variables.
System.out.printf("Room Type: " + RoomTypeSingle);
System.out.printf(", Bookings: " + BookingsSingle);
System.out.printf(", Room Price: £" + RoomPriceSingle);
System.out.printf(", Income: £" + IncomeSingle);
System.out.printf(", Tax: £" + TaxOnRoomSingle);	

System.out.printf("\nRoom Type: " + RoomTypeDouble);
System.out.printf(", Bookings: " + BookingsDouble);
System.out.printf(", Room Price: £" + RoomPriceDouble);
System.out.printf(", Income: £" + IncomeDouble);
System.out.printf(", Tax: £" + TaxOnRoomDouble);

System.out.printf("\nRoom Type: " + RoomTypeSuite);
System.out.printf(", Bookings: " + BookingsSuite);
System.out.printf(", Room Price: £" + RoomPriceSuite);
System.out.printf(", Income: £" + IncomeSuite);
System.out.printf(", Tax: £" + TaxOnRoomSuite);

// Calculates the total tax from the assuming tax rate and displays it on the console.
double TotalTax = (TaxOnRoomSingle + TaxOnRoomDouble + TaxOnRoomSuite);
System.out.println("\nTotal Tax: £" + TotalTax);
}

// Calculates the total income from the text file and displays it on the console.
double TotalIncome = (IncomeSingle + IncomeDouble + IncomeSuite); 
System.out.println("Total Income: £" + TotalIncome);
}

// Closes the file and resets the loop.
inFile.close();

}
	}


