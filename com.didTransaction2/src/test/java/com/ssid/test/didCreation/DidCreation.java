package com.ssid.test.didCreation;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.Base;

import io.appium.java_client.MobileBy;

public class DidCreation extends Base {
	
	protected String did;
	@Test
	public void didCreation() {
		try {
			fistDevice();
			wt = new WebDriverWait(ad, (80));
			System.out.println("Login id: "+mail);
			System.out.println("Password: "+mpassword);
			wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(mail);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Lpassword)).sendKeys(mpassword);
			wt.until(ExpectedConditions.visibilityOfElementLocated(LoginBotten)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Videntity)).click();
			NewEnemonics = wt.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).getText();
			System.out.println("Enemonics: "+NewEnemonics);
			wt.until(ExpectedConditions.visibilityOfElementLocated(checkbox)).click();
			ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Submit\").instance(0))")).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(DIDName)).sendKeys(id);
			wt.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();
			for(int i=0; i<2;i++) {
				pin();
				wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
			}
			System.out.println("New DID: did:ssid:"+id);
			System.out.println();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
