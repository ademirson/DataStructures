package shellSort;



public class IPAddress implements Comparable<IPAddress> {
private static final long serialVersionUID = 1L;
	
	
	long ipFrom;
	long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	
	public IPAddress(long ipFrom, long ipTo, String countryCode, String countryName, String regionName,
			String cityName) {
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.cityName = cityName;
	}
		

	@Override
	public String toString(){  
		  return "\"" + this.ipFrom+"\""+ ", "+"\""+this.ipTo+"\""+ ", "+"\""+this.cityName+"\""+ ", "+"\""+this.countryCode+"\""+ ", "+"\""+this.countryName+"\""+ ", "+"\""+this.regionName+"\""+ "\n";  
		 }  
	
	public int compareTo(IPAddress that) {
		  if (this.ipFrom > that.ipFrom ) {                                      
		        return 1;                                                   
		    } else if (this.ipFrom  < that.ipFrom ) {                               
		        return -1;                                                  
		    } else {                                                        
		        return 0;                                                   
		    }
	}
}
