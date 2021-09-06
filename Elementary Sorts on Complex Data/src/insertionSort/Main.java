package insertionSort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		IPAddress[] ipAddress = new IPAddress[1000];
		
		writeToArray("C:\\Users\\MirzA\\Documents\\IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddress);
		
		InsertionSort.sort(ipAddress);
		
		for(int i=0;i<ipAddress.length;i++) {
			System.out.println(ipAddress[i]);
		}
		
		writeToFile("C:\\Users\\MirzA\\Documents\\SORTED-INSERTION.csv", ipAddress);
		System.out.println("Addresses are stored!");
		}
		
		public static void writeToFile(String path, IPAddress[] array) throws IOException {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for (int i = 0; i < array.length; i++)
			fw.write(array[i].toString());
			
			fw.close();
		}
		
		public static void writeToArray(String path, IPAddress[] array) throws IOException {
			Scanner scanner = new Scanner(new File(path));
			int i = 0;
			
			while(i < array.length) {
				String[] ipAddress = scanner.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				
				for (int j = 0; j < ipAddress.length; j++) {
					ipAddress[j] = ipAddress[j].replace("\"", "");
				}
				
				long ipFrom = Long.parseLong(ipAddress[0]);
				long ipTo = Long.parseLong(ipAddress[1]);
				String countryCode = ipAddress[2];
				String countryName = ipAddress[3];
				String region = ipAddress[4];
				String city = ipAddress[5];
				
				array[i] = new IPAddress(ipFrom, ipTo, countryCode, countryName, region, city);
				
				i++;
			}
			
			scanner.close();	
		}
}
