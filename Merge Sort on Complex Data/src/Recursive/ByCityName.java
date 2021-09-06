package Recursive;

import java.util.Comparator;

public class ByCityName  implements Comparator<IPAddress> {
	public int compare(IPAddress v, IPAddress w) {
		return v.getCityName().compareTo(w.getCityName());
	}

}
