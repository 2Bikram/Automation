package com.ssid.test.didTransaction;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.Base;

import io.appium.java_client.MobileBy;

public class WalletRestore extends Base {
	
	@Test
	public void walletOpen() {
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
			for(int i=0; i<2;i++) {
				for (int p = 1; p < 7; p++) {
		            wt.until(ExpectedConditions
		                    .visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text=\"" + i + "\"]")))
		                    .click();
				}
				wt1.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
			}
			 wt1.until(ExpectedConditions.visibilityOfElementLocated(wallet)).click();
			 
			 
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
	}
}
