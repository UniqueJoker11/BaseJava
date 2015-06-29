package colin.app.reflect;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import colin.app.test.Hello;

public class ReflectionTest {

	public void sayHello(String name){
		System.out.println("welcome come to park! "+name);
	}
	public static void main(String[] args) {
		MethodType my=MethodType.methodType(void.class,String.class);
		try {
			MethodHandle handler=MethodHandles.lookup().findVirtual(ReflectionTest.class, "sayHello", my);
			handler.invoke(Class.forName("colin.app.reflect.ReflectionTest").newInstance(),"joker");
			handler.invokeWithArguments("joker");
		} catch (NoSuchMethodException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
