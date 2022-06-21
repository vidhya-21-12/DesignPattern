
import com.phone.Android;
import com.phone.OperatingSystem;
import com.phone.Os;
import com.phone.Windows;

public class FactoryMain {
	
	public static void main(String args[]) {
		
		
		OperatingSystem os = new OperatingSystem();
		Os obj = os.getInstance("open");
		obj.specs();
		
	}

}
