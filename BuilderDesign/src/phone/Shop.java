package phone;

public class Shop{ 
	
	public static void main(String args[])
	{
		Phone phone = new PhoneBuilder().set0s("Android").setRam(2). setProcessor("Icore"). setBattery(30). setScreenSize(4.5).getPhone();

	    System.out.println(phone);
	}
	
	
}


