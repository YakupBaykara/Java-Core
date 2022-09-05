package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Driver {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		try {
			Class calisan = Class.forName("Reflection.Calisan");
			
			Constructor[] constructors = calisan.getConstructors();
			Constructor[] declaredConstructors = calisan.getDeclaredConstructors();
			
			Field[] fields = calisan.getFields();
			Field[] declaredFields = calisan.getDeclaredFields();
			
			Method[] methods = calisan.getMethods();
			Method[] declaredMethods = calisan.getDeclaredMethods();
			
			for(Constructor c : constructors) {
				System.out.println("Constructor : " + c.getName());
			}
			
			for(Constructor c : declaredConstructors) {
				System.out.println("Declared Constructor : " + c.getName());
			}
			
			for(Field f : fields) {
				System.out.println("Field : " + f.getName());
			}
			
			for(Field f : declaredFields) {
				System.out.println("Declared Field : " + f.getName());
			}
			
			for(Method m : methods) {
				System.out.println("Method : " + m.getName());
			}
			
			for(Method m : declaredMethods) {
				System.out.println("Declared Method : " + m.getName());
			} 
 			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
