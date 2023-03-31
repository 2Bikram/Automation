package com.ssid.test;

import java.io.InputStream;
import java.util.Collections;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;




public class TestRunner {
	
	static TestNG testNg;
	public static void main (String[] args) throws Exception {
		
		InputStream is = TestRunner.class.getClassLoader().getResourceAsStream("testng.xml");
		System.out.println("is: "+is);
		Parser ps = new Parser(is);
		XmlSuite st = ps.parseToList().get(0);
		System.out.println("ps: "+ps);
		
		testNg = new TestNG();
		
		testNg.setXmlSuites(Collections.singletonList(st));
		
		testNg.run();
		
	}

}


//static File file;
//static TestNG testNg;
//public static void main (String[] args) throws Exception {
//	
//	InputStream is = TestRunner.class.getClassLoader().getResourceAsStream("testng.xml");
//	Parser ps = new Parser(is);
//	XmlSuite st = ps.parseToList().get(0);
//	
//	testNg = new TestNG();
//	
//	testNg.setXmlSuites(Collections.singletonList(st));
//	
//	testNg.run();
//	
//}

















