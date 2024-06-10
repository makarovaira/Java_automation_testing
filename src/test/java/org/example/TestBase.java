package org.example;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    protected ApplicationManager manager = ApplicationManager.getInstance();

//    @Before
//    public void setUp(){
//        manager.setUp();
//    }
//
//    @After
//    public void tearDown() {
//        manager.tearDown();
//    }

//    public void createNote() throws InterruptedException {
//        Thread.sleep(20000);
//        driver.findElement(By.cssSelector(".iplus")).click();
//        Thread.sleep(20000);
//        driver.findElement(By.cssSelector(".row:nth-child(3) > .color-white-strict")).click();
//    }
}
