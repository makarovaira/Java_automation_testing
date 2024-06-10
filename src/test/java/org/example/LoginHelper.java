package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;


public class LoginHelper extends HelperBase {

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }

    public void clickNextButton() {
        driver.findElement(By.id("nextbtn")).click();
    }

    public void InputLogin(LoginData user) throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1552, 928));
        driver.findElement(By.id("login_id")).sendKeys(user.getName());
        Thread.sleep(10000);
        clickNextButton();
    }

    public void InputPassword(LoginData user) throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1552, 928));
        driver.findElement(By.id("password")).sendKeys(user.getPassword());
        Thread.sleep(10000);
        clickNextButton();
    }
}
