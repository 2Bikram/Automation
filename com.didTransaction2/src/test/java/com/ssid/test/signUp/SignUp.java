package com.ssid.test.signUp;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.Base;

public class SignUp extends Base {
	
	@Test
	public void Signup() {
		try {
			fistDevice();
			wt = new WebDriverWait(ad, (80));
			wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(register)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(individual)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(createProfile)).click();
			for(int i=0;i<2;i++) {
				wt.until(ExpectedConditions.visibilityOfElementLocated(accept)).click();
			}
			wt.until(ExpectedConditions.visibilityOfElementLocated(Cemail)).sendKeys(mail);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Cpassword)).sendKeys(mpassword);
			wt.until(ExpectedConditions.visibilityOfElementLocated(CCpassword)).sendKeys(mpassword);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Cprofile)).click();
			Thread.sleep(2000);
			N_otp();
			submitOtp();
			newLogin();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Videntity)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Vcontinue)).click();
			identityForm();
			accApproval();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
