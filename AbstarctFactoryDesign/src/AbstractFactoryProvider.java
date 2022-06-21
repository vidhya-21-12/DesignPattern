
public class AbstractFactoryProvider {
	
public static AbstractFactory getFactory(String choice){
        
        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else{
        	return null;
        }
    }

}
