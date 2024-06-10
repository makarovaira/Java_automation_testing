package org.example;

import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver driver;
    protected ApplicationManager manager;

    public HelperBase(ApplicationManager manager){
        this.manager = manager;
        this.driver = manager.driver;
    }

}
