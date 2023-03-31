package com.ssid.base.platform;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class platform {
	
	
	//Device1
	public String dn1;
	public String pn1;
	public int pv1;
	public String s1;
	
	//Device2
	public String dn2;
	public String pn2;
	public int pv2;
	public String s;
	
	//User1
	public String User1id;
	public String User1psw;
	public String User1did;
	public String User1MNEMONICS;
	public double User1;
	public String amt1;
	
	//User2
	public String User2id;
	public String User2psw;
	public String User2did;
	public String User2MNEMONICS;
	public double User2;
	public String amt2;
	
	protected File file =new File("../MetaMUI_SSID.apk");			// /Users/squbix/Desktop/cros_platform _did trasaction
	protected String fl = file.toURI().toString();
	
	protected String app;
	protected String Lurl;
	protected String Lid;
	protected String Lpsw;
	
	
//	public String id = User2id.replaceAll("@mailsac.com","");
	
	
	
	@SuppressWarnings("resource")
	@BeforeTest
	public void Excel() throws IOException {
//		System.out.println("file"+file);
		File f = new File("../Book.xlsx");
		String exl = f.toURI().toString();
		exl = exl.replaceAll("file:","" );
		System.out.println("excel path: "+exl);
		app = fl.replaceAll("file:/Users/squbix/Desktop/cros_platform_didTrasaction/com.didTransaction2/../", "");
		System.out.println("app: "+app);
		if( app.equals("MetaMUI_SSID.apk")) {
			System.out.println("app: "+app);
			FileInputStream fis = new FileInputStream(exl);
			XSSFWorkbook xsf = new XSSFWorkbook(fis);
			XSSFSheet sheet = xsf.getSheetAt(1);
			
			User1id = sheet.getRow(1).getCell(1).getStringCellValue();
			User1psw = sheet.getRow(2).getCell(1).getStringCellValue();
			User1did = sheet.getRow(3).getCell(1).getStringCellValue();
			User1MNEMONICS = sheet.getRow(4).getCell(1).getStringCellValue();
			User1 = (double) sheet.getRow(5).getCell(1).getNumericCellValue();
			amt1=Double.toString(User1);
			
			User2id = sheet.getRow(1).getCell(3).getStringCellValue();
			User2psw = sheet.getRow(2).getCell(3).getStringCellValue();
			User2did = sheet.getRow(3).getCell(3).getStringCellValue();
			User2MNEMONICS = sheet.getRow(4).getCell(3).getStringCellValue();
			User2 = (double) sheet.getRow(5).getCell(3).getNumericCellValue();
			amt2=Double.toString(User2);
			
			dn1 = sheet.getRow(7).getCell(1).getStringCellValue();
			pn1 = sheet.getRow(8).getCell(1).getStringCellValue();
			pv1 = (int) sheet.getRow(9).getCell(1).getNumericCellValue();
			s1=Integer.toString(pv1);
			
			dn2 = sheet.getRow(7).getCell(3).getStringCellValue();
			pn2 = sheet.getRow(8).getCell(3).getStringCellValue();
			pv2 = (int) sheet.getRow(9).getCell(3).getNumericCellValue();
			s=Integer.toString(pv2);
			
			System.out.println("");
			System.out.println();
			System.out.println(dn1);
			System.out.println(pn1);
			System.out.println(s1);
			
			System.out.println();
			System.out.println(dn2);
			System.out.println(pn2);
			System.out.println(s);
			
			System.out.println();
			System.out.println(User1id);
			System.out.println(User1psw);
			System.out.println(User1did);
			System.out.println(User1MNEMONICS);
			System.out.println("amount: "+amt1);
			
			System.out.println();
			System.out.println(User2id);
			System.out.println(User2psw);
			System.out.println(User2did);
			System.out.println(User2MNEMONICS);
			System.out.println("amount: "+amt2);
			
		}else if(app.equals("CBDC SSID Token chain.apk")) {
			System.out.println("app: "+app);
			FileInputStream fis = new FileInputStream(exl);
			XSSFWorkbook xsf = new XSSFWorkbook(fis);
			XSSFSheet sheet = xsf.getSheetAt(0);
			
			User1id = sheet.getRow(1).getCell(1).getStringCellValue();
			User1psw = sheet.getRow(2).getCell(1).getStringCellValue();
			User1did = sheet.getRow(3).getCell(1).getStringCellValue();
			User1MNEMONICS = sheet.getRow(4).getCell(1).getStringCellValue();
			User1 = (double) sheet.getRow(5).getCell(1).getNumericCellValue();
			amt1=Double.toString(User1);
			
			User2id = sheet.getRow(1).getCell(3).getStringCellValue();
			User2psw = sheet.getRow(2).getCell(3).getStringCellValue();
			User2did = sheet.getRow(3).getCell(3).getStringCellValue();
			User2MNEMONICS = sheet.getRow(4).getCell(3).getStringCellValue();
			User2 = (double) sheet.getRow(5).getCell(3).getNumericCellValue();
			amt2=Double.toString(User2);
			
			dn1 = sheet.getRow(7).getCell(1).getStringCellValue();
			pn1 = sheet.getRow(8).getCell(1).getStringCellValue();
			pv1 = (int) sheet.getRow(9).getCell(1).getNumericCellValue();
			s1=Integer.toString(pv1);
			
			dn2 = sheet.getRow(7).getCell(3).getStringCellValue();
			pn2 = sheet.getRow(8).getCell(3).getStringCellValue();
			pv2 = (int) sheet.getRow(9).getCell(3).getNumericCellValue();
			s=Integer.toString(pv2);
			
			System.out.println();
			System.out.println(dn1);
			System.out.println(pn1);
			System.out.println(s1);
			
			System.out.println();
			System.out.println(dn2);
			System.out.println(pn2);
			System.out.println(s);
			
			System.out.println();
			System.out.println(User1id);
			System.out.println(User1psw);
			System.out.println(User1did);
			System.out.println(User1MNEMONICS);
			System.out.println("amount: "+amt1);
			
			System.out.println();
			System.out.println(User2id);
			System.out.println(User2psw);
			System.out.println(User2did);
			System.out.println(User2MNEMONICS);
			System.out.println("amount: "+amt2);
		}

		
		
		
	}
	public String id;
	public String mail="biki914@mailsac.com";
	public String mpassword="Biki@123";
	
	@BeforeTest
	public void id() {
		id = mail.replaceAll("@mailsac.com","");
		System.out.println();
		System.out.println("id: "+id);
		System.out.println();
//		System.out.println("app: "+app);
	}
	
	
	
	
}
