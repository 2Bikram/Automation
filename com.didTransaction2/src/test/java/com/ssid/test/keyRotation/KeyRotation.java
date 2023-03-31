package com.ssid.test.keyRotation;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.Base;

import io.appium.java_client.MobileBy;

public class KeyRotation extends Base {
	
	@Test(priority=1)
	public void forgoteEnemonics() {
		try {
			fistDevice();
			wt = new WebDriverWait(ad, (70));
			wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(mail);		
			ad.findElement(Lpassword).sendKeys(mpassword);
			ad.findElement(LoginBotten).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Next)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(forgot)).click();			
			wt.until(ExpectedConditions.visibilityOfElementLocated(Submitid)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(cAllow)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(click)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(done)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(submitSelfie)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(click)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(done)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(reason)).sendKeys("Testing");
			wt.until(ExpectedConditions.visibilityOfElementLocated(lSubmit)).click();
			N_otp();
			submitOtp();
			restoreAcApproval();
			
			
		}catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void setEnemonics() {
		SecondDevice();
		wt1 = new WebDriverWait(ad2, (70));
		wt1.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
		wt1.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(mail);		
		ad2.findElement(Lpassword).sendKeys(mpassword);
		ad2.findElement(LoginBotten).click();
		wt1.until(ExpectedConditions.visibilityOfElementLocated(rNext)).click();
		NewEnemonics = wt1.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).getText();
		System.out.println("Enemonics is: "+NewEnemonics);
		wt1.until(ExpectedConditions.visibilityOfElementLocated(checkbox)).click();
		ad2.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Submit\").instance(0))")).click();
		
		for(int p=0; p<2;p++) {
			for (int i= 1; i<=6; i++) {
	            wt1.until(ExpectedConditions
	                    .visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text=\"" + i + "\"]")))
	                    .click();
			}
			wt1.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
		}
		
	}
	
	
}
