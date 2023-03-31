package com.ssid.base;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.devices.Devices;
import io.appium.java_client.MobileBy;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends Devices {
	
	protected String otp;
	protected String app = fl.replaceAll("/Users/squbix/Desktop/cros_platform _did trasaction/com.didTransaction2/../", "");
	protected String NewEnemonics;
	
	protected By skip = MobileBy.xpath("//android.widget.TextView[@text=\">> Skip\"]");
	protected By register = MobileBy.xpath("//android.widget.TextView[@text=\"Register\"]");
	protected By individual = MobileBy.AccessibilityId("Individual");
	protected By createProfile = MobileBy.xpath("//android.widget.TextView[@text=\"Next\"]");
	protected By accept = MobileBy.xpath("//android.widget.TextView[@text=\"Accept\"]");
	protected By Cemail = MobileBy.AccessibilityId("Email");
	protected By Cpassword = MobileBy.AccessibilityId("Password");
	protected By CCpassword = MobileBy.AccessibilityId("ConfirmPassword");
	protected By Cprofile = MobileBy.xpath("//android.widget.TextView[@text=\"Create Profile\"]");
	protected By cContinue = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]");
	private By rEmail = MobileBy.xpath("//android.widget.EditText[@content-desc=\"Email\"]");
	private By rPassword = MobileBy.xpath("//android.widget.EditText[@content-desc=\"Password\"]");
	private By rLogin = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]");
	protected By Videntity = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]");	//android.view.ViewGroup[@content-desc="Next"]
	protected By Vcontinue = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]");
	
	private By Ifastname = MobileBy.AccessibilityId("Givenname");
	private By Ilastname = MobileBy.AccessibilityId("familyName");
	private By Idob = MobileBy.AccessibilityId("DOB");
	private By Iok = MobileBy.id("android:id/button1");
	private By Imob = MobileBy.AccessibilityId("PhoneNumber");
	private By Icity = MobileBy.xpath("//android.widget.EditText[@text=\"City\"]");
	private By Iprovinces = MobileBy.AccessibilityId("province");
	private By ICountry = MobileBy.AccessibilityId("Country");
	private By Ipin = MobileBy.xpath("//android.widget.EditText[@text=\"Zip code\"]");
	private By Raddress = MobileBy.AccessibilityId("Address");
	private By IDType = MobileBy.AccessibilityId("IDType");
	private By passport = MobileBy.xpath("//android.widget.TextView[@text=\"Passport\"]");
	private By IDNumber = MobileBy.AccessibilityId("IDNumber");
	private By IDExp = MobileBy.AccessibilityId("IDExp");
	private By SubmitId = MobileBy.AccessibilityId("SubmitId");
	private By iTakePhoto = MobileBy.xpath("//android.widget.TextView[@text=\"Take Photo\"]"); 
	private By pm = MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	private By Shutter = MobileBy.AccessibilityId("Shutter");
	private By SubmitSelfie = MobileBy.AccessibilityId("SubmitSelfie");
	private By IFSubmit = MobileBy.AccessibilityId("Submit");
	private By ExitApp = MobileBy.AccessibilityId("ExitApp");
	private By capture = MobileBy.AccessibilityId("Done");
	private By Exit = MobileBy.id("android:id/button1");
	
	protected By Lemail = MobileBy.AccessibilityId("Email");
	protected By Lpassword = MobileBy.AccessibilityId("Password");
	protected By LoginBotten = MobileBy.xpath("//android.widget.TextView[@text=\"Login\"]"); 
	protected By Next = MobileBy.AccessibilityId("Next");
	protected By Enemonics = MobileBy.AccessibilityId("Enemonics");
	protected By lSubmit = MobileBy.AccessibilityId("Submit");
	protected By fSubmit = MobileBy.AccessibilityId("Submit");
	protected By wallet = MobileBy.xpath("//android.widget.TextView[@text=\"Wallet\"]");
	protected By Trasaction = MobileBy.xpath("//android.widget.TextView[@text=\"Payment\"]");
	protected By d2permition = MobileBy.id("com.android.packageinstaller:id/permission_allow_button");
	protected By d1permision = MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	protected By tOk = MobileBy.id("android:id/button1");
	protected By To = MobileBy.AccessibilityId("To");
	protected By Amount = MobileBy.AccessibilityId("Amount");
	protected By Memo = MobileBy.AccessibilityId("Memo");
	protected By SendMoney = MobileBy.AccessibilityId("SendMoney");
	protected By forgot = MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"PasteEnemonics\"])[2]");
	protected By Submitid = MobileBy.AccessibilityId("Submitid");
	protected By TakePhoto = MobileBy.xpath("//android.widget.TextView[@text=\"Take Photo\"]");
	protected By cAllow = MobileBy.xpath("//android.widget.Button[@text=\"While using the app\"]");
	protected By click = MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]");
	protected By done = MobileBy.AccessibilityId("Done");
	protected By submitSelfie = MobileBy.AccessibilityId("Submitselfie");
	protected By reason = MobileBy.xpath("//android.widget.EditText[@content-desc=\"Reason\"]");
	protected By otpSubmit = MobileBy.AccessibilityId("Confirm");
	protected By Continue = MobileBy.id("android:id/button1");	// android:id/button1
	protected By checkbox = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Checkbox\"]");
	protected By submit = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]");
	protected By DIDName = MobileBy.AccessibilityId("DIDName");
	protected By View = MobileBy.xpath("(//button[(text()='View')])[1]");
	protected By rNext = MobileBy.xpath("//android.widget.TextView[@text=\"Next\"]");
	
 

	public void pin() {
		try {
			for (int i = 1; i < 7; i++) {
	            wt.until(ExpectedConditions
	                    .visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text=\"" + i + "\"]")))
	                    .click();
			}
        }catch(Exception e) {
        	
        	e.printStackTrace();
		}
		
	}
	
