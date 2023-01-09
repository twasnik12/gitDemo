package com.IRCTC.pages;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IRCTC.commons.TestBase;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
//import captcha.ITesseract;
//import captcha.Tesseract;
import net.sourceforge.tess4j.Tesseract1;

public class LoginPage extends TestBase {

	TestBase t = new TestBase();
	@FindBy(xpath="//button[normalize-space()='OK']")
	WebElement OkAlert;
	
	@FindBy(xpath="//a[@aria-label='Click here to Login in application']")
	WebElement LoginButton;
	
//	@FindBy(xpath="")
	
	public LoginPage()
	{
		PageFactory.initElements(t.driver, this);//
	}
	
	public void Login() throws Exception
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		
		//ChromeDriver driver=new ChromeDriver(options);
		OkAlert.click();
		
		LoginButton.click();
		driver.findElement(By.xpath("//input[@id='7117987']"));
		Thread.sleep(10000);
		
		//to get text 
		/*String wb = driver.findElement(By.xpath("(//img[contains(@src,'https://irctclive.nlpcaptcha.in/index.php/media')])[2]")).getText();
		System.out.println(wb);
		driver.findElement(By.id("nlpAnswer")).sendKeys(wb);*/
		
//		File src = driver.findElement(By.xpath("(//img[contains(@src,'https://irctclive.nlpcaptcha.in/index.php/media')])[2]")).getScreenshotAs(OutputType.FILE);
//		
//		String path = System.getProperty("C:\\Users\\lenovo\\eclipse-workspace\\IRCTC-CaptchaHandeling\\Reports\\captcha.png");
//		FileHandler.copy(src, new File("path"));
//		//FileHandler.copy (src, File ("path"));
//		
//		ITesseract image = new Tesseract();
//		//String imageText = image.doOCR(src);
//		String imageText = image.doOCR(new File(path));
//		String finalText = imageText.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println("Final Captcha is "+finalText);
//			
//		//String finalText = imageText.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
//		//System.out.println("Final Captcha is "+finalText);
		
		
		
		
		
		try{
			
			WebElement imageelement = driver.findElement(By.xpath("(//*[@id='nlpImgContainer']//following::img)[2]"));
		File src= imageelement.getScreenshotAs(OutputType.FILE);
		String path="H:\\IRCTC Project\\IRCTC\\IRCTC-CaptchaHandeling\\captchaimages\\captcha.png";
		FileHandler.copy(src,new File(path));
		Thread.sleep(5000);
		ITesseract image = new Tesseract();
		String str = image.doOCR(new File(path));
		System.out.println("Final Captcha is ");
		System.out.println(str);
		String Captcha =str.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Final Captcha is "+Captcha);
	}
	catch(Exception e) {System.out.println("Exception caught:"  +e.getMessage());
	}
}
}
