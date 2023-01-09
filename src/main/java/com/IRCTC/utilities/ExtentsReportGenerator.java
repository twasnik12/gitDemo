package com.IRCTC.utilities;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReportGenerator {


public static  ExtentReports extent;

public static ExtentReports extentreprts() {

//String str=System.getProperty("user.dir")+"/test-output/Extent.html";
String str="C:\\Users\\lenovo\\eclipse-workspace\\IRCTC-CaptchaHandeling\\Reports";
//String str=System.getProperty("C:\\Users\\hp\\Desktop\\Testing\\mavenprjt\\ServiceNow ATF Scripts\\InHouse Project\\SN-POC\\test-output\\SCREENSOT");
ExtentSparkReporter reporter=new ExtentSparkReporter(str);

reporter.config().setDocumentTitle("service now project");
reporter.config().setReportName("service now Report");
reporter.config().setTheme(Theme.STANDARD);

ExtentReports extent = new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("Project Name", "Service Now");
extent.setSystemInfo("User Name" ,"Tathagat Wasnik");
extent.setSystemInfo("EmpId", "CZ107");
extent.setSystemInfo("Environment", "Automation Testing");

return extent;
}
}