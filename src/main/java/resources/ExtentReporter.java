    package resources;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class ExtentReporter {
		static 	ExtentReports extent;
		
		public static ExtentReports getReport()
		{
		//ExtentReports , ExtentSparkReporter
				String path=System.getProperty("user.dir")+"\\reports\\index.html";
				ExtentSparkReporter reporter=new ExtentSparkReporter(path);
				reporter.config().setReportName("Web Automation Results");
				reporter.config().setDocumentTitle("Test Results");
				
			    extent=new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Tester","Nikhil");
				return extent;
		}
		
	}



