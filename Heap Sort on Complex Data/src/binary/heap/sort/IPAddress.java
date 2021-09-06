package binary.heap.sort;

public class IPAddress implements Comparable<IPAddress> {
	
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
		

	public long getIpFrom() {
		return ipFrom;
	}


	public void setIpFrom(long ipFrom) {
		this.ipFrom = ipFrom;
	}


	public long getIpTo() {
		return ipTo;
	}


	public void setIpTo(long ipTo) {
		this.ipTo = ipTo;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getRegionName() {
		return regionName;
	}


	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
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
