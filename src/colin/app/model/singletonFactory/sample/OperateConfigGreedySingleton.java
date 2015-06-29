package colin.app.model.singletonFactory.sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import colin.app.test.Hello;

public class OperateConfigGreedySingleton {

	private static OperateConfigGreedySingleton singleton=new OperateConfigGreedySingleton();
	
	private OperateConfigGreedySingleton(){
		
	}
	public static OperateConfigGreedySingleton getInstance(){
		return singleton;
	}
	public String readConfigFileAttr(String attrname) throws IOException{
		//加载文件
		InputStream fileSource=OperateConfigGreedySingleton.class.getResourceAsStream("file/log4j.properties");
		Properties properties=new Properties();
		properties.load(fileSource);
		return properties.getProperty(attrname);
	}
	public static void main(String[] args) {
		OperateConfigGreedySingleton singleton1=OperateConfigGreedySingleton.getInstance();
		System.out.println(singleton1.toString());
		OperateConfigGreedySingleton singleton2=OperateConfigGreedySingleton.getInstance();
		System.out.println(singleton2.toString());
		try {
			System.out.println(singleton1.readConfigFileAttr("log4j.root"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Hello str1=new Hello();
		Hello str2=new Hello();
		System.out.println(str1.toString()+"---"+str2.toString());
	}
}
