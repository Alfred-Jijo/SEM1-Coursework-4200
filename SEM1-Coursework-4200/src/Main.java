import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Main {
	static Scanner reader = new Scanner(System.in);
	private static final double defaultTaxRate = 0.20; // 20%
	public static final String fileName = "rooms.txt";
	
	public static void main(String[] args)
		throws IOException {
		FileReader fileStream = new FileReader(fileName);
		Scanner fileReader = new Scanner(fileStream);
		
		System.out.println("- - Room Tax System - -");
		System.out.print("Specify Custom Tax Rate [Y|N] : ");
		String input = reader.nextLine();
		
		double taxRate;
		if (input.equalsIgnoreCase("Y")) {
			System.out.print("Specify Tax Rate (%) : ");
			taxRate = reader.nextDouble() / 100;
		} else {
			System.out.println("Assuming Tax Rate = 20.0%");
			taxRate = defaultTaxRate;
		}
		
		// Extra Whitespace to match desired output (Appendix B/C)
		System.out.println();
		
		double totalIncome = 0;
		double totalTax = 0;
		
		// Loop through room data and calculate totals
		while (fileReader.hasNextLine()) {
			String roomType = fileReader.nextLine().trim();
			
			// Skip empty lines
			if (roomType.isEmpty()) {
				continue;
			}
			
			int bookings = Integer.parseInt(fileReader.nextLine().trim()); // Number of bookings
			double roomPrice = Double.parseDouble(fileReader.nextLine().trim()); // Room price
			
			double income = bookings * roomPrice;
			double tax = income * taxRate;
			
			totalIncome += income;
			totalTax += tax;
			
			System.out.printf("Room Type : %s, Bookings : %d, Room Price : £%.2f, Income : £%.2f, Tax : £%.2f\n",
				roomType, bookings, roomPrice, income, tax);
		}
		
		
		System.out.println();
		System.out.printf("Total Income : £%.2f\n", totalIncome);
		System.out.printf("Total Tax : £%.2f\n", totalTax);
		
		fileReader.close();
	}
}
