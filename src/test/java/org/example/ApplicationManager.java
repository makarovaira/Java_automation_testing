package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    FirefoxDriver driver;
    private NavigationHelper navigationHelper;
    private LoginHelper loginHelper;
    private NoteHelper groupHelper;

    public Map<String, Object> vars;
    JavascriptExecutor js;

    private static final ThreadLocal<ApplicationManager> manager = new ThreadLocal<ApplicationManager>();


    public static ApplicationManager getInstance() {
        if (manager.get() != null) {
            return manager.get();
        }

        ApplicationManager newInstance = new ApplicationManager();
        manager.set(newInstance);
        newInstance.setUp();
        return newInstance;
    }

    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
        String baseUrl = "https://accounts.zoho.com/signin?servicename=notebook&signupurl=https://www.zoho.com/notebook/signup.html";
        navigationHelper = new NavigationHelper(this, baseUrl);
        groupHelper = new NoteHelper(this);
        loginHelper = new LoginHelper(this);

    }

    public void tearDown() {
        driver.quit();
    }


    public NoteHelper noteHelper() {
        return groupHelper;
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }

    public LoginHelper login() {
        return loginHelper;
    }
}
