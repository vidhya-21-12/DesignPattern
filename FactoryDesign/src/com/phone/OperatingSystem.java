package com.phone;

public class OperatingSystem {
	public Os getInstance(String str) {
    if(str.equals("open"))
        return new Android();
    else if(str.equals("Closed"))
    	return new IOS();
    else
        return new Windows();
}

}