//	@Test
	public void N_otp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://mailsac.com/");
		driver.findElement(By.xpath("//input[@ng-model='myinbox']")).sendKeys(id);
		driver.findElement(By.xpath("//button[@ng-click='navToInbox(myinbox, postfix)']")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div[2]/div/table/tbody/tr[2]")).click();
		otp = driver.findElement(By.xpath("//div[@ng-if='msg.body']")).getText();
		otp = otp.replaceAll("[^0-9]", "");
		otp = StringUtils.left(otp, 6);
		System.out.println("the otp is: "+otp);
		driver.quit();
       
	}
	
	
//	@Test
	public void submitOtp() throws InterruptedException {
		char[] totp = otp.toCharArray();
		System.out.println("inside sOtp");
		ad.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Input\"]"));
		for (int i = 0; i < totp.length; i++) {
            wt.until(ExpectedConditions.visibilityOfElementLocated(
                    MobileBy.xpath("//android.widget.EditText[@resource-id=\"otpInput-" + i + "\"]")))
                    .sendKeys(totp[i] + "");
        	}
		ad.findElement(otpSubmit).click();
		if(app.equals("MetaMUI SSID.apk")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(Continue)).click();
		}else if(app.equals("CBDC SSID Token chain.apk")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(cContinue)).click();
		}
	}
	
	
	
	public void restoreAcApproval() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		System.out.println("app: "+app);
		if( app.equals("MetaMUI SSID.apk")) {
			Lurl = "https://swn-admin.metamui.network/login";
			Lid = "sineco2666@ekbasia.com";
			Lpsw = "Sahoo@123";
		}else if(app.equals("CBDC SSID Token chain.apk")) {
			Lurl = "https://new-blockchain-cbdc-admin.web.app/login";
			Lid = "lirat18201@fandua.com";
			Lpsw = "Nishant@2";
		}
		System.out.println("admin url: "+Lurl);
		System.out.println("admin id: "+Lid);
		System.out.println("admin password: "+Lpsw);
		Thread.sleep(3000);
		driver= new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(Lurl);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Lid);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Lpsw);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[(text()='Restore Account Request')]")).click();
		Thread.sleep(3000);
		driver.findElement(View).click();
		Thread.sleep(3000);
		Actions at = new Actions(driver);
	    at.sendKeys(Keys.PAGE_DOWN).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[(text()='Accept')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[(text()='Confirm')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[(text()='OK')]")).click();
	    driver.quit();
	    
	}
	
	public void newLogin() {
		wt.until(ExpectedConditions.visibilityOfElementLocated(rEmail)).sendKeys(mail);
		ad.findElement(rPassword).sendKeys(mpassword);
		ad.findElement(rLogin).click();
	}
	
	public void identityForm() {
		try {
			wt = new WebDriverWait(ad, (60));
			System.out.println("insude form");
			wt.until(ExpectedConditions.visibilityOfElementLocated(Ifastname)).sendKeys("Biki");
			wt.until(ExpectedConditions.visibilityOfElementLocated(Ilastname)).sendKeys("n");
			wt.until(ExpectedConditions.visibilityOfElementLocated(Idob)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Iok)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Icity)).sendKeys("bbsr");
			wt.until(ExpectedConditions.visibilityOfElementLocated(ICountry)).sendKeys("India");
			wt.until(ExpectedConditions.visibilityOfElementLocated(Ipin)).sendKeys("751001");
			wt.until(ExpectedConditions.visibilityOfElementLocated(Imob)).sendKeys("1234567890");
			wt.until(ExpectedConditions.visibilityOfElementLocated(Iprovinces)).sendKeys("odisa");
			wt.until(ExpectedConditions.visibilityOfElementLocated(Raddress)).sendKeys("bbs");
					
			ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Submit\").instance(0))")).click();
			
			wt.until(ExpectedConditions.visibilityOfElementLocated(IDType)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(passport)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(IDNumber)).sendKeys(id);
			wt.until(ExpectedConditions.visibilityOfElementLocated(IDExp)).sendKeys("123458678");
			wt.until(ExpectedConditions.visibilityOfElementLocated(SubmitId)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(pm)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Shutter)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(capture)).click();
			
			wt.until(ExpectedConditions.visibilityOfElementLocated(SubmitSelfie)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(iTakePhoto)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Shutter)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(capture)).click();
			
			wt.until(ExpectedConditions.visibilityOfElementLocated(IFSubmit)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(ExitApp)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Exit)).click();
				
		}catch(Exception e){
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
//	@Test
	public void accApproval() throws InterruptedException {
		
		app = fl.replaceAll("/Users/squbix/Desktop/cros_platform _did trasaction/com.didTransaction2/../", "");
		System.out.println("app: "+app);
		if( app.equals("MetaMUI SSID.apk")) {
			Lurl = "https://swn-admin.metamui.network/login";
			Lid = "sineco2666@ekbasia.com";
			Lpsw = "Sahoo@123";
		}else if(app.equals("CBDC SSID Token chain.apk")) {
			Lurl = "https://new-blockchain-cbdc-admin.web.app/login";
			Lid = "lirat18201@fandua.com";
			Lpsw = "Nishant@2";
		}
		System.out.println("admin url: "+Lurl);
		System.out.println("admin id: "+Lid);
		System.out.println("admin password: "+Lpsw);
		Thread.sleep(3000);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Lurl);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Lid);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Lpsw);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[(text()='Individual')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[(text()='View')])[1]")).click();
		Thread.sleep(3000);
		Actions at = new Actions(driver);
	    at.sendKeys(Keys.PAGE_DOWN).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[(text()='Approve')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[(text()='OK')]")).click();
	    driver.quit();
	}
	
	
	
	
}
