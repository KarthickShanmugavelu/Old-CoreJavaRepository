package javaReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestingReflection {

	public static void main(String[] args) {

		Class reflectClass = UFOEnemyShip.class;
		String className = reflectClass.getSimpleName();
		System.out.println("Getting class name using JAVA reflection:" +className);
		
		int classModifier = reflectClass.getModifiers();
		
		System.out.println(Modifier.isPublic(classModifier));
		
		Class[] interfacesList=reflectClass.getInterfaces();
		
		
		System.out.println("List of Interfaces:");
		for(Class interface1:interfacesList) {
			System.out.println(interface1.getSimpleName());
		}
		
		Class baseClass=reflectClass.getSuperclass();
		
		System.out.println("Base class: "+baseClass.getSimpleName());
		
		System.out.println("Getting methods");
		
		Method[] methods = reflectClass.getMethods();
		
		for(Method method:methods) {
			
			String methodName = method.getName();
			if(methodName.startsWith("get"))
				System.out.println("This is a getter method Method name: "+methodName+" and Return Type: "+method.getReturnType());
			else if(methodName.startsWith("set"))
				System.out.println("This is a setter method Method name: "+methodName+" and Return Type: "+method.getReturnType());
			else
				System.out.println("This is a normal method Method name: "+methodName+" and Return Type: "+method.getReturnType());
			
			System.out.println("The methods Parameters are");
			Class[] paramterTypes = method.getParameterTypes();
			for(Class paramterType:paramterTypes) {
				System.out.println("Parameter name: "+paramterType.getSimpleName());
				System.out.println("Paramter type: "+paramterType.getTypeName());
			}
			
		}
		
		System.out.println("****Constructors****");
		Constructor[] constructors = reflectClass.getConstructors();
		for(Constructor constructor:constructors) {
			System.out.println(constructor.getName());
		}
		
		System.out.println("Accessing single construtor and manipulating that");
		Constructor constructor,constructor1 = null;
		Object object,object1 = null;
		EnemyShip e1 = new EnemyShip();
		try {
			constructor = reflectClass.getConstructor(EnemyShip.class);
			constructor1=reflectClass.getConstructor(int.class,String.class);
			System.out.println("Accessed an explicit constructor"+constructor.getName()+" , "+constructor1.getName());
			
			System.out.println("Accessing parameterTypes of above constructors");
			Class[] ptype = constructor.getParameterTypes();
			Class[] ptype2 = constructor1.getParameterTypes();
			for(Class ptype1:ptype) {
				System.out.println(ptype1);
			}
			for(Class ptype3:ptype2) {
				System.out.println(ptype3);
			}
			System.out.println("Creating objects using accessed constructors");
			object = constructor.newInstance(e1);
			object1 = constructor1.newInstance(12,"Age");
			
			System.out.println("Objects created using accesed constructors: "+object+", "+object1);
			
			System.out.println("Casting created objs to req objs");
			UFOEnemyShip u1 = null;
			u1= (UFOEnemyShip)object;
			u1.setName("VOC");
			System.out.println("The name set is: "+u1.getName());
			
			System.out.println("Accessing private fields");
			Field pfield = UFOEnemyShip.class.getDeclaredField("idcode");
			pfield.setAccessible(true);
			String pvalue = (String)pfield.get(object);
			System.out.println("Private Field Value is: "+pvalue);
			
			System.out.println("Accessing private methods");
			Method pmethod1 = UFOEnemyShip.class.getDeclaredMethod("pmethod", int.class);
			pmethod1.setAccessible(true);
			pmethod1.invoke(u1, 99);
			pmethod1 = UFOEnemyShip.class.getDeclaredMethod("getOtherPrivate", int.class,String.class);
			pmethod1.setAccessible(true);
			String str=(String)pmethod1.invoke(u1, 99,"Rand");
			System.out.println(str);
			
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
