package _01_properties;

import java.util.*;
import java.util.Properties;

public class T01_properties {

	public static void main(String[] args) {
		// properties : Map 계열 → 키 + 값 세트 저장
		// HashMap과의 차이 : Properties에는 키 = String, 값 = String으로 담는다.
		
		Properties prop = new Properties();
		
		// 1. 값을 추가할 때
		// setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		//2. key를 얻어올때
		// getProperty(String key)
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("aaa")); //키가 없기 때문에 null이 나옴.
		
		try { // store 저장한다는 뜻
			
			//파일로 내보내기
			/*prop.store(new FileOutputStream("test.properties"), "properties");
			
			prop.store(new FileOutputStream("test.xml"), "properties");*/
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}
		

	}

}
