package colin.app.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	private List<String> testList=new LinkedList<String>();
	
	public ListTest(){
		//String str1="232",str2="3re",str3="3r42r2",str4="fefgaer2",str5="dewfwe",str6="r43aew",str7="dewd2",str8="dwedQW",str9="DWQD",str10="r43awezf";
		for(int i=1;i<11;i++){
			testList.add(String.valueOf(i));
		}
	}
	public void testIterator(){
		Iterator<String> iterator=this.testList.iterator();
		while(iterator.hasNext()){
			String parStr=iterator.next();
			String chilStr=iterator.next();
			System.out.println(parStr+"---"+chilStr);
		}
	}
	public static void main(String[] args) {
		ListTest listTest=new ListTest();
		listTest.testIterator();
	}
}
