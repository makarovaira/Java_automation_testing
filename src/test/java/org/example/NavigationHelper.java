package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class NavigationHelper extends HelperBase {

    private final String baseUrl;

    public NavigationHelper(ApplicationManager manager, String baseUrl) {
        super(manager);
        this.baseUrl = baseUrl;
    }

    public void OpenHomePage() {
        driver.get("https://accounts.zoho.com/signin?servicename=notebook&signupurl=https://www.zoho.com/notebook/signup.html");
        driver.manage().window().setSize(new Dimension(550, 697));
    }

//    public void clickNextButton() {
//        driver.findElement(By.id("nextbtn")).click();
//    }
}
