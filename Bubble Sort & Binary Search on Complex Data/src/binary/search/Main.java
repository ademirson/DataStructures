package binary.search;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		IPAddress[] ipAddresses = new IPAddress[10000];
		int[] octets = new int[4];
		long longIP;
		@SuppressWarnings("resource")
		Scanner readinput = new Scanner(System.in);
		
		writeToArray("C:\\Users\\MirzA\\Documents\\IP-COUNTRY-REGION-CITY-SORTED.csv", ipAddresses);
        
		System.out.println("Enter an IP address whose data you want to retrieve: ");
		String inputIP = readinput.nextLine();
		
		LongToIP(inputIP, octets);
		
		longIP = IPToLong(octets);
		
		searchResult(ipAddresses, longIP);
	}
	
	public static long IPToLong(int[] arr) {
		long longIP = 16777216 * arr[0] + 65536 * arr[1] + 256 * arr[2] + arr[3];
		return longIP;
	}
	
	public static void writeToArray(String path, IPAddress[] arr) throws IOException {
		Scanner scanner = new Scanner(new File(path));
		int i = 0;
		
		while(i < arr.length) {
			String[] ipAddressStrings = scanner.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
			
			for (int j = 0; j < ipAddressStrings.length; j++) {
				ipAddressStrings[j] = ipAddressStrings[j].replace("\"", "");
			}
			
			long ipFrom = Long.parseLong(ipAddressStrings[0]);
			long ipTo = Long.parseLong(ipAddressStrings[1]);
			String countryCode = ipAddressStrings[2];
			String countryName = ipAddressStrings[3];
			String regionName = ipAddressStrings[4];
			String cityName = ipAddressStrings[5];
			
			arr[i] = new IPAddress(ipFrom, ipTo, countryCode, countryName, regionName, cityName);
			
			i++;
		}
		
		scanner.close();	
	}
	
	public static void LongToIP(String s, int[] arr) {
		String[] parts = s.split("\\.");
		
		for (int k = 0; k < 4; k++) {
			arr[k] = Integer.parseInt(parts[k]);
		}
	}
	
	public static void searchResult(IPAddress[] arr, long key) {
		int res = BinarySearch.search(arr, key);
		
		if(res != -1) {
			System.out.println("Country code: " + arr[res].countryCode + "\nCountry name: " + arr[res].countryName + "\nRegion: " + arr[res].regionName + "\nCity: " + arr[res].cityName);
		} else {
			System.out.println("IP address not found");
		}
	}
}
