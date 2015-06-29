package colin.app.reflect;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import colin.app.bean.Car;

public class CarReflectionClass {

	public static void main(String[] args) {
		ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
		try {
			Class carClass=classLoader.loadClass("colin.app.bean.Car");
			ClassLoader loader=carClass.getClassLoader();
			/*loader.getSystemClassLoader().*/
			System.out.println("自加载器"+carClass.getClassLoader());
			System.out.println("父加载器"+carClass.getClassLoader().getParent());
			System.out.println("顶层加载器"+carClass.getClassLoader().getParent().getParent());
			//获取类的默认构造函数对象并通过它实例化Car
			Constructor contructor=carClass.getDeclaredConstructor((Class[])null);
			Car car=(Car) contructor.newInstance();
			//通过反射方法设置属性
			Method setName=carClass.getMethod("setName",String.class);
			setName.invoke(car, "宝马");
			Method setBrand=carClass.getMethod("setBrand", String.class);
			setBrand.invoke(car, "BMW");
			System.out.println("汽车的名字是"+car.getName()+";汽车的品牌是"+car.getBrand());
			//采用另一种较新的方式注入方法值
			MethodType setNameType=MethodType.methodType(void.class, String.class);
			MethodHandle setNameHandler=MethodHandles.lookup().findVirtual(carClass,"setName", setNameType);
			//私有变量不能使用该方法，
			//MethodHandle setNameHandler2=MethodHandles.lookup().findSetter(carClass, "name", String.class);
			setNameHandler.invokeExact(car,"宝马");
			System.out.println(car.getName());
			MethodType getNameType=MethodType.methodType(String.class);
			MethodHandle getMethodHandle=MethodHandles.lookup().findVirtual(carClass, "getName", getNameType);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
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
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
