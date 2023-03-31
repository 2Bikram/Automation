package com.ssid.test.didTransaction;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ssid.base.Base;

import io.appium.java_client.MobileBy;

public class DidTransaction extends Base {
	
	@Test
	public void didTrasaction()  {
		try {
			fistDevice();
			wt = new WebDriverWait(ad, (80));
		    wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
		    wt.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(User1id);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Lpassword)).sendKeys(User1psw);
			wt.until(ExpectedConditions.visibilityOfElementLocated(LoginBotten)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Next)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).sendKeys(User1MNEMONICS);
			wt.until(ExpectedConditions.visibilityOfElementLocated(lSubmit)).click();
			for (int i = 1; i < 7; i++) {
	            wt.until(ExpectedConditions
	                    .visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text=\"" + i + "\"]")))
	                    .click();
			}
			wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
			for (int i = 1; i < 7; i++) {
	            wt.until(ExpectedConditions
	                    .visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text=\"" + i + "\"]")))
	                    .click();
			}
			wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Trasaction)).click();
			try {
				wt.until(ExpectedConditions.visibilityOfElementLocated(d1permision)).click();
			}catch(Exception e) {
				wt.until(ExpectedConditions.visibilityOfElementLocated(d2permition)).click();	
			}
			Thread.sleep(3000);
			wt.until(ExpectedConditions.visibilityOfElementLocated(To)).sendKeys(User2did);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Amount)).sendKeys(amt1);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Memo)).sendKeys("Testing");
			Thread.sleep(1000);
			wt.until(ExpectedConditions.visibilityOfElementLocated(SendMoney)).click();
			pin();
			wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();			 
			wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
			
		}catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		
		
	}
	
	@Test
	public void awalletOpen() {
		try {
			SecondDevice();
			wt1 = new WebDriverWait(ad2, (70));
			wt1.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			wt1.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(User2id);		
			ad2.findElement(Lpassword).sendKeys(User2psw);
			ad2.findElement(LoginBotten).click();
			wt1.until(ExpectedConditions.visibilityOfElementLocated(Next)).click();
			wt1.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).sendKeys(User2MNEMONICS);
			ad2.findElement(lSubmit).click();
			
			for (int i = 1; i < 7; i++) {
	            wt1.until(ExpectedConditions
	                    .visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text=\"" + i + "\"]")))
	                    .click();
			}
			wt1.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
			for (int i = 1; i < 7; i++) {
	            wt1.until(ExpectedConditions
	                    .visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text=\"" + i + "\"]")))
	                    .click();
			}
			wt1.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
			
			wt1.until(ExpectedConditions.visibilityOfElementLocated(wallet)).click();
			 
			 
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
	}
	
	

}
