package com.winium.demo.winiumDemo;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public DesktopOptions options = new DesktopOptions();

    @BeforeTest
     public void SetUp() throws InterruptedException, IOException {
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
   }
	
	@Test
	public void WiniumBaseTest()
	{
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
        driver.findElementById("num8Button").click();	
        }
}
