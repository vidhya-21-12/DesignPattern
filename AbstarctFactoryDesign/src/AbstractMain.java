
public class AbstractMain {
	
	 public static void main(String[] args) {
	        
		 AbstractFactory abstractFactory;
	        
	        //creating a brown toy dog
	        abstractFactory = AbstractFactoryProvider.getFactory("Animal");
	        Animal animal =(Animal) abstractFactory.create("Duck");
	        
	        String result = animal.makeSound();
	        
	        System.out.println(result);
	    }

}
