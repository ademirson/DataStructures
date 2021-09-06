package Radix;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
	IPAddress[] ipAddress = new IPAddress[4600000];
	long start=System.currentTimeMillis();
	System.out.println("Sorting....");
	writeToArray("C:\\Users\\MirzA\\Documents\\IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddress);
	
	Radix.sort(ipAddress);
	
	System.out.println("elapsed:  " + (System.currentTimeMillis()-start)+ " ms");
	/*first attempt: 54458 ms
	 Second attempt: 68935 ms
	 Third attempt: 59554 ms
	 */
	
	writeToFile("C:\\Users\\MirzA\\Documents\\SORTED-RADIX.csv", ipAddress);
	System.out.println("Addresses are stored!");
	
	/*for(int i=0;i<ipAddress.length;i++) {
	System.out.println(ipAddress[i]);
		}*/
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
